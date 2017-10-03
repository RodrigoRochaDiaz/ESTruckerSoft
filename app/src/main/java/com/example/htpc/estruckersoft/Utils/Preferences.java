package com.example.htpc.estruckersoft.Utils;

import android.content.SharedPreferences;

public class Preferences {
    public static final String LOGIN = "Login";
    public static enum Login{
        EMAIL,
        PASSWORD
    }
    public static String getPreferenceValue(SharedPreferences preferences, String key){
        return preferences.getString(key,Constants.EMPTY_STRING);
    }
}
