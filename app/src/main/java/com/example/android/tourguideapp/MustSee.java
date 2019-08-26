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

public class MustSee extends Fragment {
    private ArrayList<GetInfo> getInfos;
    View v1;
    private RecyclerView recyclerView1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v1 = inflater.inflate( R.layout.fragment_must_see, container, false );
        recyclerView1 = v1.findViewById( R.id.mustSeeRecycleView );
        InfoCustomAdapter infoCustomAdapter = new InfoCustomAdapter( getInfos, getContext() );
        recyclerView1.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        recyclerView1.setAdapter( infoCustomAdapter );
        return v1;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getInfos = new ArrayList<>();
        getInfos.add( new GetInfo( R.drawable.kalaja_e_rozafes, "Rozafa Castle", "Rozafa Castle is a castle near the city of Shkodër, in northwestern Albania. " +
                "It rises imposingly on a rocky hill, 130 metres above sea level, " +
                "surrounded by the Buna and Drin rivers.", "Address: Rruga Rozafa, Shkodër", "Open Hours: 8AM - 7PM" ) );
        getInfos.add( new GetInfo( R.drawable.marubi_museum, "Marubi Museum", "The National Museum of Photography \"Marubi\" is Albania's only museum dedicated entirely to photography." +
                " It houses a vast collection of 500,294 photographs dating back from 1858.",
                "Address: Nr.32,Kolë Idromeno,Shkodër", "Open Hours: 9AM - 5PM" ) );
        getInfos.add( new GetInfo( R.drawable.liqeni_i_shkodres, "Lake Shkodër", "Lake Shkodër — also called Lake Skadar— lies on the border of Albania and Montenegro, and is the largest" +
                " lake in Southern Europe. It is named after the city of Shkodër in northern Albania.",
                "Address: Shkodër,Albania", "Open Hours: 7AM - 5PM" ) );
    }
}
