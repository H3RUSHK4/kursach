package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen12);
    }
    public void btnNext12(View v) {
        Intent intent = new Intent(this, Screen13.class);
        startActivity(intent);
    }
}