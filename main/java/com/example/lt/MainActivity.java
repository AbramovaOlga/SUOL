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




    public void webSitesLinks(View view){
        switch(view.getId()){
            case R.id.y_fir:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tonkosti.ru/%D0%9A%D0%BE%D0%BC%D0%BF%D0%BB%D0%B5%D0%BA%D1%81_%C2%AB%D0%A6%D0%B0%D1%80%D1%81%D1%82%D0%B2%D0%BE_%D0%B2%D0%B5%D1%87%D0%BD%D0%BE%D0%B9_%D0%BC%D0%B5%D1%80%D0%B7%D0%BB%D0%BE%D1%82%D1%8B%C2%BB_%D0%B2_%D0%AF%D0%BA%D1%83%D1%82%D1%81%D0%BA%D0%B5"));
                startActivity(intent); break;
            case R.id.y_sec:
                Intent intent0 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tonkosti.ru/Музей_мамонта"));
                startActivity(intent0); break;
            case R.id.y_thir:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.ru/Attraction_Review-g665309-d7646992-Reviews-Archy_House_Center_of_Spiritual_Culture-Yakutsk_Sakha_Yakutia_Republic_Far_Easter.html"));
                startActivity(intent1); break;
            case R.id.y_four:
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.ru/LocationPhotoDirectLink-g665309-d6490945-i122132299-Museum_of_History_of_Studying_of_Permafrost-Yakutsk_Sakha_Yakutia_Republ.html"));
                startActivity(intent2); break;
            case R.id.n_fir:
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://russia.travel/objects/315796/"));
                startActivity(intent3); break;
            case R.id.n_sec:
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://yandex.ru/maps/org/tekhnopark/35476354721/?ll=124.723457%2C56.678277&z=17"));
                startActivity(intent4); break;
            case R.id.n_thir:
                Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://turbazy.ru/list/respublika_saha_yakutiya/nahot.html"));
                startActivity(intent5); break;
            case R.id.n_four:
                Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mintrud.sakha.gov.ru/news/front/view/id/2782160"));
                startActivity(intent6); break;

        }

    }


}