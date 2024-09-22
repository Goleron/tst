package com.example.myapplication;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    private ImageView animationIV;
    private Button startBtn, pauseBtn, tweenAnimBtn;
    private AnimationDrawable frameAnimation;
    private Animation tweenAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationIV = findViewById(R.id.animImageView);
        startBtn = findViewById(R.id.startButton);
        pauseBtn = findViewById(R.id.pauseButton);
        tweenAnimBtn = findViewById(R.id.tweenAnimationButton);

        animationIV.setImageResource(R.drawable.animation_list);
        frameAnimation = (AnimationDrawable) animationIV.getDrawable();

        tweenAnimation = AnimationUtils.loadAnimation(this, R.anim.tween_animation);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!frameAnimation.isRunning()) {
                    frameAnimation.start();
                }
            }
        });

        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (frameAnimation.isRunning()) {
                    frameAnimation.stop();
                }
            }
        });
        Button thirdActivityButton = findViewById(R.id.thirdActivityButton);

        thirdActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        tweenAnimBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (frameAnimation.isRunning()) {
                    frameAnimation.stop();
                }
                animationIV.startAnimation(tweenAnimation);
            }
        });
    }
}