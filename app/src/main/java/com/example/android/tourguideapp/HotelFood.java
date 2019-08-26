package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HotelFood extends Fragment {
    private ArrayList<GetInfo> getInfos;
    View v1;
    private RecyclerView recyclerView1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v1 = inflater.inflate( R.layout.fragment_hotel_food, container, false );
        recyclerView1 = v1.findViewById( R.id.hotelFoodRecyclerView );
        InfoCustomAdapter infoCustomAdapter = new InfoCustomAdapter( getInfos, getContext() );
        recyclerView1.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        recyclerView1.setAdapter( infoCustomAdapter );
        return v1;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        getInfos = new ArrayList<>();

        getInfos.add( new GetInfo( R.drawable.panorama, "Bar Restorant Illyria Shkoder", "FEATURES:\n" +
                "Reservations, Outdoor Seating, Buffet, Seating, Waitstaff, Parking Available, Valet Parking," +
                "Accepts Visa, Digital Payments.", "Address: SH41 Zus 4001, Shkoder 4001, Albania", "Open Hours: 8AM - 11PM" ) );
        getInfos.add( new GetInfo( R.drawable.hotel_tradita_geg_tosk, "Hotel Tradita Geg & Tosk", "FEATURES:\n" +
                "Free Wifi,Free Parking,Breakfast included,Non-Smoking Rooms,Restaurant.",
                "Address: Street.Edit Durham No.4, Shkoder 4001", "Open Hours: 24/7" ) );
        getInfos.add( new GetInfo( R.drawable.peja_grill, "Peja Grill", "FEATURES:\n" +
                "Takeout, Reservations, Seating, Waitstaff, Parking Available, Street Parking,Television," +
                " Wheelchair Accessible, Full Bar,Wine and Beer,Delivery.",
                "Address: Bulevardi Skenderbeu,Lagjia Vasil Shanto,Shkoder", "Open Hours: 8AM - 12PM" ) );
    }
}