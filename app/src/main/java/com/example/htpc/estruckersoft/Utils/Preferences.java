package com.example.htpc.estruckersoft.Utils;

import android.content.SharedPreferences;

public class Preferences {
    public static final String LOGIN = "Login";
    public static enum Login{
        USER,
        PASSWORD
    }
    public static String getPreferenceValue(SharedPreferences preferences, String key){
        return preferences.getString(key,Constants.EMPTY_STRING);
    }
    public static void saveOnPreference(SharedPreferences preferences, String key, String value){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key,value);
        editor.apply();
    }
}
