package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PrizrenAdapter extends FragmentPagerAdapter {

    public PrizrenAdapter(FragmentManager fm) {
        super( fm );
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PrizrenMustSee();
        } else {
            return new PrizrenHotelFood();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
