package com.google.dragnblade.oneliners;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.playSound);
        final MediaPlayer mp=MediaPlayer.create(this, R.raw.sample);
        bt.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
                mp.start();
        }
    });}}

