package com.example.android.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        TabLayout tabLayout = findViewById( R.id.tabLayout );
        tabLayout.addTab( tabLayout.newTab().setText( "About Albania" ) );
        tabLayout.addTab( tabLayout.newTab().setText( "Places to visit" ) );
        tabLayout.setTabGravity( TabLayout.GRAVITY_FILL );

        final ViewPager viewPager = findViewById( R.id.viewpager );

        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter( getSupportFragmentManager() );
        viewPager.setAdapter( adapter );
        viewPager.setOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener( tabLayout ) );
        tabLayout.setOnTabSelectedListener( new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem( tab.getPosition() );
                if (tab.getPosition() == 1) {
                    Toast.makeText( MainActivity.this, " Select One ", Toast.LENGTH_LONG ).show();

                }
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