package com.example.getgive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SecondActivity extends AppCompatActivity {

    Timer timer;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = (ImageView)findViewById(R.id.iv);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink_anim);
        imageView.startAnimation(animation);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}