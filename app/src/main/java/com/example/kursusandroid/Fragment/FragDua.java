package com.example.kursusandroid.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.kursusandroid.R;

public class FragDua extends Fragment {
    public FragDua(){

    }

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View viewFrag2 = inflater.inflate(R.layout.activity_frag_dua, container, false);
        return viewFrag2;
    }
}
