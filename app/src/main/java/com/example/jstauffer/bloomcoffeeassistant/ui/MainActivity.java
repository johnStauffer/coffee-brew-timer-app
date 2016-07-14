package com.example.jstauffer.bloomcoffeeassistant.ui;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.jstauffer.bloomcoffeeassistant.R;
import com.example.jstauffer.bloomcoffeeassistant.ui.widget.ViewPagerAdapter;
import com.example.jstauffer.bloomcoffeeassistant.ui.widget.SlidingTabLayout;

/**
 * Created by jstauffer on 7/14/16.
 */


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"Brew", "Learn"};
    int Numtabs = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Setting Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        //Titles for tabs and number of tabs
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), Titles, Numtabs);
        //Set ViewPager & Adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);
        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // Spaces tabs evenly
        // Set color for scroll bar
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });
        // Set the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);
    }

}
