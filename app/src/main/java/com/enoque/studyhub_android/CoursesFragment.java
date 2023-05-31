package com.enoque.studyhub_android;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class CoursesFragment extends Fragment {
    private ListView lvCourses;
    private CourseAdapter courseAdapter;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_courses, container, false);

        lvCourses = view.findViewById(R.id.lv_courses);
        courseAdapter = new CourseAdapter(getContext());
        lvCourses.setAdapter(courseAdapter);

        ApiService.getInstance().fetchCourses(courseAdapter);

        return view;
    }
}