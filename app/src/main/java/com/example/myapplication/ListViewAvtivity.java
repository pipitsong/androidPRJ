package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewAvtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_avtivity);
        setList();
    }

    private void setList() {
        //create list view
        ListView lv = findViewById(R.id.mylistview);
        //create list
        List<String> li = new ArrayList<>();
        li.add("test1");
        li.add("Test2");
        //create adaptar
        ArrayAdapter<String> ad;
        ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,li);

        lv.setAdapter(ad);

    } // end setList

}