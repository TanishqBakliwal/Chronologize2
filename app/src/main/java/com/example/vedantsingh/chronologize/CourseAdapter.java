/*
 * Created By Vedant Singh on 18/01/2019
 */

package com.example.vedantsingh.chronologize;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseViewHolder> {
    ArrayList<String> mCourseList;

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CourseViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.course_tag,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder viewHolder, int i) {
        viewHolder.tagIcon.setVisibility(View.GONE);
        viewHolder.tagText.setText(mCourseList.get(i));
    }

    @Override
    public int getItemCount() {
        return mCourseList.size();
    }

    public CourseAdapter(ArrayList<String> CourseList) {
        mCourseList = CourseList;
    }
}
