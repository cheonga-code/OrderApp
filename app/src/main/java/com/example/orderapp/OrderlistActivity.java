package com.example.orderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class OrderlistActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_orderlist);


    }

    @Override
    int getContentViewId() {
        return R.layout.activity_orderlist;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.bottomNav02;
    }
}
