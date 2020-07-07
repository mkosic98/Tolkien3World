package com.example.tolkworld;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ElvesViewHolder extends RecyclerView.ViewHolder {
    TextView tvTitle,tvDescription;
    ImageView mImage;
    //View mView;

    public ElvesViewHolder(@NonNull View itemView){
        super(itemView);
        // mView=itemView;

        tvTitle=itemView.findViewById(R.id.tvTitle);
        tvDescription=itemView.findViewById(R.id.tvDescription);
        mImage=itemView.findViewById(R.id.rImage);
    }

    public void setName(String name){
        tvTitle.setText(name);
    }
}
