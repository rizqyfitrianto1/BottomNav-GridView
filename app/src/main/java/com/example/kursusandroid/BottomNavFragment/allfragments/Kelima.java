package com.example.kursusandroid.BottomNavFragment.allfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.kursusandroid.R;

public class Kelima extends Fragment {
    public static Kelima newInstance(int id){
        Kelima fr = new Kelima();
        Bundle b = new Bundle();
        fr.setArguments(b);
        return fr;
    }
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View views = inflater.inflate(R.layout.nav_frag_lima,
                container, false);
        return views;
    }
}
