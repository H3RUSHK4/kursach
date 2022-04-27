package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen11);
    }
    public void btnYes11(View v) {
        Intent intent = new Intent(this, Screen14.class);
        startActivity(intent);
    }
    public void btnNo11(View v) {
        Intent intent = new Intent(this, Screen6.class);
        startActivity(intent);
    }
}