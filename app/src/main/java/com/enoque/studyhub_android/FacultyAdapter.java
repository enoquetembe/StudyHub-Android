package com.enoque.studyhub_android;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class FacultyAdapter extends BaseAdapter {

    private List<Faculty> faculties = new ArrayList<>();
    private Context context;
    private LayoutInflater inflater;

    public FacultyAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public int getCount() {
        return faculties.size();
    }

    @Override
    public Object getItem(int position) {
        return faculties.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.faculty_item, null);
        TextView textView_FacultyName = convertView.findViewById(R.id.tvFacltyName);

        Faculty faculty = faculties.get(position);

        if (faculty != null) {
            textView_FacultyName.setText(faculty.getName());
        }

        return convertView;
    }
}
