package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    ImageView iv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        iv = findViewById(R.id.imageView);
        iv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        iv.animate().alpha(0f).setDuration(2000);
    }
}