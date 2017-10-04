package com.example.htpc.estruckersoft.Base;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;

public abstract class ActivityBase extends AppCompatActivity {
    public SharedPreferences preferences;
    public abstract void bindUserInterface();
    public void goToActivity(Class source, boolean useHistory){
        Intent intent = new Intent(this, source);
        if(!useHistory){
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        }
        startActivity(intent);
    }
}
