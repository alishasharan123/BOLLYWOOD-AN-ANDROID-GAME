package com.example.alisha.justguess2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class fourth extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7,b8;
    EditText ed1;
    TextView tv;
    String s,s1="";
    int c1=0, c2=0;
    int turn = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        b1 = (Button) findViewById(R.id.m51);
        b2 = (Button) findViewById(R.id.m42);
        b3 = (Button) findViewById(R.id.m43);
        b4 = (Button) findViewById(R.id.m44);
        b5 = (Button) findViewById(R.id.m45);
        b6 = (Button) findViewById(R.id.m4enter);
        b7 = (Button) findViewById(R.id.m4h);
        b8 = (Button) findViewById(R.id.m4next);
        ed1 = (EditText) findViewById(R.id.m4ed);
        tv = (TextView) findViewById(R.id.m4turns);
        tv.setText("No of turns left=" + turn);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = ed1.getText().toString().toUpperCase();
                switch (s) {
                    case "D":
                        b2.setText("D");

                        ed1.setText("");
                        c1 = c1 + 1;
                        if ((c1 == 1) && (c2 == 1)){
                            Intent i=new Intent(fourth.this,fifth.class);
                            startActivity(i);
                        }

                        break;
                    case "N":
                        b5.setText("N");
                        ed1.setText("");
                        c2 = c2 + 1;
                        if ((c1 == 1) && (c2 == 1)) {
                            Intent i=new Intent(fourth.this,fifth.class);
                            startActivity(i);
                        }

                        break;


                    default:
                        turn = turn - 1;
                        ed1.setText("");
                        s1=s1+s+" ";
                        tv.setText("No of turns left=" + turn+"\n you used letters :\n"+s1);
                        if(turn==0) {
                            Toast.makeText(getApplicationContext(), "HEY.. YOU LOST THE GAME. ", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(fourth.this, fourth.class);
                            startActivity(i);
                        }
                        break;
                }
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "MOST OF THE SCENES OF THIS MOVIE WERE SHOT IN JAMSHEDPUR. ", Toast.LENGTH_SHORT).show();
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if ((c1 == 1) && (c2 == 1)) {
                    Intent i=new Intent(fourth.this,fifth.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "YOU CANT PROCEED BY GIVING WRONG ANSWERS. ", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
