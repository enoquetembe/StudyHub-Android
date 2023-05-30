package com.enoque.studyhub_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.enoque.studyhub_android.databinding.ActivityPresentationBinding;

public class PresentationActivity extends AppCompatActivity {

    ActivityPresentationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPresentationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnEnter.setOnClickListener(v -> {
            Intent intent = new Intent(PresentationActivity.this,  LoginActivity.class);
            startActivity(intent);
        });
    }
}