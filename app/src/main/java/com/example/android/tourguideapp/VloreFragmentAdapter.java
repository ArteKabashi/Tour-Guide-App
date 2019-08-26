package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class VloreFragmentAdapter extends FragmentPagerAdapter {

    public VloreFragmentAdapter(FragmentManager fm) {
        super( fm );
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new VloraMustSee();
        } else {
            return new VloraHotelFood();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
