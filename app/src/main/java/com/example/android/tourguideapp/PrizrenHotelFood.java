package com.example.android.tourguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PrizrenHotelFood extends Fragment {
    private ArrayList<GetInfo> getInfos;
    View v1;
    private RecyclerView recyclerView1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v1 = inflater.inflate( R.layout.fragment_prizren_hotel_food, container, false );
        recyclerView1 = v1.findViewById( R.id.hotelFoodRecyclerView );
        InfoCustomAdapter infoCustomAdapter = new InfoCustomAdapter( getInfos, getContext() );
        recyclerView1.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        recyclerView1.setAdapter( infoCustomAdapter );
        return v1;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        getInfos = new ArrayList<>();

        getInfos.add( new GetInfo( R.drawable.restaurant_natyra, "Restorant Natura", "FEATURES:\n" +
                "Reservations, Outdoor Seating, Buffet, Seating, Waitstaff, Parking Available.",
                "Address: 115,Prizren", "Open Hours: 8AM - 11PM" ) );
        getInfos.add( new GetInfo( R.drawable.hotel_theranda, "Hotel Theranda", "FEATURES:\n" +
                "Free Wifi,Free Parking,Breakfast included,Non-Smoking Rooms,Restaurant.",
                "Address: St.Adem Jashari Shadervan,Prizren", "Open Hours: 24 hours" ) );
        getInfos.add( new GetInfo( R.drawable.marashi, "Marashi", "FEATURES:\n" +
                "Takeout, Reservations, Seating, Waitstaff, Parking Available, Street Parking,Television," +
                " Wheelchair Accessible, Full Bar,Wine and Beer,Delivery.",
                "Address: Vatrat Shqiptare P.N,Prizren", "Open Hours: 8AM - 12PM" ) );
    }

}