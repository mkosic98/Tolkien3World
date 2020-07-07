package com.example.tolkworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.accessibility.AccessibilityRecord;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlacesActivity extends AppCompatActivity {
  /*  private RecyclerView recycler;
    List<AboutModel> modelList=new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;
    PlacesRecyclerAdapter adapter;
    FirebaseFirestore db;*/
    ViewPager mViewPager;
    TabLayout mTabLayout;
   // ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

       /* db=FirebaseFirestore.getInstance();
        progressDialog=new ProgressDialog(this);

        recycler=findViewById(R.id.rvPlacesRecycler);
        recycler.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);
        showData();
*/

        initViews();
        setupPager();

    }

   private void initViews() {
        mViewPager = findViewById(R.id.viewPager);
        mTabLayout=findViewById(R.id.tab);
    }

    private void setupPager() {
        PagerAdapter pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }




   /* private void showData(){
        progressDialog.setTitle("Loading...");
        progressDialog.show();


        db.collection("Places")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        progressDialog.dismiss();

                        for(DocumentSnapshot doc: Objects.requireNonNull(task.getResult())){
                            AboutModel model=new AboutModel(doc.getString("title"),
                                    doc.getString("description"));

                            modelList.add(model);
                        }

                        adapter=new PlacesRecyclerAdapter(PlacesActivity.this,modelList);
                        recycler.setAdapter(adapter);
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        progressDialog.dismiss();
                        Toast.makeText(PlacesActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });
    }*/
}
