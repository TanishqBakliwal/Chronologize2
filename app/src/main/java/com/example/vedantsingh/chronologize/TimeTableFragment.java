package com.example.vedantsingh.chronologize;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import android.support.v4.app.Fragment;

public  class TimeTableFragment extends Fragment {

    View parentHolder;
    Activity referenceActivity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        parentHolder = inflater.inflate(R.layout.fragment_timetable, container, false);
        referenceActivity = getActivity();
        final LinearLayout mon = referenceActivity.findViewById(R.id.mon);
        final LinearLayout tue = referenceActivity.findViewById(R.id.tue);
        final LinearLayout wed = referenceActivity.findViewById(R.id.wed);
        final LinearLayout thu = referenceActivity.findViewById(R.id.thu);
        final LinearLayout fri = referenceActivity.findViewById(R.id.fri);
        final LinearLayout sat = referenceActivity.findViewById(R.id.sat);

         /*mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams params = mon.getLayoutParams();

                params.height = params.height + 100;
                params.width = params.width + 32;
                mon.setLayoutParams(params);

                LinearLayout lay = (LinearLayout) getActivity().findViewById(R.id.tue);

                ViewGroup.LayoutParams param = mon.getLayoutParams();
                param.height = param.height - 100;
                param.width = param.width - 32;
                lay.setLayoutParams(param);
            }
        });

        tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams params = tue.getLayoutParams();

                params.height = params.height + 100;
                params.width = params.width + 32;
                tue.setLayoutParams(params);

                LinearLayout lay = (LinearLayout) getActivity().findViewById(R.id.wed);

                ViewGroup.LayoutParams param = tue.getLayoutParams();
                param.height = param.height - 100;
                param.width = param.width - 32;
                lay.setLayoutParams(param);


                LinearLayout lay2 = (LinearLayout) getActivity().findViewById(R.id.mon);

                ViewGroup.LayoutParams param2 = tue.getLayoutParams();
                param2.height = param2.height - 100;
                param2.width = param2.width - 32;
                lay2.setLayoutParams(param2);
            }
        });

        wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams params = wed.getLayoutParams();

                params.height = params.height + 100;
                params.width = params.width + 32;
                wed.setLayoutParams(params);

                LinearLayout lay = (LinearLayout) getActivity().findViewById(R.id.tue);

                ViewGroup.LayoutParams param = wed.getLayoutParams();
                param.height = param.height - 100;
                param.width = param.width - 32;
                lay.setLayoutParams(param);


                LinearLayout lay2 = (LinearLayout) getActivity().findViewById(R.id.thu);

                ViewGroup.LayoutParams param2 = wed.getLayoutParams();
                param2.height = param2.height - 100;
                param2.width = param2.width - 32;
                lay2.setLayoutParams(param2);
            }
        });

        thu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams params = thu.getLayoutParams();

                params.height = params.height + 100;
                params.width = params.width + 32;
                thu.setLayoutParams(params);

                LinearLayout lay = (LinearLayout) getActivity().findViewById(R.id.fri);

                ViewGroup.LayoutParams param = thu.getLayoutParams();
                param.height = param.height - 100;
                param.width = param.width - 32;
                lay.setLayoutParams(param);


                LinearLayout lay2 = (LinearLayout) getActivity().findViewById(R.id.wed);

                ViewGroup.LayoutParams param2 = thu.getLayoutParams();
                param2.height = param2.height - 100;
                param2.width = param2.width - 32;
                lay2.setLayoutParams(param2);
            }
        });

        fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams params = fri.getLayoutParams();

                params.height = params.height + 100;
                params.width = params.width + 32;
                fri.setLayoutParams(params);


                LinearLayout lay = (LinearLayout) getActivity().findViewById(R.id.thu);

                ViewGroup.LayoutParams param = fri.getLayoutParams();
                param.height = param.height - 100;
                param.width = param.width - 32;
                lay.setLayoutParams(param);


                LinearLayout lay2 = (LinearLayout) getActivity().findViewById(R.id.wed);

                ViewGroup.LayoutParams param2 = fri.getLayoutParams();
                param2.height = param2.height - 100;
                param2.width = param2.width - 32;
                lay2.setLayoutParams(param2);
            }
        });

        sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams params = sat.getLayoutParams();

                LinearLayout lay = (LinearLayout) getActivity().findViewById(R.id.fri);

                ViewGroup.LayoutParams param = sat.getLayoutParams();
                param.height = param.height - 100;
                param.width = param.width - 32;
                lay.setLayoutParams(param);


                params.height = params.height + 100;
                params.width = params.width + 32;
                sat.setLayoutParams(params);
            }
        });*/

        return parentHolder;
    }
}
