package com.example.orderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends BaseActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
    }

    @Override
    int getContentViewId() {
        return R.layout.activity_home;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.bottomNav01;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnOrder:
                Intent coffeeOrderIntent = new Intent(this, CoffeelistActivity.class);
                startActivityForResult(coffeeOrderIntent, 1001);
                break;
            case R.id.btnReview:
                break;
            case R.id.btnGift:
                break;
            case R.id.btnNews:
                break;

        }
    }
}
