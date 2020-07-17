package com.example.orderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    String TAG = "splash";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent splashIntent = new Intent(this, HomeActivity.class);
        startActivity(splashIntent);

        Log.d(TAG, "aaaa");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        finish();
    }
}
