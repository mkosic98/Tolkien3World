package com.example.tolkworld;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SketchesViewHolder extends RecyclerView.ViewHolder {
    TextView tvTitle;
    ImageView mImage;
    //View mView;

    public SketchesViewHolder(@NonNull View itemView){
        super(itemView);
        // mView=itemView;

        tvTitle=itemView.findViewById(R.id.tvTitle);
        mImage=itemView.findViewById(R.id.rImage);
    }

    public void setName(String name){
        tvTitle.setText(name);
    }
}