package com.example.kursusandroid.BottomNavFragment.allfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.kursusandroid.R;

public class Kedua extends Fragment {

    public static Kedua newInstance(int id){
        Kedua fr = new Kedua();
        Bundle b = new Bundle();
        fr.setArguments(b);
        return fr;
    }

    EditText editText;
    Button button;

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View views = inflater.inflate(R.layout.nav_frag_dua,
                container, false);
        return views;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }
    @Override
    public  void onViewCreated(@NonNull View view,
                               @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        editText = (EditText) view.findViewById(R.id.edtNama);
        button = (Button) view.findViewById(R.id.btnClick);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().equals("")){
                    Toast.makeText(getActivity(), "please input correct name", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getActivity(),"Hello "+editText.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
