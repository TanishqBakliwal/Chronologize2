/*
 * Created By Vedant Singh on 19/01/2019
 */

package com.example.vedantsingh.chronologize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateTimeTable extends AppCompatActivity {
    ArrayList <String> CourseList = new ArrayList<>();
    TextView code = findViewById(R.id.course2);
    TextView slot = findViewById(R.id.slot2);
    Button addCourse = findViewById(R.id.add2);
    private RecyclerView courseView;
    private CourseAdapter courseAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_time_table);

        /*courseView = findViewById(R.id.course_recycler);
        courseAdapter = new CourseAdapter(CourseList);
        courseView.setAdapter(courseAdapter);

        addCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String courseCode, Slot;
                courseCode = (String) code.getText();
                Slot = (String) slot.getText();

                if(Slot.isEmpty()) {
                    Toast.makeText(CreateTimeTable.this, getString(R.string.slot_empty), Toast.LENGTH_SHORT).show();
                }
                else if(courseCode.isEmpty()) {
                    Toast.makeText(CreateTimeTable.this, getString(R.string.course_empty), Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(CreateTimeTable.this, getString(R.string.course_added), Toast.LENGTH_SHORT).show();
                    CourseList.add(courseCode);
                    code.setText("");
                    slot.setText("");
                }
            }
        });*/
    }
}
