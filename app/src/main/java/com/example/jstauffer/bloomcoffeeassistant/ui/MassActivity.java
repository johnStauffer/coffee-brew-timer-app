package com.example.jstauffer.bloomcoffeeassistant.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.jstauffer.bloomcoffeeassistant.R;
import com.example.jstauffer.bloomcoffeeassistant.domain.BrewSystem;
import com.example.jstauffer.bloomcoffeeassistant.service.BrewFactory;

public class MassActivity extends AppCompatActivity {

    String brewMethod;
    String displayMethod;
    BrewSystem brewSystem;
    BrewFactory brewFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        //Set up factory to instantiate correct brew object
        brewFactory = new BrewFactory();

        //Get intent and retrieve brew method
        Intent intent = getIntent();
        initWithIntent(intent);

        //Set up toolbar with custom title
        Toolbar toolbar = initToolbar();
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startBrew();
            }
        });
    }

    private Toolbar initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //Capitalize brew method for display
        displayMethod = brewMethod.substring(0, 1).toUpperCase() + brewMethod.substring(1);
        //Set toolbar title
        toolbar.setTitle(String.format("%s Grind Mass", displayMethod));

        return toolbar;
    }

    private void initWithIntent(Intent intent) {
        brewMethod = (String) intent.getSerializableExtra("brew_method");
        brewSystem = brewFactory.getBrewSystem(brewMethod);
    }

    private void startBrew(){
        Intent intent = new Intent(this, BrewActivity.class);
        startActivity(intent);
    }

}
