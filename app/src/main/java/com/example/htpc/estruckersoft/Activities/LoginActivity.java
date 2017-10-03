package com.example.htpc.estruckersoft.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.htpc.estruckersoft.Base.ActivityBase;
import com.example.htpc.estruckersoft.R;

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
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = editTextUser.getText().toString();
                String password = editTextPassword.getText().toString();
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
}
