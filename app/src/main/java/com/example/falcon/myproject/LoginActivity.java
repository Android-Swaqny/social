package com.example.falcon.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.login_activity_redirect_2_sign_up).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,InitialRegistrationActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.login_activity_redirect_2_forget_password).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo launch forget password activity
            }
        });

        findViewById(R.id.login_activity_login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo login logic

                Intent intent = new Intent(LoginActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
