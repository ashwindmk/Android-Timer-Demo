package com.example.ashwin.timerdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

/**
 * Created by ashwin on 16/11/17.
 */

public class Timer extends BroadcastReceiver {

    private static final int VIBRATE_MILLISECONDS = 3000;

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Time up!", Toast.LENGTH_LONG).show();
        Vibrator vibrator = (Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
        vibrator.vibrate(VIBRATE_MILLISECONDS);
    }

}
