package com.example.orderapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public abstract class BaseActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView bottomNavigationView;

    //로그관련
    String classname = getClass().getSimpleName().trim();
    String TAG = "LogActivity";

//    //로그
//    public void makeLog(String strData){
//        Log.d(TAG, classname+"-"+strData);
//    }
//
//    //토스트메세지
//    public void makeToast(String str){
//        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());

        Log.d(TAG, classname+"-onCreate");

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.bottomNav01:
                startActivity(new Intent(this, HomeActivity.class));
                finish();
                return true;

            case R.id.bottomNav02:
                startActivity(new Intent(this, OrderlistActivity.class));
                finish();
                return true;

            case R.id.bottomNav03:
                startActivity(new Intent(this, CouponActivity.class));
                finish();
                return true;

            case R.id.bottomNav04:
                startActivity(new Intent(this, MypageActivity.class));
                finish();
                return true;

        }

        return false;
    }

    private void updateNavigationBarState() {
        int actionId = getNavigationMenuItemId();
        selectBottomNavigationBarItem(actionId);
    }

    void selectBottomNavigationBarItem(int itemId) {
        MenuItem item = bottomNavigationView.getMenu().findItem(itemId);
        item.setChecked(true);
    }

    //상속받은 클래스에서 해당 액티비티 layout을 리턴함
    //return R.layout.activity_parking;
    abstract int getContentViewId();

    //상속받은 클래스에서 해당 BottomNavigationView id를 리턴함
    //return R.id.bottomNav04; -> bottom_navigation_menu.xml 에 적은 아이디
    abstract int getNavigationMenuItemId();


    @Override
    protected void onStart() {
        super.onStart();
        updateNavigationBarState();

        Log.d(TAG, classname+"-onStart");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, classname+"-onResume");
        super.onResume();
    }

    // Remove inter-activity transition to avoid screen tossing on tapping bottom navigation items
    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);

        Log.d(TAG, classname+"-onPause");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, classname+"-onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, classname+"+onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, classname+"=onDestroy");
        super.onDestroy();
    }

}
