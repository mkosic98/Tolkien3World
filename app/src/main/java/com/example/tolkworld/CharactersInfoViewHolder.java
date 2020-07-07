package com.example.tolkworld;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharactersInfoViewHolder extends RecyclerView.ViewHolder {
    TextView tvTitle,tvDescription;
    //View mView;

    public CharactersInfoViewHolder(@NonNull View itemView){
        super(itemView);
        // mView=itemView;

        tvTitle=itemView.findViewById(R.id.tvTitle);
        tvDescription=itemView.findViewById(R.id.tvDescription);
    }

    public void setName(String name){
        tvTitle.setText(name);
    }
}
