package com.example.android.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private ArrayList<NameImageFact> NameImageFacts1;
    private Context context1;

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public ImageView Img;
        public TextView PlaceNameTextView;
        public TextView FactsTextView;
        public RelativeLayout relativeLayout1;

        public CustomViewHolder(@NonNull View itemView) {
            super( itemView );

            Img = itemView.findViewById( R.id.stema );
            PlaceNameTextView = itemView.findViewById( R.id.name_place );
            FactsTextView = itemView.findViewById( R.id.facts_id );
            relativeLayout1 = itemView.findViewById( R.id.placesItemId );
        }
    }

    public CustomAdapter(ArrayList<NameImageFact> nameImageFactsList, Context context) {
        NameImageFacts1 = nameImageFactsList;
        context1 = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view1 = LayoutInflater.from( parent.getContext() ).inflate( R.layout.places_item, parent, false );
        CustomViewHolder customViewHolder1 = new CustomViewHolder( view1 );
        return customViewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, final int position) {
        final NameImageFact currentNameImageFacts = NameImageFacts1.get( position );

        customViewHolder.PlaceNameTextView.setText( currentNameImageFacts.getNameOfPlace( position ) );
        customViewHolder.FactsTextView.setText( currentNameImageFacts.getFactsAboutPlace( position ) );
        customViewHolder.Img.setImageResource( currentNameImageFacts.getPlaceImage( position ) );

        customViewHolder.relativeLayout1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent( context1, Info.class );
                        context1.startActivity( intent );
                        Toast.makeText( context1, "Shkoder", Toast.LENGTH_SHORT ).show();
                        break;
                    case 1:
                        Intent intent1 = new Intent( context1, Tirana.class );
                        context1.startActivity( intent1 );
                        Toast.makeText( context1, "Tirana", Toast.LENGTH_SHORT ).show();
                        break;
                    case 2:
                        Intent intent2 = new Intent( context1, Vlore.class );
                        context1.startActivity( intent2 );
                        Toast.makeText( context1, "Vlore", Toast.LENGTH_SHORT ).show();
                        break;
                    case 3:
                        Intent intent3 = new Intent( context1, Prizren.class );
                        context1.startActivity( intent3 );
                        Toast.makeText( context1, "Prizren", Toast.LENGTH_SHORT ).show();
                        break;
                    default:
                        break;
                }
            }
        } );
    }

    @Override
    public int getItemCount() {
        return NameImageFacts1.size();
    }
}
