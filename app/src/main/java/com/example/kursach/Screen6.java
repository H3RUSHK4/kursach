package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6);
        tartService(new Intent(Screen6.this, MusikForScreen6.class));
    }
    protected void onDestroy() {
        //stop service and stop music
        stopService(new Intent(Screen6.this, MusikForScreen6.class));
        super.onDestroy();
    }

    private void tartService(Intent intent) {
    }

    public void btnOsmotr(View v) {
        Intent intent = new Intent(this, Screen7.class);
        startActivity(intent);
    }
    public void btnExit(View v) {
        Intent intent = new Intent(this, Screen8.class);
        startActivity(intent);
    }
}