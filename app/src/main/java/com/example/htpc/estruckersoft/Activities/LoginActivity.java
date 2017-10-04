package com.example.htpc.estruckersoft.Activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import com.example.htpc.estruckersoft.Base.ActivityBase;
import com.example.htpc.estruckersoft.Entities.User;
import com.example.htpc.estruckersoft.R;
import com.example.htpc.estruckersoft.Utils.Constants;
import com.example.htpc.estruckersoft.Utils.Preferences;

public class LoginActivity extends ActivityBase {
    private EditText editTextUser;
    private EditText editTextPassword;
    private CheckBox checkBoxRemember;
    private Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bindUserInterface();
        preferences = getSharedPreferences(Preferences.LOGIN, Context.MODE_PRIVATE);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                user.setUser(editTextUser.getText().toString());
                user.setPassword(editTextPassword.getText().toString());
                if(login(user)){
                    savePreference();
                    goToActivity(MainActivity.class, Constants.DONT_USE_HISTORY);
                }
            }
        });
    }

    @Override
    public void bindUserInterface() {
        editTextUser = (EditText) findViewById(R.id.editTextUser);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        checkBoxRemember = (CheckBox) findViewById(R.id.checkBoxRemember);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
    }

    private boolean login(User user){
        return true;
    }

    private void savePreference(){
        if(checkBoxRemember.isChecked()){
            Preferences.savePreference(preferences, Preferences.Login.USER.toString(), editTextUser.getText().toString());
            Preferences.savePreference(preferences, Preferences.Login.PASSWORD.toString(), editTextPassword.getText().toString());
        }
    }
}
