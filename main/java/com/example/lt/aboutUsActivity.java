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

public class aboutUsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);

    }


    public void webSitesLinks(View view){
        switch(view.getId()){
            case R.id.vkDevBtn:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/olga111111"));
                startActivity(intent); break;
            case R.id.vkDesBtn:
                Intent intent0 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/prosto__polinaa"));
                startActivity(intent0); break;
            case R.id.vkMngBtn:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/1ost_generation"));
                startActivity(intent1); break;
            case R.id.waDevBtn:
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/79248778505"));
                startActivity(intent2); break;
            case R.id.waDesBtn:
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/79142449319"));
                startActivity(intent3); break;
            case R.id.waMngBtn:
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/79969152164"));
                startActivity(intent4); break;

        }

    }


}
