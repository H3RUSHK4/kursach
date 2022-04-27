package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen9);
    }
    public void btnFloor(View v) {
        Intent intent = new Intent(this, Screen10.class);
        startActivity(intent);
    }
    public void btnDoor(View v) {
        Intent intent = new Intent(this, Screen9_1.class);
        startActivity(intent);
    }
}