package com.aice.appstartfaster.test;

import android.util.Log;


import com.aice.appstartfaster.task.AppStartTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class TestAppStartTask5 extends AppStartTask {

    @Override
    public void run() {
        Log.i(TestAppStartTask5.class.getName(), "start");
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(300);
        } catch (Exception e) {
        }
        Log.i(TestAppStartTask5.class.getName(),
                "TestAppStartTask5 finished time = " + (System.currentTimeMillis() - start));
    }

    @Override
    public List<Class<? extends AppStartTask>> getDependsTaskList() {
        List<Class<? extends AppStartTask>> dependsTaskList = new ArrayList<>();
        dependsTaskList.add(TestAppStartTask3.class);
        dependsTaskList.add(TestAppStartTask2.class);
        return dependsTaskList;
    }

    @Override
    public Executor runOnExecutor() {
        return super.runOnExecutor();
    }

    @Override
    public boolean isRunOnMainThread() {
        return false;
    }


}
