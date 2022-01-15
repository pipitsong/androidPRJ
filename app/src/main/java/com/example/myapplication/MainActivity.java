package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt ;
    EditText et ;
    TextView tv;

    public static final int  SUCCES_CODE = 180;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        bt = findViewById(R.id.button);
        bt.setOnClickListener(this);

        Button bt_show_a3 = findViewById(R.id.button2);
        bt_show_a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });

        et = findViewById(R.id.editTextTextPersonName );
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                tv.setText(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent intetnt = new Intent(MainActivity.this, MainActivity2.class );
        intetnt.putExtra("test",et.getText().toString().trim() );
        startActivityForResult(intetnt,SUCCES_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ( requestCode == SUCCES_CODE && resultCode == 50 ){
            if ( data.getExtras().containsKey("DATA") ){
                Toast.makeText(this, data.getStringExtra("DATA") , Toast.LENGTH_SHORT).show();
            }

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.addSubMenu("SubMenu1").add("listMenu").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                startActivity(new Intent(MainActivity.this,ListViewAvtivity.class));
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}