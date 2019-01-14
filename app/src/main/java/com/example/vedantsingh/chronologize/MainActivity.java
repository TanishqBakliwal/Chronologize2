/*
 * Developed by Vedant Singh on 13 / 01 / 2019
 */


package com.example.vedantsingh.chronologize;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    FragmentTransaction ft;
    int currentMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if(currentMenu == menuItem.getItemId())
            return false;

        Fragment fragment = null;

        switch(menuItem.getItemId()) {

            case R.id.navigation_timeTable :
                fragment = new TimeTableFragment();
                break;
            case R.id.navigation_analytics :
                fragment = new AnalyticsFragment();
                break;
            case R.id.navigation_profile :
                fragment = new ProfileFragment();
                break;
        }

        currentMenu = menuItem.getItemId();

        if(fragment != null) {
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, fragment);
            ft.commitAllowingStateLoss();
            return true;
        }
        else return false;
    }



    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
