package com.example.alisha.justguess2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton t1;
    ImageView iv;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(ImageButton)findViewById(R.id.startimg);
        iv=(ImageView) findViewById(R.id.intropic);
        tv1=(TextView) findViewById(R.id.tvintro);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,first.class);
                startActivity(i);
            }
        });
    }
}
