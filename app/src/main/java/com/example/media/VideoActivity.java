package com.example.media;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        videoView=findViewById(R.id.videoView);
        videoView.setMediaController( new MediaController(this));
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);
        videoView.start();
        
        View decoreView = getWindow().getDecorView();
        int uiOptions= View.SYSTEM_UI_FLAG_IMMERSIVE;
        decoreView.setSystemUiVisibility(uiOptions);


        //esconder actionbar
        getSupportActionBar().hide();
    }
}