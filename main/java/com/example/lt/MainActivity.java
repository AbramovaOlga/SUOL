package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int TIME_INTERVAL = 2000;
    private long backPressed;

    @Override
    public void onBackPressed(){
        if (backPressed + TIME_INTERVAL > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            Toast.makeText(getBaseContext(), "Нажмите еще раз для выхода", Toast.LENGTH_SHORT).show();
        }
        backPressed = System.currentTimeMillis();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activityOperator(View view) {
        switch (view.getId()) {
            case R.id.accountImg:
                Intent intent0 = new Intent(this, accountActivity.class);
                startActivity(intent0);
                break;
            case R.id.mapImg:
                Intent intent1 = new Intent(this, mapActivity.class);
                startActivity(intent1);
                break;
            case R.id.helpBtn:
                Intent intent2 = new Intent(this, helpActivity.class);
                startActivity(intent2);
                break;
        }
    }
}