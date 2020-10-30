package com.example.mostafa.swip;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.telephony.TelephonyManager;
import android.util.Log;

public class broad extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(TelephonyManager.ACTION_PHONE_STATE_CHANGED)){ // state changed

            String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
            Log.e("phone state reciever", "call state changed.... " + state);
            state += " number:" + intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
            ShowNotification(" call reciever","you have new call "+
                    intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER),context);

        }


    }

    public void ShowNotification(String title,String message,Context context){




        Intent intent = new Intent(context, MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(context,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);

        Notification notification = new NotificationCompat.Builder(context,"calls")
                .setContentTitle(title)
                .setContentText(message)
                .setVibrate( new long[]{12,50,100})
                .setSmallIcon(R.drawable.alerter_ic_face)
                .setContentIntent(pi)
                .build();

        NotificationManager notificationManager
                = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(12,notification);

    }

}

