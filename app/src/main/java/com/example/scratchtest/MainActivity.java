package com.example.scratchtest;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        WebView view = (WebView) findViewById(R.id.WebView);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("file:///android_asset/index.html");
    }
}
