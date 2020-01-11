package com.example.kursusandroid.Recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kursusandroid.R;

import java.util.ArrayList;

public class RecyclerviewCuy extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_cuy);

        dataSet = new ArrayList<>();
        initDataset();

            recyclerView = (RecyclerView) findViewById(R.id.rv);
            recyclerView.setHasFixedSize(true);

            layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);

            adapter = new RecycleAdapter(dataSet);
            recyclerView.setAdapter(adapter);
    }

    private void initDataset(){
        dataSet.add("Joko");
        dataSet.add("Bagus");
        dataSet.add("Wisnu");
        dataSet.add("Angga");
        dataSet.add("Agus");
        dataSet.add("Arif");
    }
}
