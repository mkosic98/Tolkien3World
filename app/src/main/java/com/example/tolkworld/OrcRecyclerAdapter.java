package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class OrcRecyclerAdapter extends RecyclerView.Adapter<OrcViewHolder> {
    OrcActivity orcActivity;
    List<AboutModel> modelList;

    public OrcRecyclerAdapter(OrcActivity orcActivity,List<AboutModel> modelList){
        this.orcActivity=orcActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public OrcViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_orc,viewGroup,false);

        return new OrcViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull OrcViewHolder orcViewHolder,int position){
        orcViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        orcViewHolder.tvDescription.setText(modelList.get(position).getDescription());
        Picasso.get().load(modelList.get(position).getImage()).into(orcViewHolder.mImage);

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}
