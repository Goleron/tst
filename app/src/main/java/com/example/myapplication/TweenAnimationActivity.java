package com.example.myapplication;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class TweenAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        ImageView imageView = findViewById(R.id.imageViewTween);
        Animation tweenAnimation = AnimationUtils.loadAnimation(this, R.anim.tween_animation);
        imageView.startAnimation(tweenAnimation);
    }
}