package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
    }
    public void btnNext3(View v) {
        Intent intent = new Intent(this, Screen4.class);
        startActivity(intent);
    }
    public void btnBack3(View v) {
        Intent intent = new Intent(this, Screen2.class);
        startActivity(intent);
    }
}