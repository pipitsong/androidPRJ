package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity_MyContacts extends AppCompatActivity {

    List<MyContacts> mylist;
    ListView lv;
//    ArrayAdapter<MyContacts> adapter;
    CreateListFromMyContactsWithLayout adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_my_contacts);
        mylist = new ArrayList<>();
        mylist.add( new MyContacts("ali") );
        mylist.add( new MyContacts("Hossein") );
        runme();
    }

    private void runme() {
        lv = findViewById(R.id.listview_mycontacts);
//        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mylist);
        adapter = new CreateListFromMyContactsWithLayout(this,mylist);
        lv.setAdapter(adapter);
    }
}