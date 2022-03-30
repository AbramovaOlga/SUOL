package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

    public void switchOnClick(View view){
        Switch switch1 = findViewById(R.id.themeSwitch);

        if (switch1.isChecked()){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }



    public void webSitesLinks(View view){
        switch(view.getId()){
            case R.id.y_fir:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/olga111111"));
                startActivity(intent); break;
            case R.id.y_sec:
                Intent intent0 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/prosto__polinaa"));
                startActivity(intent0); break;
            case R.id.y_thir:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/1ost_generation"));
                startActivity(intent1); break;
            case R.id.y_four:
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/79248778505"));
                startActivity(intent2); break;
            case R.id.n_fir:
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/79142449319"));
                startActivity(intent3); break;
            case R.id.n_sec:
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/79969152164"));
                startActivity(intent4); break;
            case R.id.n_thir:
                Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/79142449319"));
                startActivity(intent5); break;
            case R.id.n_four:
                Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/79969152164"));
                startActivity(intent6); break;

        }

    }


}