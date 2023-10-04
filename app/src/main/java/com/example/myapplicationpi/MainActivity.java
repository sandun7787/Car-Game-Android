package com.example.myapplicationpi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String  week[]={"sunday","monday","tuesday","wednesday","thurseday","Friday","Saturday"};

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,R.layout.row,R.id.textView,week);


        listview=findViewById(R.id.list_view);
        listview= setAdapter(arrayAdapter);

    }

}