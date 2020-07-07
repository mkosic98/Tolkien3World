package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class EntsRecyclerAdapter extends RecyclerView.Adapter<EntsViewHolder> {
    EntsActivity entsActivity;
    List<AboutModel> modelList;

    public EntsRecyclerAdapter(EntsActivity entsActivity,List<AboutModel> modelList){
        this.entsActivity=entsActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public EntsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_ents,viewGroup,false);

        return new EntsViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull EntsViewHolder entsViewHolder,int position){
        entsViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        entsViewHolder.tvDescription.setText(modelList.get(position).getDescription());
        Picasso.get().load(modelList.get(position).getImage()).into(entsViewHolder.mImage);

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}
