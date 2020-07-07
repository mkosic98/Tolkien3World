package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ElvesRecyclerAdapter extends RecyclerView.Adapter<ElvesViewHolder> {
    ElvesActivity elvesActivity;
    List<AboutModel> modelList;

    public ElvesRecyclerAdapter(ElvesActivity elvesActivity,List<AboutModel> modelList){
        this.elvesActivity=elvesActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public ElvesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_elves,viewGroup,false);

        return new ElvesViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull ElvesViewHolder elvesViewHolder,int position){
        elvesViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        elvesViewHolder.tvDescription.setText(modelList.get(position).getDescription());
        Picasso.get().load(modelList.get(position).getImage()).into(elvesViewHolder.mImage);

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}
