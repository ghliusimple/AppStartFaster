package com.aice.appstartfaster.application;

import android.app.Application;
import android.content.Context;

import com.aice.appstartfaster.dispatcher.AppStartTaskDispatcher;
import com.aice.appstartfaster.multidex.MultidexUtils;
import com.aice.appstartfaster.test.TestAppStartTask5;
import com.aice.appstartfaster.test.TestAppStartTask4;
import com.aice.appstartfaster.test.TestAppStartTask1;
import com.aice.appstartfaster.test.TestAppStartTask3;
import com.aice.appstartfaster.test.TestAppStartTask2;


public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}
