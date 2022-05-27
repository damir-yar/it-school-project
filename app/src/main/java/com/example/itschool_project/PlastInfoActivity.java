package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PlastInfoActivity extends AppCompatActivity {

    private ImageButton plastOne;
    private ImageButton plastTwo;
    private ImageButton plastThree;
    private ImageButton plastFour;
    private ImageButton plastFive;
    private ImageButton plastSix;
    private ImageButton plastSeven;
    private ImageButton plastABS;

    private Button plastMap;

    private ImageView image;

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plast_info);

        plastOne = findViewById(R.id.but_plast_info_one);
        plastTwo = findViewById(R.id.but_plast_info_two);
        plastThree = findViewById(R.id.but_plast_info_three);
        plastFour = findViewById(R.id.but_plast_info_four);
        plastFive = findViewById(R.id.but_plast_info_five);
        plastSix = findViewById(R.id.but_plast_info_six);
        plastSeven = findViewById(R.id.but_plast_info_seven);
        plastABS = findViewById(R.id.but_plast_info_abs);

        plastMap = findViewById(R.id.but_plast_info_map);

        image = findViewById(R.id.im_plast);

        setTitle("Пластик");


        WebView web = (WebView) findViewById(R.id.plast_web);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);


        web.loadUrl("https://2gis.ru/izhevsk/search/%D0%BF%D1%80%D0%B8%D0%B5%D0%BC%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%B0?m=53.271192%2C56.849754%2F11.59");


        plastMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.setVisibility(View.VISIBLE);
                image.setImageResource(0);
            }
        });
        plastOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p1);
                web.setVisibility(View.INVISIBLE);
            }
        });
        plastTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p2);
                web.setVisibility(View.INVISIBLE);
            }
        });
        plastThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p3);
                web.setVisibility(View.INVISIBLE);
            }
        });
        plastFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p4);
                web.setVisibility(View.INVISIBLE);
            }
        });
        plastFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p5);
                web.setVisibility(View.INVISIBLE);
            }
        });
        plastSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p6);
                web.setVisibility(View.INVISIBLE);
            }
        });
        plastSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p7);
                web.setVisibility(View.INVISIBLE);
            }
        });
        plastABS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p9);
                web.setVisibility(View.INVISIBLE);
            }
        });
    }


    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (Uri.parse(url).getHost().equals("www.example.com")) {
                return false;
            }
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
            return true;
        }
    }
}