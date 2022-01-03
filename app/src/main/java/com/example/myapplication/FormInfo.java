package com.example.myapplication;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class FormInfo implements View.OnClickListener {

    private Activity A ;
    private LinearLayout linearlayout;

    private Button bt;

    public Button getBt() {
        return bt;
    }

    public FormInfo(Activity activiti , int layout)
    {
        this.A = activiti ;
        this.linearlayout = this.A.findViewById(layout);
        bt = this.A.findViewById(R.id.bt_frm2_1);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this.A.getApplicationContext(), "Hii", Toast.LENGTH_SHORT).show();
    }
}
