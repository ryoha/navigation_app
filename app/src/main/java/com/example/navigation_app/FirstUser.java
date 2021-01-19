package com.example.navigation_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.ScrollView;
import android.widget.VideoView;

public class FirstUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_user);

        final Button button1 = findViewById(R.id.TopReturnButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 引数1：自身のActivity、引数2:移動先のActivity名
                Intent intent = new Intent(FirstUser.this, MainActivity.class);
                // Activityの移動
                startActivity(intent);
            }
        });

        //動画1のかたまり
        final VideoView videoView1 = (VideoView) findViewById(R.id.FirstGuideVideo);
        videoView1.setVideoPath("android.resource://" + this.getPackageName()+"/"+R.raw.test);
        videoView1.setMediaController(new MediaController(this));
        videoView1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp){
                showThumbnail(mp);
            }
        });

        //動画2のかたまり
        final VideoView videoView2 = (VideoView) findViewById(R.id.videoView2);
        videoView2.setVideoPath("android.resource://" + this.getPackageName()+"/"+R.raw.test2);
        videoView2.setMediaController(new MediaController(this));
        videoView2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp){
                showThumbnail(mp);
            }
        });

    }

    private void showThumbnail(MediaPlayer mediaPlayer){
        mediaPlayer.start();
        mediaPlayer.pause();
        mediaPlayer.seekTo(0);
    }

}