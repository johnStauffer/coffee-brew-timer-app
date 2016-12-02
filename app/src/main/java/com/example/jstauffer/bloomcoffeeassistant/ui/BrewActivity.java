package com.example.jstauffer.bloomcoffeeassistant.ui;

import android.os.CountDownTimer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jstauffer.bloomcoffeeassistant.R;
import com.mikhaellopez.circularfillableloaders.CircularFillableLoaders;

public class BrewActivity extends AppCompatActivity {

    CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brew);
        startCfp();
        timer.start();
    }

    private void startCfp(){
        final CircularFillableLoaders cfp = (CircularFillableLoaders) findViewById(R.id.circularFillableProgress);
        cfp.setProgress(0);
        timer = new CountDownTimer(50000, 500) {
            int i = 100;
            @Override
            public void onTick(long millisUntilFinished) {
                cfp.setProgress(i);
                i--;
                System.out.println("Time: "+i);
            }

            @Override
            public void onFinish() {
                finishBrew();
            }
        };
    }

    private void finishBrew(){
        System.out.println("Brew Finished");
    }

}
