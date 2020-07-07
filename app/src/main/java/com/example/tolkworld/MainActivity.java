package com.example.tolkworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button mBtnAbout,mBtnCharacters, mBtnPlaces,mBtnLanguages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpLayout();
    }

    private void setUpLayout(){
        mBtnAbout=findViewById(R.id.btnAbout);
        mBtnCharacters=findViewById(R.id.btnCharacters);
        mBtnPlaces=findViewById(R.id.btnPlaces);
        mBtnLanguages=findViewById(R.id.btnLanguages);
        setUpListeners();
    }

    private void setUpListeners(){
        mBtnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(MainActivity.this,AboutActivity.class );
                MainActivity.this.startActivity(myIntent);
            }
        });

       mBtnCharacters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(MainActivity.this,CharactersActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        mBtnPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(MainActivity.this, PlacesActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

       mBtnLanguages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(MainActivity.this, LanguagesActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

    }
}
