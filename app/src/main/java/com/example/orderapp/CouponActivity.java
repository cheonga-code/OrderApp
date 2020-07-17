package com.example.orderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CouponActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);
    }

    @Override
    int getContentViewId() {
        return R.layout.activity_coupon;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.bottomNav03;
    }
}
