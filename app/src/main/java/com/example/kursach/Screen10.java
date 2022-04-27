package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen10);
    }
    public void btnPogreb(View v) {
        Intent intent = new Intent(this, Screen12.class);
        startActivity(intent);
    }
    public void btnRod(View v) {
        Intent intent = new Intent(this, Screen10_1.class);
        startActivity(intent);
    }

}