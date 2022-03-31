package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_layout);
    }

    public void onEnterClick(View view){setContentView(R.layout.activity_login);}


    public void onSignUpClick(View view){
        setContentView(R.layout.sign_up);
    }
    public void onLoginClick(View view){
        setContentView(R.layout.activity_login);
    }

    public void onLoginBtnClick(View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}