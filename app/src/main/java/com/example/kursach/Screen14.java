package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen14);
    }
    public void btnNext14(View v) {
        Intent intent = new Intent(this, Screen15.class);
        startActivity(intent);
    }
}