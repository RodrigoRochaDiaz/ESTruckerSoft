package com.example.htpc.estruckersoft.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.htpc.estruckersoft.Base.ActivityBase;
import com.example.htpc.estruckersoft.R;
import com.example.htpc.estruckersoft.Utils.Constants;

public class StartActivity extends ActivityBase {
    Button buttonSingIn;
    Button buttonUserRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        bindUserInterface();
        buttonSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivity(LoginActivity.class, Constants.USE_HISTORY);
            }
        });
        buttonUserRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivity(UserRegistryActivity.class, Constants.USE_HISTORY);
            }
        });
    }

    @Override
    public void bindUserInterface() {
        buttonSingIn = (Button) findViewById(R.id.buttonSingIn);
        buttonUserRegister = (Button) findViewById(R.id.buttonUserRegister);
    }


}
