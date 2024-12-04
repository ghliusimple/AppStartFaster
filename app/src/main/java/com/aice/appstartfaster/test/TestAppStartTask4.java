package com.aice.appstartfaster.test;

import android.util.Log;


import com.aice.appstartfaster.task.AppStartTask;

import java.util.ArrayList;
import java.util.List;

public class TestAppStartTask4 extends AppStartTask {

    @Override
    public void run() {
        Log.i(TestAppStartTask4.class.getName(), "start");
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(300);
        } catch (Exception e) {

        }
        Log.i(TestAppStartTask4.class.getName(),
                "TestAppStartTask4 finished time = " + (System.currentTimeMillis() - start));
    }

    @Override
    public List<Class<? extends AppStartTask>> getDependsTaskList() {
        List<Class<? extends AppStartTask>> dependsTaskList = new ArrayList<>();
        dependsTaskList.add(TestAppStartTask2.class);
        dependsTaskList.add(TestAppStartTask3.class);
        return dependsTaskList;
    }

    @Override
    public boolean isRunOnMainThread() {
        return false;
    }

}
