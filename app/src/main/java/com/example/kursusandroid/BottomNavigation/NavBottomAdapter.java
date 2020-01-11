package com.example.kursusandroid.BottomNavigation;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.kursusandroid.BottomNavFragment.allfragments.Kedua;
import com.example.kursusandroid.BottomNavFragment.allfragments.Keempat;
import com.example.kursusandroid.BottomNavFragment.allfragments.Kelima;
import com.example.kursusandroid.BottomNavFragment.allfragments.Ketiga;
import com.example.kursusandroid.BottomNavFragment.allfragments.Pertama;

public class NavBottomAdapter extends FragmentPagerAdapter {
    final int RG = 5;
    private Fragment currentFragment;

    public NavBottomAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem ( int i){
        switch (i) {
            case 0: {
                currentFragment = Pertama.newInstance(0);
            }
            break;
            case 1: {
                currentFragment = Kedua.newInstance(1);
            }
            break;
            case 2: {
                currentFragment = Ketiga.newInstance(2);
            }
            break;
            case 3: {
                currentFragment = Keempat.newInstance(3);
            }
            break;
            case 4: {
                currentFragment = Kelima.newInstance(4);
            }
        }
        return currentFragment;
    }

    @Override
    public int getCount(){
        return RG;
    }

    @Override
    public void setPrimaryItem(@Nullable ViewGroup container,
                               int position, @NonNull Object object){
        super.setPrimaryItem(container, position, object);
    }
    public Fragment getCurrentFragment(){
        return currentFragment;
    }
}
