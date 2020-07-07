package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MaiarRecyclerAdapter extends RecyclerView.Adapter<MaiarViewHolder> {
    MaiarActivity maiarActivity;
    List<AboutModel> modelList;

    public MaiarRecyclerAdapter(MaiarActivity maiarActivity,List<AboutModel> modelList){
        this.maiarActivity=maiarActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public MaiarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_maiar,viewGroup,false);

        return new MaiarViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull MaiarViewHolder maiarViewHolder,int position){
        maiarViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        maiarViewHolder.tvDescription.setText(modelList.get(position).getDescription());
        Picasso.get().load(modelList.get(position).getImage()).into(maiarViewHolder.mImage);

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}
