package com.example.htpc.estruckersoft.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import com.example.htpc.estruckersoft.Utils.Preferences;

public class SplashActivity extends AppCompatActivity {
    private SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = getSharedPreferences(Preferences.LOGIN, Context.MODE_PRIVATE);
        if(!TextUtils.isEmpty(Preferences.getPreferenceValue(preferences, Preferences.Login.USER.toString()))
        && !TextUtils.isEmpty(Preferences.getPreferenceValue(preferences, Preferences.Login.PASSWORD.toString()))){
            startActivity(new Intent(this, MainActivity.class));
        } else {
            startActivity(new Intent(this, LoginActivity.class));
        }
        finish();
    }
}
