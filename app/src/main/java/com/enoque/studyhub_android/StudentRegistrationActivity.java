package com.enoque.studyhub_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.enoque.studyhub_android.databinding.ActivityStudentRegistrationBinding;

public class StudentRegistrationActivity extends AppCompatActivity {

    private ActivityStudentRegistrationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudentRegistrationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.tvLogin.setOnClickListener(v -> {
            Intent intent = new Intent(StudentRegistrationActivity.this,  LoginActivity.class);
            startActivity(intent);

            Toast.makeText(this, "Registado com sucesso", Toast.LENGTH_LONG).show();
        });
    }
}