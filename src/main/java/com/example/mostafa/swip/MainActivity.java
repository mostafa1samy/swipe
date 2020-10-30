package com.example.mostafa.swip;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import com.tapadoo.alerter.Alert;
import com.tapadoo.alerter.Alerter;
import com.tapadoo.alerter.OnHideAlertListener;
import com.tapadoo.alerter.OnShowAlertListener;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.alarm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
showtimepicker();
            }
        });

    }

    private void showtimepicker() {
        TimePickerDialog timePickerDialog=
                new TimePickerDialog(

                        this,
                        new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet
                            (TimePicker view, int hourOfDay, int minute) {
                        tahour=hourOfDay;
                        tamint=minute;


                    }
                }, java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY),java.util.Calendar.getInstance().get(java.util.Calendar.MINUTE),false);
    }
    int tahour,tamint;
    void addalrem(){
        int chour=Calendar.HOUR_OF_DAY;
        int cmin=Calendar.MINUTE;
        long d=
                ((tahour-chour)*60-60-1000)+
                        ((tamint-cmin)*60*1000);
Intent intent=new Intent(this,ler.class);
intent.putExtra("mos","i");
        PendingIntent pendingIntent=
                PendingIntent.getActivity(this
                        ,10,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager =(AlarmManager)
                getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP,d,pendingIntent);



    }


    public void next(View view) {
        startActivity(new Intent(MainActivity.this,Main2Activity.class));
    }

    public void alert(String m,String t) {
        Alerter.create(this).setTitle(t)
                .setText(m).setBackgroundColorRes(R.color.colorAccent)
                .setDuration(5000).enableProgress(true).enableSwipeToDismiss()
                .setProgressColorRes(R.color.colorPrimary)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).setOnShowListener(new OnShowAlertListener() {
            @Override
            public void onShow() {

            }
        }).setOnHideListener(new OnHideAlertListener() {
            @Override
            public void onHide() {


            }
        }).show();

    }
}
