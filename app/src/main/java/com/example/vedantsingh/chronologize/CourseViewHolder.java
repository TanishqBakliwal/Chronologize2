/*
 * Created by Vedant Singh on 18/01/2019
 */

package com.example.vedantsingh.chronologize;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseViewHolder extends RecyclerView.ViewHolder {
    public TextView tagText;
    public ImageView tagIcon;
    public CourseViewHolder(@NonNull View itemView) {
        super(itemView);
        tagText = itemView.findViewById(R.id.tagTxt);
        tagIcon = itemView.findViewById(R.id.tagCross);
    }
}
