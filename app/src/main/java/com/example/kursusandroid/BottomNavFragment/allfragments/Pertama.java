package com.example.kursusandroid.BottomNavFragment.allfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.kursusandroid.R;

public class Pertama extends Fragment {
    public static Pertama newInstance(int id){
        Pertama fr = new Pertama();
        Bundle b = new Bundle();
        fr.setArguments(b);
        return fr;
    }
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View views = inflater.inflate(R.layout.nav_frag_satu,
                container, false);
        return views;
    }
}
