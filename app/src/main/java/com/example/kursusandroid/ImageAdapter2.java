package com.example.kursusandroid;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter2 extends BaseAdapter {
    private int[] gambar ={
            R.drawable.gmb1,
            R.drawable.gmb2,
            R.drawable.gmb3,
            R.drawable.gmb4,
            R.drawable.gmb5,
            R.drawable.gmb6,
            R.drawable.gmb7,
            R.drawable.gmb8,
    };

    private Context mContext;

    ImageAdapter2(Context c){
        mContext = c;
    }

    public int getCount(){
        return gambar.length;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }


    //Membuat ImageView baru untuk setiap item yang direferensikan oleh Adaptor
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imageView;

        //Jika tidak di daur ulang
        if (convertView == null) {
            //Menginisialisasi beberapa atribut
            imageView = new ImageView(mContext);
            //Mengatur panjang dan lebar pada ImageView
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //mengatur padding
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        //Mengset Image dari Resource/Sumber berdasarkan posisinya
        imageView.setImageResource(gambar[i]);
        return imageView;
    }
}
