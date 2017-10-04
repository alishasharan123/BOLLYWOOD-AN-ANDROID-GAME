package com.example.alisha.justguess2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

public class seventh extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7,b8,b9;
    EditText ed1;
    TextView tv;
    String s,s1="";
    int c1=0, c2=0, c3=0, c4=0;
    int turn = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        b1 = (Button) findViewById(R.id.m71);
        b2 = (Button) findViewById(R.id.m72);
        b3 = (Button) findViewById(R.id.m73);
        b4 = (Button) findViewById(R.id.m74);
        b5 = (Button) findViewById(R.id.m75);
        b6 = (Button) findViewById(R.id.m76);
        b7 = (Button) findViewById(R.id.m7enter);
        b8 = (Button) findViewById(R.id.m7h);
        b9 = (Button) findViewById(R.id.m7next);
        ed1 = (EditText) findViewById(R.id.m7ed);
        tv = (TextView) findViewById(R.id.m7turns);
        tv.setText("No of turns left=" + turn);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = ed1.getText().toString().toUpperCase();
                switch (s) {
                    case "S":
                        b1.setText("S");

                        ed1.setText("");
                        c1 = c1 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                            Intent i=new Intent(seventh.this,eight.class);
                            startActivity(i);
                        }

                        break;
                    case "L":
                        b3.setText("L");
                        ed1.setText("");
                        c2 = c2 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                            Intent i=new Intent(seventh.this,eight.class);
                            startActivity(i);
                        }

                        break;
                    case "T":
                        b4.setText("T");
                        ed1.setText("");
                        c3 = c3 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                            Intent i=new Intent(seventh.this,eight.class);
                            startActivity(i);
                        }

                        break;
                    case "N":
                        b6.setText("N");
                        ed1.setText("");
                        c4 = c4 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                            Intent i=new Intent(seventh.this,eight.class);
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
                            Intent i = new Intent(seventh.this, seventh.class);
                            startActivity(i);
                        }
                        break;
                }
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "THE PLOT IIS BASED ON WRESTLING ", Toast.LENGTH_SHORT).show();
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {

                    Intent i=new Intent(seventh.this,eight.class);
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
