package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen8);
    }
    public void btnRoom(View v) {
        Intent intent = new Intent(this, Screen9.class);
        startActivity(intent);
    }
    public void btn1floor(View v) {
        Intent intent = new Intent(this, Screen10.class);
        startActivity(intent);
    }
}