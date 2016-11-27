package com.example.mrwahib.buildmylig;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    private ListView lv;

    private Integer[] tab_images = {
            R.drawable.maxresdefault,
            R.drawable.maxresdefault,
            R.drawable.maxresdefault,
            R.drawable.maxresdefault,
            R.drawable.maxresdefault,
            R.drawable.maxresdefault,
            R.drawable.maxresdefault,
            R.drawable.maxresdefault,
            R.drawable.maxresdefault};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init();
    }

   /* private void init() {

        lv.addFooterView("R.drawable.maxresdefault");
    }*/
}
