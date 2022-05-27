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

public class MakInfoActivity extends AppCompatActivity {

    private ImageView im;

    private Button a;
    private Button b;
    private Button v;
    private Button not;
    private Button map;

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mak_info);

        setTitle("Макулатура");

        im = findViewById(R.id.im_mak);

        a = findViewById(R.id.but_mak_info_a);
        b = findViewById(R.id.but_mak_info_b);
        v = findViewById(R.id.but_mak_info_v);
        not = findViewById(R.id.but_mak_info_not);
        map = findViewById(R.id.but_mak_info_map);


        WebView web = (WebView) findViewById(R.id.mak_web);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);


        web.loadUrl("https://2gis.ru/izhevsk/search/%D0%9F%D1%80%D0%B8%D0%B5%D0%BC%20%D0%BC%D0%B0%D0%BA%D1%83%D0%BB%D0%B0%D1%82%D1%83%D1%80%D1%8B%20(%D0%B1%D1%83%D0%BC%D0%B0%D0%B6%D0%BD%D1%8B%D0%B5%20%D0%BE%D1%82%D1%85%D0%BE%D0%B4%D1%8B)/attributeId/70000201006752147?m=53.24218%2C56.857574%2F13.05");


        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.setVisibility(View.VISIBLE);
                im.setImageResource(0);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.m_a);
                web.setVisibility(View.INVISIBLE);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.m_b);
                web.setVisibility(View.INVISIBLE);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.m_v);
                web.setVisibility(View.INVISIBLE);
            }
        });
        not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.m_not);
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