package io.hustler.wallzy.constants;

import java.util.ArrayList;

public class NotificationConstants {

    private static final int DAILY_NOTIFICATION_MORNING_ID = 200;
    private static final int DAILY_NOTIFICATION_EVENING_ID = 200;
    private static final int DAILY_NOTIFICATION_HOME_PENDING_INTENT_REQUEST_CODE = 100;

    /**
     * GROUP MOT KEYS
     */
    private static final String CLOUD_NOTIFICATION_KEY = "io.hustler.wallzy.CLOUD_NOTIFICATION_KEY";
    private static final String CLOUD_NOTIFICATION_ANNOUNCEMENT_GROUP_KEY = "io.hustler.wallzy.CLOUD_NOTIFICATION_ANNOUNCEMENT_KEY";
    private static final String LOCAL_NOTIFICATION_DAILY_GROUP_KEY = "io.hustler.wallzy.LOCAL_NOTIFICATION_KEY";
    private static final String IMAGE_DOWNLOAD_NOTIFICATIONS_GROUP_KEY = "io.hustler.wallzy.DOWNLOAD_NOTIFICATION_KEY";

    /*GROUP IDS*/
    private static final String CLOUD_NOTIFICATION_GROUP_ID = "CLOUD_NOTIFICATION_GROUP_ID";
    private static final String CLOUD_NOTIFICATION_ANNOUNCEMENT_GROUP_ID = "CLOUD_NOTIFICATION_ANNOUNCEMENT_GROUP_ID";
    private static final String LOCAL_NOTIFICATION_DAILY_GROUP_ID = "LOCAL_NOTIFICATION_DAILY_GROUP_ID";
    private static final String IMAGE_DOWNLOAD_NOTIFICATIONS_GROUP_ID = "IMAGE_DOWNLOAD_NOTIFICATIONS_GROUP_ID";

    /*GROUP NAMES*/
    private static final String CLOUD_NOTIFICATION_GROUP_NAME = "Latest Updates Group";
    private static final String CLOUD_NOTIFICATION_ANNOUNCEMENT_NAME = "Latest Announcements Group";
    private static final String LOCAL_NOTIFICATION_DAILY_NAME = "Daily Local Notifications Group";
    private static final String IMAGE_DOWNLOAD_NOTIFICATIONS_NAME = "Image Download Group";


    /*CHANNEL IDS*/
    private static final String CLOUD_NOTIFICATION_CHANNEL_ID = "CLOUD_NOTIFICATION_CHANNEL_ID";
    private static final String CLOUD_NOTIFICATION_ANNOUNCEMENT_CHANNEL_ID = "CLOUD_NOTIFICATION_ANNOUNCEMENT_CHANNEL_ID";
    private static final String LOCAL_NOTIFICATION_DAILY_CHANNEL_ID = "LOCAL_NOTIFICATION_DAILY_CHANNEL_ID";
    private static final String IMAGE_DOWNLOAD_NOTIFICATIONS_CHANNEL_ID = "IMAGE_DOWNLOAD_NOTIFICATIONS_CHANNEL_ID";

    /*CHANNEL NAMES*/

    private static final String CLOUD_NOTIFICATION_CHANNEL_NAME = "Latest Updates Channel";
    private static final String CLOUD_NOTIFICATION_ANNOUNCEMENT_CHANNEL_NAME = "Latest Announcements Channel";
    private static final String LOCAL_NOTIFICATION_DAILY_CHANNEL_NAME = "Daily Local Notifications Channel";
    private static final String IMAGE_DOWNLOAD_NOTIFICATIONS_CHANNEL_NAME = "Image Download Channel";


    public static ArrayList<String> getAllGroupId() {
        ArrayList<String> groupIdList = new ArrayList<>();
        groupIdList.add(CLOUD_NOTIFICATION_GROUP_ID);
        groupIdList.add(CLOUD_NOTIFICATION_ANNOUNCEMENT_GROUP_ID);
        groupIdList.add(LOCAL_NOTIFICATION_DAILY_GROUP_ID);
        groupIdList.add(IMAGE_DOWNLOAD_NOTIFICATIONS_GROUP_ID);
        return groupIdList;
    }

