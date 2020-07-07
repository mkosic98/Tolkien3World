package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class DwarvesRecyclerAdapter extends RecyclerView.Adapter<DwarvesViewHolder> {
    DwarvesActivity dwarvesActivity;
    List<AboutModel> modelList;

    public DwarvesRecyclerAdapter(DwarvesActivity dwarvesActivity,List<AboutModel> modelList){
        this.dwarvesActivity=dwarvesActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public DwarvesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_dwarves,viewGroup,false);

        return new DwarvesViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull DwarvesViewHolder dwarvesViewHolder,int position){
        dwarvesViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        dwarvesViewHolder.tvDescription.setText(modelList.get(position).getDescription());
        Picasso.get().load(modelList.get(position).getImage()).into(dwarvesViewHolder.mImage);

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}

