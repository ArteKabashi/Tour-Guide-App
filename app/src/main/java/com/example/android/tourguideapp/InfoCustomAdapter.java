package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoCustomAdapter extends RecyclerView.Adapter<InfoCustomAdapter.CustomViewHolder> {
    private ArrayList<GetInfo> GetInfos1;
    private Context context1;

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public ImageView Image1;
        public TextView Text1;
        public TextView Text2;
        public TextView Text3;
        public TextView Text5;
        public LinearLayout linearLayout2;

        public CustomViewHolder(@NonNull View itemView1) {

            super( itemView1 );
            Image1 = itemView1.findViewById( R.id.image_Id );
            Text1 = itemView1.findViewById( R.id.text_titleId );
            Text2 = itemView1.findViewById( R.id.pharagraphId );
            Text3 = itemView1.findViewById( R.id.addressId );
            Text5 = itemView1.findViewById( R.id.hoursId );
            linearLayout2 = itemView1.findViewById( R.id.linearlayout2 );
        }
    }

    public InfoCustomAdapter(ArrayList<GetInfo> getInfos, Context context) {
        GetInfos1 = getInfos;
        context1 = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view1 = LayoutInflater.from( parent.getContext() ).inflate( R.layout.info_item, parent, false );
        CustomViewHolder customViewHolder1 = new CustomViewHolder( view1 );
        return customViewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, final int position) {
        final GetInfo currentGetInfo = GetInfos1.get( position );

        customViewHolder.Image1.setImageResource( currentGetInfo.getHeaderImage( position ) );
        customViewHolder.Text1.setText( currentGetInfo.getHeaderTitle( position ) );
        customViewHolder.Text2.setText( currentGetInfo.getPharagraph( position ) );
        customViewHolder.Text3.setText( currentGetInfo.getAdress( position ) );
        customViewHolder.Text5.setText( currentGetInfo.getHours( position ) );
    }

    @Override
    public int getItemCount() {
        return GetInfos1.size();
    }
}
