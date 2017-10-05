package com.example.htpc.estruckersoft.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.htpc.estruckersoft.Base.ActivityBase;
import com.example.htpc.estruckersoft.R;
import com.example.htpc.estruckersoft.Utils.Constants;

public class UserRegistryActivity extends ActivityBase {
    Button buttonBack;
    Button buttonRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registry);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivity(LoginActivity.class, Constants.USE_HISTORY);
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivity(MainActivity.class, Constants.DONT_USE_HISTORY);
            }
        });
    }

    @Override
    public void bindUserInterface() {
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonRegister = (Button) findViewById(R.id.buttonUserRegister);
    }
}
