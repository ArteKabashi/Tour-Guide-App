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

public class TiranaMustSee extends Fragment {
    private ArrayList<GetInfo> getInfos;
    View v1;
    private RecyclerView recyclerView1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v1 = inflater.inflate( R.layout.fragment_tirana_must_see, container, false );
        recyclerView1 = v1.findViewById( R.id.tiranaMustSeeRecycleView );
        InfoCustomAdapter infoCustomAdapter = new InfoCustomAdapter( getInfos, getContext() );
        recyclerView1.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        recyclerView1.setAdapter( infoCustomAdapter );
        return v1;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getInfos = new ArrayList<>();
        getInfos.add( new GetInfo( R.drawable.skenderbeg_square, "Skenderbeg Square", "The Skanderbeg Square is the main plaza in the centre of Tirana. " +
                "The square is named after the Albanian national hero Gjergj Kastrioti Skënderbeu. ",
                "Address: Sheshi Skënderbej,Tirana.", "Open Hours: 24 hours" ) );
        getInfos.add( new GetInfo( R.drawable.pyramid_of_tirana, "Pyramid of Tirana", "The Pyramid of Tirana is a structure and former museum located in Tirana, Albania",
                "Address: Tirana, Albania", "Open Hours: 24 hours." ) );
        getInfos.add( new GetInfo( R.drawable.muzeu_historik_kombetar, "National Museum of History", "The National Museum of History is a historical museum in Tirana." +
                "It was opened on 28 October 1981 and is 27,000 square metres in size.",
                "Address: Sheshi Skënderbej 1, Tirana 1000.", "Open Hours: 9AM - 7PM" ) );
    }
}
