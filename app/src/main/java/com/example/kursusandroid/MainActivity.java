package com.example.kursusandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] listnegara = {"Indonesia", "Laos", "Singapura", "Vietnam"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_listview);

        listView = findViewById(R.id.item);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_main, listnegara);

        listView.setAdapter(adapter);

    }
}
