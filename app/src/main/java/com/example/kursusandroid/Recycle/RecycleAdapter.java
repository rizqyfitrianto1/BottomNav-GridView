package com.example.kursusandroid.Recycle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.kursusandroid.R;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    private ArrayList<String> dataRv;

    public RecycleAdapter(ArrayList<String> masukanData){
        dataRv = masukanData;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView, textView2;

        public ViewHolder (View v){
            super(v);
            textView = (TextView) v.findViewById(R.id.txt1);
            textView2 = (TextView) v.findViewById(R.id.txt2);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String name = dataRv.get(position);
        holder.textView.setText(dataRv.get(position));
        holder.textView2.setText("data" + position);
    }

    @Override
    public int getItemCount() {
        return dataRv.size();
    }
}
