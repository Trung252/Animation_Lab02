package com.example.animation_lab_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    Button btnAnim;
    ImageView imgPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAnim = findViewById(R.id.btnAnim);
        imgPhone = findViewById(R.id.imgPhone);

        Animation animation =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.anifadein);

        btnAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPhone.startAnimation(animation);

            }
        });

    }
}