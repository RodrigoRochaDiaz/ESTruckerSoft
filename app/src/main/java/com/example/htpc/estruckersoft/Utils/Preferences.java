package com.example.htpc.estruckersoft.Utils;

import android.content.SharedPreferences;

public class Preferences {
    public static final String LOGIN = "Login";
    public enum Login{
        USER,
        PASSWORD
    }
    public static String getPreference(SharedPreferences preferences, String key){
        return preferences.getString(key,Constants.EMPTY_STRING);
    }
    public static void savePreference(SharedPreferences preferences, String key, String value){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key,value);
        editor.apply();
    }
    public static void removePreference(SharedPreferences preferences, String key){
        SharedPreferences.Editor editor = preferences.edit();
        editor.remove(key);
        editor.apply();
    }
}
