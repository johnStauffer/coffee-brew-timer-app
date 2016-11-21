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

/**
 * Created by jstauffer on 7/14/16.
 */
public class BrewTab extends Fragment {
    Button aeropressBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(brew_tab, container, false);
        return v;
    }
}
