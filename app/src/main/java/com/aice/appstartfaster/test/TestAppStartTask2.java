package com.aice.appstartfaster.test;

import android.util.Log;


import com.aice.appstartfaster.executor.TaskExecutorManager;
import com.aice.appstartfaster.task.AppStartTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class TestAppStartTask2 extends AppStartTask {

    @Override
    public void run() {
        Log.i(TestAppStartTask2.class.getName(), "start");
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(300);
        } catch (Exception e) {

        }
        Log.i(TestAppStartTask2.class.getName(),
                "TestAppStartTask2 finished time = " + (System.currentTimeMillis() - start));
    }

    @Override
    public Executor runOnExecutor() {
        return TaskExecutorManager.getInstance().getCPUThreadPoolExecutor();
    }

    @Override
    public List<Class<? extends AppStartTask>> getDependsTaskList() {
        List<Class<? extends AppStartTask>> dependsTaskList = new ArrayList<>();
        dependsTaskList.add(TestAppStartTask1.class);
        return dependsTaskList;
    }

    @Override
    public boolean isRunOnMainThread() {
        return false;
    }


}
