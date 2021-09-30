package com.example.animation_lab_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class TranslateAnimationActivity extends AppCompatActivity {
    Button btnMove;
    ImageView imgPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate_animation);

        btnMove = findViewById(R.id.btnMove);
        imgPhone = findViewById(R.id.imgPhone);

        TranslateAnimation animation =
                new TranslateAnimation(0, 200, 0, 500);
        animation.setDuration(6000);
        animation.setFillAfter(true);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPhone.startAnimation(animation);
            }
        });

    }
}