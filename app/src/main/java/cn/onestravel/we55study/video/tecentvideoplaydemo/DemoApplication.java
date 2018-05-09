package cn.onestravel.we55study.video.tecentvideoplaydemo;

import android.support.multidex.MultiDexApplication;

import com.tencent.rtmp.TXLiveBase;


public class DemoApplication extends MultiDexApplication {

    private static DemoApplication instance;

    @Override
    public void onCreate() {

        super.onCreate();

        instance = this;

        TXLiveBase.setConsoleEnabled(true);
    }
    public static DemoApplication getApplication() {
        return instance;
    }

}
