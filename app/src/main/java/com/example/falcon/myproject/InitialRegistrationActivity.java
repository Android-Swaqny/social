package com.example.falcon.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InitialRegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_registration);

        findViewById(R.id.initial_registration_using_phone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InitialRegistrationActivity.this,CompletePhoneRegistration.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.initial_registration_using_email).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InitialRegistrationActivity.this,CompleteEmailRegistration.class);
                startActivity(intent);
            }
        });
    }
}
