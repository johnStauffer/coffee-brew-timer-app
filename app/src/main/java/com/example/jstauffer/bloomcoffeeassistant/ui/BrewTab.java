package com.example.jstauffer.bloomcoffeeassistant.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jstauffer.bloomcoffeeassistant.R;

import static com.example.jstauffer.bloomcoffeeassistant.R.layout.brew_tab;
import static com.example.jstauffer.bloomcoffeeassistant.R.layout.content_main;

/**
 * Created by jstauffer on 7/14/16.
 */
public class BrewTab extends Fragment implements View.OnClickListener {
    Button aeropressBtn;
    Button pouroverBtn;
    Button frenchPressBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(brew_tab, container, false);

        //Initializing brew method buttons
        aeropressBtn = (Button) v.findViewById(R.id.aeropressBtn);
        aeropressBtn.setOnClickListener(this);
        frenchPressBtn = (Button) v.findViewById(R.id.frenchPressBtn);
        frenchPressBtn.setOnClickListener(this);
        pouroverBtn = (Button) v.findViewById(R.id.pouroverBtn);
        pouroverBtn.setOnClickListener(this);

        return v;
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), MassActivity.class );
        switch (v.getId()) {
            case R.id.aeropressBtn:
                intent.putExtra("brew_method", "aeropress");
                break;
            case R.id.frenchPressBtn:
                intent.putExtra("brew_method", "frenchpress");
                break;
            case R.id.pouroverBtn:
                intent.putExtra("brew_method", "pourover");
                break;
            default:
                break;
        }
        startActivity(intent);
    }
}
