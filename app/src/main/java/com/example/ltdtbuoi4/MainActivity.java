package com.example.ltdtbuoi4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CourseAdapter adapter;
    private List<Course> courseList;

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        courseList = new ArrayList<>();

        courseList.add(new Course("CMP245", "Lap trinh Di dong", "Nguyen Tuan Anh Vu", android.R.drawable.alert_dark_frame));
        adapter= new CourseAdapter(this, courseList);
        recyclerView.setAdapter(adapter);


    }


}