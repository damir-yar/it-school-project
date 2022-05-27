package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

public class MetInfoActivity extends AppCompatActivity {

    private ImageView im;

    private Button al;
    private Button st;
    private Button cu;
    private Button dm;
    private Button np;
    private Button map;

    private WebView web;

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
        map = findViewById(R.id.but_met_info_map);


        WebView web = (WebView) findViewById(R.id.met_web);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);


        web.loadUrl("https://2gis.ru/izhevsk/search/%D0%BF%D1%80%D0%B8%D0%B5%D0%BC%20%D0%BC%D0%BC%D0%B5%D1%82%D0%B0%D0%BB%D0%BB%D0%B0?m=53.238074%2C56.850953%2F12.42");


        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.setVisibility(View.VISIBLE);
                im.setImageResource(0);
            }
        });
        al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.al);
                web.setVisibility(View.INVISIBLE);
            }
        });
        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.st);
                web.setVisibility(View.INVISIBLE);
            }
        });
        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.cu);
                web.setVisibility(View.INVISIBLE);
            }
        });
        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.dm);
                web.setVisibility(View.INVISIBLE);
            }
        });
        np.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.np);
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