package com.example.jstauffer.bloomcoffeeassistant.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jstauffer.bloomcoffeeassistant.R;

/**
 * Created by jstauffer on 7/14/16.
 */
public class LearnTab extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.learn_tab,container,false);
        return v;
    }
}
