package com.example.animation_lab_02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DrawableAnimationActivity extends AppCompatActivity {


    AnimationDrawable arrowAnimation;
    ImageView imgArrow;
    Button btnChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_animation);

        imgArrow = findViewById(R.id.imgArrow);
        btnChange = findViewById(R.id.btnChange);

        imgArrow.setImageResource(R.drawable.animation);

        arrowAnimation = (AnimationDrawable) imgArrow.getDrawable();

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrowAnimation.start();
            }
        });
    }
}