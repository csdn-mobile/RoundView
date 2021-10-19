package com.csdn.roundview.demo;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.csdn.roundview.RoundView;

/**
 * @author kuanggang on 2021/10/19
 */
public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.baidu.com/");
    }
}