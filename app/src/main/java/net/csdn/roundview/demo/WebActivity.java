package net.csdn.roundview.demo;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import net.csdn.roundview.demo.R;

/**
 * @author kuanggang on 2021/10/19
 */
public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.qq.com/");
    }
}