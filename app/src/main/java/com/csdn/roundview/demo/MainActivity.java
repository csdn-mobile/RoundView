package com.csdn.roundview.demo;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.csdn.roundview.CircleImageView;
import com.csdn.roundview.RoundTextView;

/**
 * @author kuanggang on 2019/12/01
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RoundTextView tv = findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setRadius(10, 0, 0, 0);
                tv.setStrokeWidthColor(5, getResources().getColor(android.R.color.holo_green_dark));
            }
        });

        CircleImageView civ = findViewById(R.id.civ);
        civ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                civ.setSelected(!civ.isSelected());
            }
        });
    }
}