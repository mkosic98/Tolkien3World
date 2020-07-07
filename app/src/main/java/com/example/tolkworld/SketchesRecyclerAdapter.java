package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class SketchesRecyclerAdapter extends RecyclerView.Adapter<SketchesViewHolder> {
    ScreenSlidePageSecondFragment placesActivity;
    List<ImageModel> modelList;

    public SketchesRecyclerAdapter(ScreenSlidePageSecondFragment placesActivity,List<ImageModel> modelList){
        this.placesActivity=placesActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public SketchesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_sketches,viewGroup,false);

        return new SketchesViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull SketchesViewHolder sketchesViewHolder,int position){
        sketchesViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        Picasso.get().load(modelList.get(position).getImage()).into(sketchesViewHolder.mImage);

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}
