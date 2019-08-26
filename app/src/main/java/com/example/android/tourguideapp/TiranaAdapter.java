package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TiranaAdapter extends FragmentPagerAdapter {

    public TiranaAdapter(FragmentManager fm) {
        super( fm );
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TiranaMustSee();
        } else {
            return new TiranaHotelFood();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}

