package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class HobbitRecyclerAdapter extends RecyclerView.Adapter<HobbitViewHolder> {
    HobbitActivity hobbitActivity;
    List<AboutModel> modelList;

    public HobbitRecyclerAdapter(HobbitActivity hobbitActivity,List<AboutModel> modelList){
        this.hobbitActivity=hobbitActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public HobbitViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_hobbit,viewGroup,false);

        return new HobbitViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull HobbitViewHolder hobbitViewHolder,int position){
        hobbitViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        hobbitViewHolder.tvDescription.setText(modelList.get(position).getDescription());
        Picasso.get().load(modelList.get(position).getImage()).into(hobbitViewHolder.mImage);

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}
