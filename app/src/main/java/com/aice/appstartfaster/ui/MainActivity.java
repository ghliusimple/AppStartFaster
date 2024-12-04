package com.aice.appstartfaster.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.aice.appstartfaster.R;
import com.aice.appstartfaster.dispatcher.AppStartTaskDispatcher;
import com.aice.appstartfaster.test.TestAppStartTask1;
import com.aice.appstartfaster.test.TestAppStartTask2;
import com.aice.appstartfaster.test.TestAppStartTask3;
import com.aice.appstartfaster.test.TestAppStartTask4;
import com.aice.appstartfaster.test.TestAppStartTask5;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppStartTaskDispatcher.create()
                        .setShowLog(true)
                        .setAllTaskWaitTimeOut(1000)
                        .addAppStartTask(new TestAppStartTask2())
                        .addAppStartTask(new TestAppStartTask4())
                        .addAppStartTask(new TestAppStartTask5())
                        .addAppStartTask(new TestAppStartTask3())
                        .addAppStartTask(new TestAppStartTask1())
                        .start()
                        .await();
            }
        });
    }
}
