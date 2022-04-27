package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen7);
    }
    public void btnNext7(View v) {
        Intent intent = new Intent(this, Screen8.class);
        startActivity(intent);
    }
}