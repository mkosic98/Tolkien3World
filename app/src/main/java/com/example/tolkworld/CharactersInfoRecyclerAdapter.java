package com.example.tolkworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CharactersInfoRecyclerAdapter extends RecyclerView.Adapter<CharactersInfoViewHolder> {
    CharactersInfoActivity characterInfoActivity;
    List<AboutModel> modelList;

    public CharactersInfoRecyclerAdapter(CharactersInfoActivity characterInfoActivity,List<AboutModel> modelList){
        this.characterInfoActivity=characterInfoActivity;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public CharactersInfoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int position){

        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_name_charactersinfo,viewGroup,false);

        return new CharactersInfoViewHolder(itemView);


    }
    @Override
    public void onBindViewHolder(@NonNull CharactersInfoViewHolder charactersInfoViewHolder,int position){
        charactersInfoViewHolder.tvTitle.setText(modelList.get(position).getTitle());
        charactersInfoViewHolder.tvDescription.setText(modelList.get(position).getDescription());

    }
    @Override
    public int getItemCount(){
        return modelList.size();
    }
}
