package com.example.htpc.estruckersoft.Activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.example.htpc.estruckersoft.Base.ActivityBase;
import com.example.htpc.estruckersoft.Utils.Constants;
import com.example.htpc.estruckersoft.Utils.Preferences;

public class SplashActivity extends ActivityBase {
    private SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = getSharedPreferences(Preferences.LOGIN, Context.MODE_PRIVATE);
        if(!TextUtils.isEmpty(Preferences.getPreference(preferences, Preferences.Login.USER.toString()))
        && !TextUtils.isEmpty(Preferences.getPreference(preferences, Preferences.Login.PASSWORD.toString()))){
            goToActivity(MainActivity.class, Constants.DONT_USE_HISTORY);
        } else {
            goToActivity(StartActivity.class, Constants.DONT_USE_HISTORY);
        }
    }

    @Override
    public void bindUserInterface() {

    }
}
