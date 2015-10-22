package com.example.dgonzalez.alarmmanagertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    AlarmReceiver mAlarmReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAlarmReceiver = new AlarmReceiver();

        Button start = (Button) findViewById(R.id.button_start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mAlarmReceiver.setAlarm(MainActivity.this);
            }
        });


        Button end = (Button) findViewById(R.id.button_end);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mAlarmReceiver.cancelAlarm(MainActivity.this);
            }
        });
    }
}
