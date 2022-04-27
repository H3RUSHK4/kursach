package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);
    }
    public void btnvar1(View v) {
        Intent intent = new Intent(this, Screen6.class);
        startActivity(intent);
    }
    public void btnvar2(View v) {
        Intent intent = new Intent(this, Screen11.class);
        startActivity(intent);
    }

}