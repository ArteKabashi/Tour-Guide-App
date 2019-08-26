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

public class PrizrenMustSee extends Fragment {
    private ArrayList<GetInfo> getInfos;
    View v1;
    private RecyclerView recyclerView1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v1 = inflater.inflate( R.layout.fragment_prizren_must_see, container, false );
        recyclerView1 = v1.findViewById( R.id.mustSeeRecycleView );
        InfoCustomAdapter infoCustomAdapter = new InfoCustomAdapter( getInfos, getContext() );
        recyclerView1.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        recyclerView1.setAdapter( infoCustomAdapter );
        return v1;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getInfos = new ArrayList<>();
        getInfos.add( new GetInfo( R.drawable.kalaja_e_prizerenit, "Prizren Fortress",
                "Prizren Fortress is a medieval fortress in Prizren.", "Address: Prizren", "Open Hours: 24 hours" ) );
        getInfos.add( new GetInfo( R.drawable.ura_prizren, "The Old Bridge", "The Old Bridge is located in the old city core." +
                "The Old Bridge consists of three arches, where the middle arch is the largest," +
                "whereas the side arches are smaller and are not the same that makes the bridge asymmetric.",
                "Address: Prizren", "Open Hours: 24 hours" ) );
        getInfos.add( new GetInfo( R.drawable.lidhja_e_prizrenit, "Albanian League of Prizren", "Albanian League of Prizren is a monument located in the " +
                "center of Prizren which became historically important since 1878 when the League of Prizren was organized there." +
                " It was an assembly consisting of 300 representatives from " +
                "all Albanian inhabited territories.",
                "Address: Prizren", "Open Hours: 24 hours" ) );
    }
}