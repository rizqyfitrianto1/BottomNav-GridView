package com.example.kursusandroid.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.kursusandroid.R;

public class FragSatu extends Fragment {

    public FragSatu(){

    }

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View viewFrag1 = inflater.inflate(R.layout.activity_frag_satu, container, false);
        return viewFrag1;
    }
}
