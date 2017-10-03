package com.example.htpc.estruckersoft.Base;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;

public abstract class ActivityBase extends AppCompatActivity {
    private SharedPreferences preferences;
    public abstract void bindUserInterface();
}
