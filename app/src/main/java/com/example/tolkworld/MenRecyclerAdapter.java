package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MenRecyclerAdapter extends RecyclerView.Adapter<MenViewHolder> {
    MenActivity menActivity;
    List<AboutModel> modelList;

    public MenRecyclerAdapter(MenActivity menActivity,List<AboutModel> modelList){
        this.menActivity=menActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public MenViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_men,viewGroup,false);

        return new MenViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull MenViewHolder menViewHolder,int position){
        menViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        menViewHolder.tvDescription.setText(modelList.get(position).getDescription());
        Picasso.get().load(modelList.get(position).getImage()).into(menViewHolder.mImage);

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}
