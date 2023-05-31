package com.enoque.studyhub_android;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;

import com.enoque.studyhub_android.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private ListView lvExams;
    private ExamAdapter examAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        lvExams = view.findViewById(R.id.lv_exams);
        examAdapter = new ExamAdapter(getContext());
        lvExams.setAdapter(examAdapter);

        ApiService.getInstance().fetchExams(examAdapter);

        return view;
    }
}
