package com.example.kursusandroid;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GridBoongan extends AppCompatActivity {

    protected GridView tampil_grid;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_gridboongan);

        tampil_grid = findViewById(R.id.gv2);
        tampil_grid.setAdapter(new ImageAdapter2(this));

        tampil_grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(getBaseContext(), "Klik " + i , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
