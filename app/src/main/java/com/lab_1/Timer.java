package com.lab_1;

import android.os.AsyncTask;

// Таймер на 2 секунды
public class Timer extends AsyncTask<MainActivity, Void, Void> {
    private int time = 2000;
    protected Void doInBackground(MainActivity... params){
        try{
            Thread.sleep(time);
            MainActivity callingActivity = params[0];
            callingActivity.Die();
        } catch (InterruptedException e) {}
        return null;
    }
}
