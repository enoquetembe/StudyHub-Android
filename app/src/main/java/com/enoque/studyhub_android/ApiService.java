package com.enoque.studyhub_android;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;



public class ApiService {
    private static final String BASE_URL = "http://172.22.176.1:8080";
    private static ApiService instance;
    private Retrofit retrofit;

    OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(20, TimeUnit.SECONDS)
            .build();



    private ApiService() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

    public static synchronized ApiService getInstance() {
        if (instance == null) {
            instance = new ApiService();
        }
        return instance;
    }

    public interface ApiInterface {
        @GET("exams")
        Call<List<Exam>> getExams();

        @GET("faculties")
        Call<List<Faculty>> getFaculties();

        @GET("courses")
        Call<List<Course>> getCourses();

        @GET("ddisciplines")
        Call<List<Course>> getDisciplines();
    }

    public void fetchExams(final ExamAdapter examAdapter) {
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<List<Exam>> call = apiInterface.getExams();
        call.enqueue(new Callback<List<Exam>>() {
            @Override
            public void onResponse(Call<List<Exam>> call, Response<List<Exam>> response) {
                if (response.isSuccessful()) {
                    List<Exam> exams = response.body();
                    if (exams != null) {
                        examAdapter.setExams(exams);
                        examAdapter.notifyDataSetChanged();
                    }
                } else {
                    onFailure(call, new Throwable(response.message()));
                }
            }

            @Override
            public void onFailure(Call<List<Exam>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }


    public void fetchFaculties(final FacultyAdapter facultyAdapter) {
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<List<Faculty>> call = apiInterface.getFaculties();
        call.enqueue(new Callback<List<Faculty>>() {
            @Override
            public void onResponse(Call<List<Faculty>> call, Response<List<Faculty>> response) {
                if (response.isSuccessful()) {
                    List<Faculty> faculties = response.body();
                    if (faculties != null) {
                        facultyAdapter.setFaculties(faculties);
                        facultyAdapter.notifyDataSetChanged();
                    }
                } else {
                    onFailure(call, new Throwable(response.message()));
                }
            }

            @Override
            public void onFailure(Call<List<Faculty>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    public void fetchCourses(final CourseAdapter courseAdapter) {
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<List<Course>> call = apiInterface.getCourses();
        call.enqueue(new Callback<List<Course>>() {
            @Override
            public void onResponse(Call<List<Course>> call, Response<List<Course>> response) {
                if (response.isSuccessful()) {
                    List<Course> courses = response.body();
                    if (courses != null) {
                        courseAdapter.setCourses(courses);
                        courseAdapter.notifyDataSetChanged();
                    }
                } else {
                    onFailure(call, new Throwable(response.message()));
                }
            }

            @Override
            public void onFailure(Call<List<Course>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

}
