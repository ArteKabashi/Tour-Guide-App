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

public class TiranaHotelFood extends Fragment {
    private ArrayList<GetInfo> getInfos;
    View v1;
    private RecyclerView recyclerView1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v1 = inflater.inflate( R.layout.fragment_tirana_hotel_food, container, false );
        recyclerView1 = v1.findViewById( R.id.hotelFoodTiranaRecyclerView );
        InfoCustomAdapter infoCustomAdapter = new InfoCustomAdapter( getInfos, getContext() );
        recyclerView1.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        recyclerView1.setAdapter( infoCustomAdapter );
        return v1;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        getInfos = new ArrayList<>();

        getInfos.add( new GetInfo( R.drawable.hotel_colosseo, "Hotel Colosseo", "FEATURES:\n" +
                " Free parking,Free WiFi,Airport shuttle,Restaurant,Family rooms,Non-smoking rooms ,Cocktail and lounge Bar.",
                "Address: Rruga e Durrësit,Sheshi Adem Jashari,Tirana", "Open Hours: 24 hours" ) );
        getInfos.add( new GetInfo( R.drawable.mullixhiu, "Mullixhiu",
                "CUISINES: Mediterranean, European, Albanian.\n" +
                        "SPECIAL DIETS: Vegetarian Friendly, Vegan Options, Gluten Free Options.",
                "Address: Shetitorja Lasgush Poradeci,Diga e Liqenit Artificial, Tirana", "Open Hours: 8AM - 12PM" ) );
        getInfos.add( new GetInfo( R.drawable.era_vila, "Era Vila", "FEATURES:\n" +
                "Takeout, Reservations, Seating, Waitstaff, Parking Available, Street Parking,Television," +
                " Wheelchair Accessible, Full Bar,Wine and Beer,Delivery.",
                "Address: Str.Papa Gjon Pali II,Vila Nr 11,Tirana", "Open Hours: 8AM - 12PM" ) );
    }
}

