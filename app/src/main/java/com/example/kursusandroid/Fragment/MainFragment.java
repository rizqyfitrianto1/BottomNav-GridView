package com.example.kursusandroid.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.kursusandroid.R;

public class MainFragment extends AppCompatActivity implements View.OnClickListener {

    Button button;
    Boolean kondisi = true;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layar_utama);

        button = findViewById(R.id.btnChange);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.btnChange:
                if(kondisi){
                    FragSatu satu = new FragSatu();
                    FragmentManager FM = getSupportFragmentManager();
                    FragmentTransaction FT = FM.beginTransaction();
                    FT.replace(R.id.main_menu, satu);
                    FT.commit();
                    kondisi = false;
                }else{
                    FragDua dua = new FragDua();
                    FragmentManager FM2 = getSupportFragmentManager();
                    FragmentTransaction FT2 = FM2.beginTransaction();
                    FT2.replace(R.id.main_menu, dua);
                    FT2.commit();
                    kondisi = true;
                }
            break;
        }
    }

}
