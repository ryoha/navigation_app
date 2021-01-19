package com.example.navigation_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Notice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        final Button button1 = findViewById(R.id.TopReturnButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 引数1：自身のActivity、引数2:移動先のActivity名
                Intent intent = new Intent(Notice.this, MainActivity.class);
                // Activityの移動
                startActivity(intent);
            }
        });

        final WebView myWebView = (WebView) findViewById(R.id.NoticeWebView);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("https://webst8.com/blog/wordpress-youtube-emb/");
        myWebView.setWebViewClient(new Notice.MyWebViewClient());
        //MyWebViewClientはAppGuideを参照している

    }

    //アプリ内でブラウザオープン　特定ドメイン以外はブラウザ起動
    // text https://developer.android.com/guide/webapps/webview#HandlingNavigation
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            //if ("blog.codecamp.jp".equals(Uri.parse(url).getHost())) {
            return false;
        }
        //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        //startActivity(intent);
        //return true;
        //}
    }
}