    public static ArrayList<String> getAllGroupNames() {

        ArrayList<String> groupNames = new ArrayList<>();
        groupNames.add(CLOUD_NOTIFICATION_GROUP_NAME);
        groupNames.add(CLOUD_NOTIFICATION_ANNOUNCEMENT_NAME);
        groupNames.add(LOCAL_NOTIFICATION_DAILY_NAME);
        groupNames.add(IMAGE_DOWNLOAD_NOTIFICATIONS_NAME);
        return groupNames;
    }

    public static ArrayList<String> getAllChannelIds() {
        ArrayList<String> channelIdList = new ArrayList<>();
        channelIdList.add(CLOUD_NOTIFICATION_CHANNEL_ID);
        channelIdList.add(CLOUD_NOTIFICATION_ANNOUNCEMENT_CHANNEL_ID);
        channelIdList.add(LOCAL_NOTIFICATION_DAILY_CHANNEL_ID);
        channelIdList.add(IMAGE_DOWNLOAD_NOTIFICATIONS_CHANNEL_ID);
        return channelIdList;
    }

    public static ArrayList<String> getAllChannelNames() {
        ArrayList<String> channelNamesList = new ArrayList<>();
        channelNamesList.add(CLOUD_NOTIFICATION_CHANNEL_NAME);
        channelNamesList.add(CLOUD_NOTIFICATION_ANNOUNCEMENT_CHANNEL_NAME);
        channelNamesList.add(LOCAL_NOTIFICATION_DAILY_CHANNEL_NAME);
        channelNamesList.add(IMAGE_DOWNLOAD_NOTIFICATIONS_CHANNEL_NAME);
        return channelNamesList;
    }


    /*GETTERS AND SETTERS*/

    public static String getCloudNotificationKey() {
        return CLOUD_NOTIFICATION_KEY;
    }


    public static String getLocalNotificationDailyGroupId() {
        return LOCAL_NOTIFICATION_DAILY_GROUP_ID;
    }


    public static String getCloudNotificationAnnouncementChannelId() {
        return CLOUD_NOTIFICATION_ANNOUNCEMENT_CHANNEL_ID;
    }

    public static String getLocalNotificationDailyChannelId() {
        return LOCAL_NOTIFICATION_DAILY_CHANNEL_ID;
    }

    public static int getDailyNotificationMorningId() {
        return DAILY_NOTIFICATION_MORNING_ID;
    }

    public static int getDailyNotificationEveningId() {
        return DAILY_NOTIFICATION_EVENING_ID;
    }

    public static String getCloudNotificationAnnouncementGroupKey() {
        return CLOUD_NOTIFICATION_ANNOUNCEMENT_GROUP_KEY;
    }

    public static String getLocalNotificationDailyGroupKey() {
        return LOCAL_NOTIFICATION_DAILY_GROUP_KEY;
    }

    public static String getImageDownloadNotificationsGroupKey() {
        return IMAGE_DOWNLOAD_NOTIFICATIONS_GROUP_KEY;
    }

    public static String getCloudNotificationGroupId() {
        return CLOUD_NOTIFICATION_GROUP_ID;
    }

    public static String getCloudNotificationAnnouncementGroupId() {
        return CLOUD_NOTIFICATION_ANNOUNCEMENT_GROUP_ID;
    }

    public static String getImageDownloadNotificationsGroupId() {
        return IMAGE_DOWNLOAD_NOTIFICATIONS_GROUP_ID;
    }

    public static String getCloudNotificationChannelId() {
        return CLOUD_NOTIFICATION_CHANNEL_ID;
    }

    public static String getImageDownloadNotificationsChannelId() {
        return IMAGE_DOWNLOAD_NOTIFICATIONS_CHANNEL_ID;
    }

    public static int getDailyNotificationHomePendingIntentRequestCode() {
        return DAILY_NOTIFICATION_HOME_PENDING_INTENT_REQUEST_CODE;
    }
}
