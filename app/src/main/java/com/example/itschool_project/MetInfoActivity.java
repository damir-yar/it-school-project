package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MetInfoActivity extends AppCompatActivity {

    private ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_met_info);

        setTitle("Металл");

        im = findViewById(R.id.im_met);

    }
}