package com.example.tolkworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CharactersActivity extends AppCompatActivity {
    private Button mBtnElves,mBtnDwarves,mBtnMaiar,mBtnHobbits,mBtnMen,mBtnOrcs,mBtnEnts,mBtnOthers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);
        setUpLayout();
    }
    private void setUpLayout(){
        mBtnElves=findViewById(R.id.btnElves);
        mBtnDwarves=findViewById(R.id.btnDwarves);
        mBtnMaiar=findViewById(R.id.btnMaiar);
        mBtnHobbits=findViewById(R.id.btnHobbits);
        mBtnMen=findViewById(R.id.btnMen);
        mBtnOrcs=findViewById(R.id.btnOrcs);
        mBtnEnts=findViewById(R.id.btnEnts);
        mBtnOthers=findViewById(R.id.btnOthers);
        setUpListeners();
    }

   private void setUpListeners(){
        mBtnElves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(CharactersActivity.this,ElvesActivity.class );
                CharactersActivity.this.startActivity(myIntent);
            }
        });

        mBtnDwarves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(CharactersActivity.this,DwarvesActivity.class );
                CharactersActivity.this.startActivity(myIntent);
            }
        });

        mBtnMaiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(CharactersActivity.this,MaiarActivity.class );
                CharactersActivity.this.startActivity(myIntent);
            }
        });

        mBtnHobbits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(CharactersActivity.this,HobbitActivity.class );
                CharactersActivity.this.startActivity(myIntent);
            }
        });

        mBtnMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(CharactersActivity.this,MenActivity.class );
                CharactersActivity.this.startActivity(myIntent);
            }
        });

        mBtnOrcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(CharactersActivity.this,OrcActivity.class );
                CharactersActivity.this.startActivity(myIntent);
            }
        });
        mBtnEnts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(CharactersActivity.this,EntsActivity.class );
                CharactersActivity.this.startActivity(myIntent);
            }
        });

        mBtnOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(CharactersActivity.this,OthersActivity.class );
                CharactersActivity.this.startActivity(myIntent);
            }
        });

    }

}
