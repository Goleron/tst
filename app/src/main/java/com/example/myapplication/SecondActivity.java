package com.example.myapplication;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private AnimationDrawable rabbitAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView rabbitImageView = findViewById(R.id.rabbit_image_view);

        rabbitImageView.setBackgroundResource(R.drawable.animation_list);
        rabbitAnimation = (AnimationDrawable) rabbitImageView.getBackground();

        Button startAnimationButton = findViewById(R.id.start_animation_button);
        startAnimationButton.setOnClickListener(view -> {
            rabbitAnimation.start();
        });

        Button closeButton = findViewById(R.id.close_button);
        closeButton.setOnClickListener(view -> {
            finish();
        });
    }
}