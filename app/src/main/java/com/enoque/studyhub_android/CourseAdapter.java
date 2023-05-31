package com.enoque.studyhub_android;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class CourseAdapter extends BaseAdapter {

    private List<Course> courses = new ArrayList<>();
    private Context context;
    private LayoutInflater inflater;

    public CourseAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public int getCount() {
        return courses.size();
    }

    @Override
    public Object getItem(int position) {
        return courses.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.course_item, null);
        TextView textView_FacultyName = convertView.findViewById(R.id.tvCourseName);

        Course course = courses.get(position);

        if (course != null) {
            textView_FacultyName.setText(course.getName());
        }

        return convertView;
    }
}
