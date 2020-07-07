package com.example.tolkworld;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.example.tolkworld.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScreenSlidePageFragment extends Fragment {
    private static final String BUNDLE_MESSAGE = "message";
    private TextView mMessageTextView;
    private RecyclerView recycler;
    List<AboutModel> modelList=new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;
    PlacesRecyclerAdapter adapter;
    FirebaseFirestore db;
    ProgressDialog progressDialog;

    public static ScreenSlidePageFragment newInstance(String message) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putString(BUNDLE_MESSAGE, message);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_screen_slide_page, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        db=FirebaseFirestore.getInstance();
        progressDialog=new ProgressDialog(getContext());

        recycler=view.findViewById(R.id.rvPlacesRecycler);
        recycler.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getContext());
        recycler.setLayoutManager(layoutManager);
        showData();



    }



    private void showData(){
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
                                    doc.getString("description"),doc.getString("image"));

                            modelList.add(model);
                        }

                        adapter=new PlacesRecyclerAdapter(ScreenSlidePageFragment.this,modelList);
                        recycler.setAdapter(adapter);
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        progressDialog.dismiss();
                        Toast.makeText(getContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });
    }

}