package io.hustler.wallzy.activity;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.hustler.wallzy.R;
import io.hustler.wallzy.constants.WallZyConstants;
import io.hustler.wallzy.utils.MessageUtils;
import io.hustler.wallzy.utils.SharedPrefsUtils;
import io.hustler.wallzy.utils.TextUtils;

public class SettingsActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.message)
    TextView message;
    @BindView(R.id.daily_wall_switch)
    Switch dailyWallSwitch;
    @BindView(R.id.layout1)
    RelativeLayout layout1;
    @BindView(R.id.TimeGap)
    TextView TimeGap;
    @BindView(R.id.TimeGap_message)
    TextView TimeGapMessage;
    @BindView(R.id.TimeGap_value)
    TextView TimeGapValue;
    @BindView(R.id.layout2)
    RelativeLayout layout2;
    @BindView(R.id.wallCat)
    TextView wallCat;
    @BindView(R.id.wall_cat_message)
    TextView wallCatMessage;
    @BindView(R.id.wallcat_val)
    TextView wallcatVal;
    @BindView(R.id.layout3)
    RelativeLayout layout3;
    @BindView(R.id.onWifi_tv)
    TextView onWifiTv;
    @BindView(R.id.on_wifi_tv_message)
    TextView onWifiTvMessage;
    @BindView(R.id.on_wifi_tv_checkbox)
    CheckBox onWifiTvCheckbox;
    @BindView(R.id.layout4)
    RelativeLayout layout4;
    SharedPrefsUtils sharedPrefsUtils;
    boolean isEnabled, isWifiEnabled;
    String dailyCat;
    int dailyTimegap;
    @BindView(R.id.root)
    RelativeLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(view -> onBackPressed());
        setStatusBar();
        sharedPrefsUtils = new SharedPrefsUtils(SettingsActivity.this);
        isEnabled = sharedPrefsUtils.getBoolean(WallZyConstants.SHARED_PREFS_DAILE_WALLS_ENABLED);
        isWifiEnabled = sharedPrefsUtils.getBoolean(WallZyConstants.SHARED_PREFS_DAILE_WALLS_WIFI_ENABLED);
        dailyCat = sharedPrefsUtils.getString(WallZyConstants.SHARED_PREFS_DAILE_WALLS_CAT);
        dailyTimegap = sharedPrefsUtils.getInt(WallZyConstants.SHARED_PREFS_DAILE_WALLS_TIMEGAP);
        TextUtils.findText_and_applyTypeface(root, SettingsActivity.this);

        dailyWallSwitch.setChecked(isEnabled);

        if (isEnabled) {
            changeViewStae(true, 1f);
        } else {
            changeViewStae(false, 0.3f);
        }

    }

    private void setLightStatusbar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
    }

    private void setStatusBar() {
        int currentNightMode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
        switch (currentNightMode) {
            case Configuration.UI_MODE_NIGHT_NO:
                // Night mode is not active, we're in day time
                setLightStatusbar();
                //Log.i(TAG, "setStatusBar: Daymode foun");
            case Configuration.UI_MODE_NIGHT_YES:
                // Night mode is active, we're at night!
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    int flags = getWindow().getDecorView().getSystemUiVisibility(); // get current flag
                    flags = flags ^ View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR; // use XOR here for remove LIGHT_STATUS_BAR from flags
                    this.getWindow().getDecorView().setSystemUiVisibility(flags);
                    this.getWindow().setStatusBarColor(Color.TRANSPARENT);
                    //Log.i(TAG, "setStatusBar: NightMode Found");


                }
            case Configuration.UI_MODE_NIGHT_UNDEFINED:
                // We don't know what mode we're in, assume notnight
                setLightStatusbar();
        }
    }

    private void changeViewStae(boolean isClickable, float v) {
        layout2.setClickable(isClickable);
        layout3.setClickable((isClickable));
        layout4.setClickable((isClickable));
        onWifiTvCheckbox.setEnabled(isClickable);

        layout2.setAlpha(v);
        layout3.setAlpha(v);
        layout4.setAlpha(v);
    }

    @OnClick({R.id.daily_wall_switch, R.id.layout2, R.id.layout3, R.id.on_wifi_tv_checkbox})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.daily_wall_switch:
                sharedPrefsUtils.putBoolean(WallZyConstants.SHARED_PREFS_DAILE_WALLS_ENABLED, dailyWallSwitch.isChecked());
                if (dailyWallSwitch.isChecked()) {
                    changeViewStae(true, 1f);
                } else {
                    changeViewStae(false, 0.3f);
                }
                break;
            case R.id.layout2:
                MessageUtils.showShortToast(SettingsActivity.this,"Clicked");
                break;
            case R.id.layout3:
                MessageUtils.showShortToast(SettingsActivity.this,"Clicked");

                break;
            case R.id.on_wifi_tv_checkbox:
                sharedPrefsUtils.putBoolean(WallZyConstants.SHARED_PREFS_DAILE_WALLS_WIFI_ENABLED, onWifiTvCheckbox.isChecked());
                onWifiTvCheckbox.setChecked(sharedPrefsUtils.getBoolean(WallZyConstants.SHARED_PREFS_DAILE_WALLS_WIFI_ENABLED));
                break;
        }
    }
}
