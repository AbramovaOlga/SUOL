package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class helpActivity extends AppCompatActivity {

    public static int answersCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        String[] array = getResources().getStringArray(R.array.helpPage);
        ListView listView = findViewById(R.id.helpList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    answersCount = i;
                    Intent intent0 = new Intent(getApplicationContext(), answersActivity.class);
                    startActivity(intent0);

            }
        });




    }



    public void activityOperator(View view) {
        Intent intent0 = new Intent(this, accountActivity.class);
        startActivity(intent0);
    }


}
