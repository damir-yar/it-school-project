package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlastInfoActivity extends AppCompatActivity {

    private Button plastOne;

    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plast_info);

        plastOne = findViewById(R.id.but_plast_info_one);

        info = findViewById(R.id.text_info);

        info.setText(R.string.plast_one);

        plastOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(R.string.plast_one);
            }
        });
    }
}