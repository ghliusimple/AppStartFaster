package com.aice.appstartfaster.runnable;

import android.os.Process;

import com.aice.appstartfaster.dispatcher.AppStartTaskDispatcher;
import com.aice.appstartfaster.task.AppStartTask;

public class AppStartTaskRunnable implements Runnable {
    private final AppStartTask mAppStartTask;
    private final AppStartTaskDispatcher mAppStartTaskDispatcher;

    public AppStartTaskRunnable(AppStartTask appStartTask, AppStartTaskDispatcher appStartTaskDispatcher) {
        this.mAppStartTask = appStartTask;
        this.mAppStartTaskDispatcher = appStartTaskDispatcher;
    }

    @Override
    public void run() {
        if (!mAppStartTask.isRunOnMainThread()) {
            Process.setThreadPriority(mAppStartTask.priority());
        }
        mAppStartTask.waitToNotify();
        mAppStartTask.run();
        mAppStartTaskDispatcher.setNotifyChildren(mAppStartTask);
        mAppStartTaskDispatcher.markAppStartTaskFinish(mAppStartTask);
    }
}
