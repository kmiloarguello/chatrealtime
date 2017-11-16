package xyz.camiloarguello.chatrealtime;

/**
 * Created by Camilo Arguello R on 2017-11-16.
 */

public class FirebaseChatMainApp {

    private static boolean sIsChatActivityOpen = false;

    public static boolean isChatActivityOpen() {
        return sIsChatActivityOpen;
    }

    public static void setChatActivityOpen(boolean isChatActivityOpen) {
        FirebaseChatMainApp.sIsChatActivityOpen = isChatActivityOpen;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

}
