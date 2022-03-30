package com.example.lt;

import static com.example.lt.helpActivity.answersCount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class answersActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        switch(answersCount){
            case 0:
                setContentView(R.layout.activity_answers); break;
            case 1:
                setContentView(R.layout.h_second_answer); break;
            case 2:
                Intent intent0 = new Intent(this, aboutUsActivity.class);
                startActivity(intent0); break;
        }
    }
}