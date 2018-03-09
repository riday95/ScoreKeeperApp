package com.example.android.scorekeeperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Start different sport counter activity
     */
    public void startFootball(View view) {
        Intent fooInt = new Intent(MainActivity.this, football.class);
        startActivity(fooInt);
    }

    public void startBasketball(View view) {
        Intent basInt = new Intent(MainActivity.this, basketball.class);
        startActivity(basInt);
    }

    public void startCricket(View view) {
        Intent criInt = new Intent(MainActivity.this, cricket.class);
        startActivity(criInt);
    }
}