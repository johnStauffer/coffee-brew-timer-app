package com.example.jstauffer.bloomcoffeeassistant.ui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by jstauffer on 7/14/16.
 */


public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Splash.this, MainActivity.class);
                        startActivity(intent);
                    }
                }, 2000
        );
    }
}
