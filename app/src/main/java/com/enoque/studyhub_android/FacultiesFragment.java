package com.enoque.studyhub_android;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FacultiesFragment extends Fragment {

    private ListView lvFaculties;
    private FacultyAdapter facultyAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_faculties, container, false);

        lvFaculties = view.findViewById(R.id.lv_faculties);
        facultyAdapter = new FacultyAdapter(getContext());
        lvFaculties.setAdapter(facultyAdapter);

        ApiService.getInstance().fetchFaculties(facultyAdapter);

        return view;
    }
}