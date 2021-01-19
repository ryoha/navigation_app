package com.example.navigation_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = findViewById(R.id.FirstUserButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 引数1：自身のActivity、引数2:移動先のActivity名
                Intent intent = new Intent(MainActivity.this, FirstUser.class);
                // Activityの移動
                startActivity(intent);
            }
        });

        final Button button2 = findViewById(R.id.AppGuideButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 引数1：自身のActivity、引数2:移動先のActivity名
                Intent intent = new Intent(MainActivity.this, AppGuide.class);
                // Activityの移動
                startActivity(intent);
            }
        });

        final Button button3 = findViewById(R.id.NoticeButton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 引数1：自身のActivity、引数2:移動先のActivity名
                Intent intent = new Intent(MainActivity.this, Notice.class);
                // Activityの移動
                startActivity(intent);
            }
        });
    }
}