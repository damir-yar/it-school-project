package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MetInfoActivity extends AppCompatActivity {

    private ImageView im;

    private Button al;
    private Button st;
    private Button cu;
    private Button dm;
    private Button np;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_met_info);

        setTitle("Металл");

        im = findViewById(R.id.im_met);

        al = findViewById(R.id.but_met_info_al);
        st = findViewById(R.id.but_met_info_st);
        cu = findViewById(R.id.but_met_info_cu);
        dm = findViewById(R.id.but_met_info_drag);
        np = findViewById(R.id.but_met_info_no);

        al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.al);
            }
        });
        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.st);
            }
        });
        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.cu);
            }
        });
        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.dm);
            }
        });
        np.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.np);
            }
        });
    }
}