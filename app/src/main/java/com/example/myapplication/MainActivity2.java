package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Intent intetnt = getIntent();
//        String s = intetnt.getStringExtra("test");
//        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        FormInfo fi = new FormInfo(this,R.id.linearLayout);
        Button bt = fi.getBt();
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "button overrideed it", Toast.LENGTH_SHORT).show();
                setResult(50);
                finish();
            }
        });
    }
}