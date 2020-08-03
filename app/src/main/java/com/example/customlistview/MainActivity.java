package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] title={
            "Vlc Media Player App",
            "7 Zip App",
            "CCleaner App",
            "Visual Studio code App",

    };


    String[] description ={
            "Catagory",
            "Catagory",
            "Catagory",
            "Catagory",

    };

    Integer[] imgs = {
            R.drawable.vlc,
            R.drawable.zip,
            R.drawable.ccleaner,
            R.drawable.visual
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MylistAdapter adapter = new MylistAdapter(this,title,description,imgs);

        listView = findViewById(R.id.list);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position == 0){
                    Toast.makeText(MainActivity.this,
                            "Opening",Toast.LENGTH_SHORT).show();
                }
                if(position == 1){
                    Toast.makeText(MainActivity.this,
                            "Opening",Toast.LENGTH_SHORT).show();
                }
                if(position == 2){
                    Toast.makeText(MainActivity.this,
                            "Opening",Toast.LENGTH_SHORT).show();
                }
                if(position == 3){
                    Toast.makeText(MainActivity.this,
                            "Opening",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}