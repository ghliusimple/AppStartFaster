package com.aice.appstartfaster.test;

import android.util.Log;

import com.aice.appstartfaster.task.AppStartTask;

import java.util.List;


public class TestAppStartTask1 extends AppStartTask {

    @Override
    public void run() {
        Log.i(TestAppStartTask1.class.getName(), "start");
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(300);
        } catch (Exception e) {
        }
        Log.i(TestAppStartTask1.class.getName(),
                "TestAppStartTask1 finished time = " + (System.currentTimeMillis() - start));
    }

    @Override
    public List<Class<? extends AppStartTask>> getDependsTaskList() {
        return null;
    }

    @Override
    public boolean isRunOnMainThread() {
        return true;
    }


}
