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

public class PlacesToVisitFragment extends Fragment {
    private ArrayList<NameImageFact> nameImageFactsList;
    View v;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate( R.layout.fragment_places_to_visit, container, false );
        recyclerView = v.findViewById( R.id.recycleView );
        CustomAdapter customAdapter = new CustomAdapter( nameImageFactsList, getContext() );
        recyclerView.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        recyclerView.setAdapter( customAdapter );
        return v;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        nameImageFactsList = new ArrayList<>();

        nameImageFactsList.add( new NameImageFact( "Shkodër",
                "Shkodër is one of the most ancient cities in Europe,dating as far back as the Illyrians and even beyond."
                , R.drawable.stema_shkoder ) );
        nameImageFactsList.add( new NameImageFact( "Tirana",
                "Tirana is the most-populous city in Albania by population",
                R.drawable.stema_tirane ) );
        nameImageFactsList.add( new NameImageFact( "Vlorë",
                "Vlorë is the third-most-populous city in Albania by population (141,513)",
                R.drawable.stema_vlore ) );
        nameImageFactsList.add( new NameImageFact( "Prizren",
                "Prizren has 85,119 inhabitants, while the municipality has 177,781 inhabitants.",
                R.drawable.stema_prizeren ) );
    }
}
