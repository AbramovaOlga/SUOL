package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class accountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }



    public void activityOperator(View view) {
        Intent intent2 = new Intent(this, helpActivity.class);
        startActivity(intent2);

    }

}