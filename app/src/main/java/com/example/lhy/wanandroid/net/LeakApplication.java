package com.example.lhy.wanandroid.net;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;
import com.tencent.bugly.crashreport.CrashReport;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

public class LeakApplication extends Application {
    //5daec6060cafb26823000790
    private static LeakApplication leakApplication;
    @Override public void onCreate() {
    super.onCreate();

        CrashReport.initCrashReport(getApplicationContext(), "c8ed1d2d02", false);

        if (LeakCanary.isInAnalyzerProcess(this)) {//1
      // This process is dedicated to LeakCanary for heap analysis.
      // You should not init your app in this process.
      return;
        }
        UMConfigure.setLogEnabled(true);
        UMConfigure.init(this,"5daec6060cafb26823000790"
                ,"umeng",UMConfigure.DEVICE_TYPE_PHONE,"");//58edcfeb310c93091c000be2 5965ee00734be40b580001a0

        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");

         LeakCanary.install(this);
        // 选用AUTO页面采集模式
        MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.AUTO);
        leakApplication=this;

  }
  public static LeakApplication getLeakApplication(){
        return leakApplication;
  }


}