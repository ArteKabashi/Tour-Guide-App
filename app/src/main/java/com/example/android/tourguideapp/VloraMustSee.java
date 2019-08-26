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

public class VloraMustSee extends Fragment {
    private ArrayList<GetInfo> getInfos;
    View v1;
    private RecyclerView recyclerView1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v1 = inflater.inflate( R.layout.fragment_vlora_must_see, container, false );
        recyclerView1 = v1.findViewById( R.id.mustSeeRecycleView );
        InfoCustomAdapter infoCustomAdapter = new InfoCustomAdapter( getInfos, getContext() );
        recyclerView1.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        recyclerView1.setAdapter( infoCustomAdapter );
        return v1;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getInfos = new ArrayList<>();
        getInfos.add( new GetInfo( R.drawable.vlora_deti, "Vlorë Rivera", "Vlorë lies in the southwestern coastal region of Albania," +
                " at the southern end of the Adriatic Sea and the northern part the Ionian Sea. " +
                "The Vlore coastline accounts for about 30% of the entire coast of Albania and in" +
                " its proximity is located the Albanian Riviera.",
                "Address: Vlorë,Albania", "Open Hours: 24 hours" ) );
        getInfos.add( new GetInfo( R.drawable.sazan_ishujt, "Sazan Island", "Sazan is an island inside " +
                "the Mediterranean Sea in southern Albania." +
                "The island has a surface area of 5.7 km² with a length of 4.8 km," +
                " width of 2 km and a coastline of about 15 km.",
                "Address: Vlorë,Albania", "Open Hours: 24 hours" ) );
        getInfos.add( new GetInfo( R.drawable.monumenti_vlore, "Independence Monument", "The Monument of Independence is a monument in Vlorë, Albania, dedicated to the Albanian Declaration of Independence.",
                "Address: Sheshi i Flamurit, Vlorë 9401.", "Open Hours: 24 hours" ) );
    }
}
