package com.example.orderapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CoffeelistActivity extends AppCompatActivity {

    RecyclerView recyclerViewCoffeelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffeelist);

        recyclerViewCoffeelist = (RecyclerView)findViewById(R.id.recyclerCoffeeList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewCoffeelist.setLayoutManager(linearLayoutManager);

    }

}
