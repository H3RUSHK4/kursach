package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
    }
    public void btnNext4(View v) {
        Intent intent = new Intent(this, Screen5.class);
        startActivity(intent);
    }
    public void btnBack4(View v) {
        Intent intent = new Intent(this, Screen3.class);
        startActivity(intent);
    }
}