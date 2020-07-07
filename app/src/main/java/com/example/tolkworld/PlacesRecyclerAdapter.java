package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class PlacesRecyclerAdapter extends RecyclerView.Adapter<PlacesViewHolder> {
    ScreenSlidePageFragment placesActivity;
    List<AboutModel> modelList;

    public PlacesRecyclerAdapter(ScreenSlidePageFragment placesActivity,List<AboutModel> modelList){
        this.placesActivity=placesActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public PlacesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_places,viewGroup,false);

        return new PlacesViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull PlacesViewHolder placesViewHolder,int position){
        placesViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        placesViewHolder.tvDescription.setText(modelList.get(position).getDescription());
        Picasso.get().load(modelList.get(position).getImage()).into(placesViewHolder.mImage);

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}
