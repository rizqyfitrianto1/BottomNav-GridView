package com.example.kursusandroid.BottomNavigation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationViewPager;
import com.example.kursusandroid.R;

import java.util.ArrayList;

public class FragMainNav extends AppCompatActivity {

    AHBottomNavigationViewPager viewPager;
    AHBottomNavigationAdapter navigationAdapter;
    AHBottomNavigation bottomNavigation;
    Fragment currentFragment;
    NavBottomAdapter navBottomAdapter;
    boolean useMenuResources = true;
    int[] tabcolors;
    ArrayList<AHBottomNavigationItem> bottomNavigationItems = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_frag_main);

        viewPager = (AHBottomNavigationViewPager) findViewById(R.id.view_pager);
        bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottomNav);

        initUI();
    }

    private void initUI(){
        if(useMenuResources){
            tabcolors = getApplicationContext().getResources().getIntArray(R.array.tab_colors);
            navigationAdapter = new AHBottomNavigationAdapter(FragMainNav.this,R.menu.bottom_menu);
            navigationAdapter.setupWithBottomNavigation(bottomNavigation, tabcolors);
        }else {
            AHBottomNavigationItem item1 = new AHBottomNavigationItem("tab 1",R.mipmap.ic_launcher,
                    R.color.colorPrimary);
            AHBottomNavigationItem item2 = new AHBottomNavigationItem("tab 2",R.mipmap.ic_launcher,
                    R.color.colorPrimaryDark);
            AHBottomNavigationItem item3 = new AHBottomNavigationItem("tab 3",R.mipmap.ic_launcher,
                    R.color.colorPrimaryDark);
            AHBottomNavigationItem item4 = new AHBottomNavigationItem("tab 4",R.mipmap.ic_launcher,
                    R.color.colorPrimaryDark);
            AHBottomNavigationItem item5 = new AHBottomNavigationItem("tab 5",R.mipmap.ic_launcher,
                    R.color.colorPrimaryDark);
            bottomNavigation.addItem(item1);
            bottomNavigation.addItem(item2);
            bottomNavigation.addItem(item3);
            bottomNavigation.addItem(item4);
            bottomNavigation.addItem(item5);

            bottomNavigation.addItems(bottomNavigationItems);
        }

        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                if(currentFragment == null){
                    currentFragment = navBottomAdapter.getCurrentFragment();
                }
                viewPager.setCurrentItem(position, false);
                if(currentFragment == null){
                    return true;
                }
                currentFragment = navBottomAdapter.getCurrentFragment();
                return true;
            }
        });
        viewPager.setOffscreenPageLimit(4);
        navBottomAdapter = new NavBottomAdapter(getSupportFragmentManager());
        viewPager.setAdapter(navBottomAdapter);
        currentFragment = navBottomAdapter.getCurrentFragment();
    }
}
