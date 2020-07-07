package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LayoutAnimationController;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LanguagesRecyclerAdapter extends RecyclerView.Adapter<LanguagesViewHolder> {
    LanguagesActivity languagesActivity;
    List<Model> modelList;

    public LanguagesRecyclerAdapter(LanguagesActivity languagesActivity,List<Model> modelList){
        this.languagesActivity=languagesActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public LanguagesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_languages,viewGroup,false);

        return new LanguagesViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull LanguagesViewHolder languagesViewHolder,int position){
        languagesViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        languagesViewHolder.tvDescription.setText(modelList.get(position).getDescription());

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}
