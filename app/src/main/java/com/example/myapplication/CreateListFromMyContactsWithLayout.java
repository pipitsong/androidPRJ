package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CreateListFromMyContactsWithLayout extends ArrayAdapter {

    public CreateListFromMyContactsWithLayout(@NonNull Context context, List<MyContacts> objects) {
        super(context, R.layout.listviewdesgin , objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        LayoutInflater lif = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = lif.inflate(R.layout.listviewdesgin,parent,false);
        ImageView I = v.findViewById(R.id.imageView2);
        I.setImageResource(R.drawable.an);
        return v;
    }
}
