package com.example.alisha.justguess2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class second extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8,b9,b10;
    EditText ed1;
    TextView tv;
    String s,s1="";
    int c1=0, c2=0, c3=0, c4=0;
    int turn = 9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1 = (Button) findViewById(R.id.m21);
        b2 = (Button) findViewById(R.id.m22);
        b3 = (Button) findViewById(R.id.m23);
        b4 = (Button) findViewById(R.id.m24);
        b5 = (Button) findViewById(R.id.m25);
        b6 = (Button) findViewById(R.id.m26);
        b7 = (Button) findViewById(R.id.m27);
        b8 = (Button) findViewById(R.id.m2enter);
        b9 = (Button) findViewById(R.id.m2h);
        b10 = (Button) findViewById(R.id.m2next);
        ed1 = (EditText) findViewById(R.id.m2ed);
        tv = (TextView) findViewById(R.id.m2turns);
        tv.setText("No of turns left=" + turn);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = ed1.getText().toString().toUpperCase();
                switch (s) {
                    case "G":
                        b1.setText("G");

                        ed1.setText("");
                        c1 = c1 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                            Intent i=new Intent(second.this,third.class);
                            startActivity(i);
                        }

                        break;
                    case "H":
                        b2.setText("H");
                        ed1.setText("");
                        c2 = c2 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                            Intent i=new Intent(second.this,third.class);
                            startActivity(i);
                        }

                        break;
                    case "J":
                        b4.setText("J");
                        ed1.setText("");
                        c3 = c3 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                            Intent i=new Intent(second.this,third.class);
                            startActivity(i);
                        }

                        break;
                    case "N":
                        b6.setText("N");
                        ed1.setText("");
                        c4 = c4 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                            Intent i=new Intent(second.this,third.class);
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
                            Intent i = new Intent(second.this, second.class);
                            startActivity(i);
                        }
                        break;
                }
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "THIS MOVIE ACTRESS STARTED HER CAREER IN BOLLYWOOD WITH THIS MOVIE ", Toast.LENGTH_SHORT).show();
            }
        });
        b10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                    Intent i=new Intent(second.this,third.class);
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
