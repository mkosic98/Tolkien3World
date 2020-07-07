package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AboutRecyclerAdapter extends RecyclerView.Adapter<AboutViewHolder> {
    AboutActivity aboutActivity;
    List<AboutModel> modelList;

    public AboutRecyclerAdapter(AboutActivity aboutActivity,List<AboutModel> modelList){
        this.aboutActivity=aboutActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public AboutViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_about,viewGroup,false);

        return new AboutViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull AboutViewHolder aboutViewHolder,int position){
        aboutViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        aboutViewHolder.tvDescription.setText(modelList.get(position).getDescription());
        Picasso.get().load(modelList.get(position).getImage()).into(aboutViewHolder.mImage);

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}
