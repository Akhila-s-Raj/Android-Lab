package com.example.myapplication_fragment;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonfragment1=findViewById(R.id.button1);
        Button buttonfragment2=findViewById(R.id.button2);
        buttonfragment1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout,new Fragment1())
                        .commit();
            }
        });
        buttonfragment2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout,new Fragment2())
                        .commit();
            }
        });
    }
}