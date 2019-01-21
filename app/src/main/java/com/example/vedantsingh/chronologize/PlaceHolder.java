/*
 * Created by Vedant Singh on 18/01/2019
*/
package com.example.vedantsingh.chronologize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlaceHolder extends AppCompatActivity {

    ArrayList<String> CourseList = new ArrayList<>();
    private RecyclerView CourseView;
    private RecyclerView.Adapter courseAdapter;


    public void new_tt(final View view) {

        EditText course2 = findViewById(R.id.course2);
        EditText slot2 = findViewById(R.id.slot2);
        String c = course2.getText().toString();
        CourseList.add(c);

        course2.setText("");
        slot2.setText("");

        Toast.makeText(PlaceHolder.this, "Course Added", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState );
        setContentView(R.layout.activity_place_holder);


//        CourseList.add("CS1130");
//        CourseList.add("ID1370");

        CourseView = findViewById(R.id.course_recycler);
        courseAdapter = new CourseAdapter(CourseList);
//        StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
        CourseView.setAdapter(courseAdapter);
//        courseAdapter.notifyDataSetChanged();
        CourseView.setLayoutManager(new LinearLayoutManager(this));

    }




}
