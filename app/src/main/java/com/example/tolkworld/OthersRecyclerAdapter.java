package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class OthersRecyclerAdapter extends RecyclerView.Adapter<OthersViewHolder> {
    OthersActivity othersActivity;
    List<AboutModel> modelList;

    public OthersRecyclerAdapter(OthersActivity othersActivity,List<AboutModel> modelList){
        this.othersActivity=othersActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public OthersViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_others,viewGroup,false);

        return new OthersViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull OthersViewHolder othersViewHolder,int position){
        othersViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        othersViewHolder.tvDescription.setText(modelList.get(position).getDescription());
        Picasso.get().load(modelList.get(position).getImage()).into(othersViewHolder.mImage);

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}
