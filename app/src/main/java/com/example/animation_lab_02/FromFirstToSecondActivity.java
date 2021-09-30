package com.example.animation_lab_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FromFirstToSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_first_to_second);

        findViewById(R.id.btnOpenActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(FromFirstToSecondActivity.this,
                        SecondActivity.class));

                overridePendingTransition(R.anim.enter_x, R.anim.exit_x);

            }
        });
    }
}