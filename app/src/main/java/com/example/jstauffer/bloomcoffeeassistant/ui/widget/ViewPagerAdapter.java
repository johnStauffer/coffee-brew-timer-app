package com.example.jstauffer.bloomcoffeeassistant.ui.widget;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.jstauffer.bloomcoffeeassistant.ui.BrewTab;
import com.example.jstauffer.bloomcoffeeassistant.ui.LearnTab;

/**
 * Created by jstauffer on 7/14/16.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[];
    int numTabs;


    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int numTabs) {
        super(fm);

        this.Titles = mTitles;
        this.numTabs = numTabs;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if(position == 0) // if the position is 0 we are returning the First tab
        {
            BrewTab brewTab = new BrewTab();
            return brewTab;
        }
        else //change for more than two tabs
        {
            LearnTab learnTab = new LearnTab();
            return learnTab;

        }


    }

    // Return tab titles

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // Return number of tabs

    @Override
    public int getCount() {
        return numTabs;
    }
}