package com.example.tolkworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.accessibility.AccessibilityRecord;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MaiarActivity extends AppCompatActivity {
    private RecyclerView recycler;
    List<AboutModel> modelList=new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;
    MaiarRecyclerAdapter adapter;
    FirebaseFirestore db;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maiar);

        db=FirebaseFirestore.getInstance();
        progressDialog=new ProgressDialog(this);

        recycler=findViewById(R.id.rvMaiarRecycler);
        recycler.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);
        showData();

    }

    private void showData(){
        progressDialog.setTitle("Loading...");
        progressDialog.show();


        db.collection("Maiar")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        progressDialog.dismiss();

                        for(DocumentSnapshot doc: Objects.requireNonNull(task.getResult())){
                            AboutModel model=new AboutModel(doc.getString("title"),
                                    doc.getString("description"),
                                    doc.getString("image"));

                            modelList.add(model);
                        }

                        adapter=new MaiarRecyclerAdapter(MaiarActivity.this,modelList);
                        recycler.setAdapter(adapter);
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        progressDialog.dismiss();
                        Toast.makeText(MaiarActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });
    }
}

