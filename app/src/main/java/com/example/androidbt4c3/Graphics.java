package com.example.androidbt4c3;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class Graphics extends Activity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GraphicsView(this));
    }
}
