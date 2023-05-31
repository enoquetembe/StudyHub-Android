package com.enoque.studyhub_android;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class ExamAdapter extends BaseAdapter {

    private List<Exam> exams = new ArrayList<>();
    private Context context;
    private LayoutInflater inflater;

    public ExamAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }

    @Override
    public int getCount() {
        return exams.size();
    }

    @Override
    public Object getItem(int position) {
        return exams.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.exam_item, null);
        TextView textView_ExamName = convertView.findViewById(R.id.tvExamName);
        TextView textView_ExamDiscipline = convertView.findViewById(R.id.tvDiscipline);
        //TextView textView_ExamYear = convertView.findViewById(R.id.tvYear);

        Exam exam = exams.get(position);

        if (exam != null) {
            textView_ExamName.setText(exam.getTitle());
            textView_ExamDiscipline.setText(exam.getDiscipline());
            //textView_ExamYear.setText(exam.getYear());
        }

        return convertView;
    }
}
