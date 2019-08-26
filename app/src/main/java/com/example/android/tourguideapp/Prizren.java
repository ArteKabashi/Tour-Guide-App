package com.example.android.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Prizren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_prizren );

        TabLayout tabLayoutOne = findViewById( R.id.tabLayout1 );
        tabLayoutOne.addTab( tabLayoutOne.newTab().setText( "Must see" ) );
        tabLayoutOne.addTab( tabLayoutOne.newTab().setText( "Hotel&Food" ) );
        tabLayoutOne.setTabGravity( TabLayout.GRAVITY_FILL );

        final ViewPager viewPager = findViewById( R.id.viewpager1 );
        PrizrenAdapter adapter4 = new PrizrenAdapter( getSupportFragmentManager() );
        viewPager.setAdapter( adapter4 );
        viewPager.setOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener( tabLayoutOne ) );

        tabLayoutOne.setOnTabSelectedListener( new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem( tab.getPosition() );
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        } );
    }
}
