package com.example.htpc.estruckersoft.App;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by HTPC on 02/10/2017.
 */

public class AppStart extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(500);
    }
}
