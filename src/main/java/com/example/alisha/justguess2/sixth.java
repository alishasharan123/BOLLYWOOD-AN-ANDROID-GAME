package com.example.alisha.justguess2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

public class sixth extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7,b8,b9;
    EditText ed1;
    TextView tv;
    String s,s1="";
    int c1=0, c2=0, c3=0, c4=0;
    int turn = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        b1 = (Button) findViewById(R.id.m61);
        b2 = (Button) findViewById(R.id.m62);
        b3 = (Button) findViewById(R.id.m63);
        b4 = (Button) findViewById(R.id.m64);
        b5 = (Button) findViewById(R.id.m65);
        b6 = (Button) findViewById(R.id.m66);
        b7 = (Button) findViewById(R.id.m6enter);
        b8 = (Button) findViewById(R.id.m6h);
        b9 = (Button) findViewById(R.id.m6next);
        ed1 = (EditText) findViewById(R.id.m6ed);
        tv = (TextView) findViewById(R.id.m6turns);
        tv.setText("No of turns left=" + turn);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = ed1.getText().toString().toUpperCase();
                switch (s) {
                    case "K":
                        b1.setText("K");

                        ed1.setText("");
                        c1 = c1 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                            Intent i=new Intent(sixth.this,seventh.class);
                            startActivity(i);
                        }

                        break;
                    case "R":
                        b2.setText("R");
                        b3.setText("R");
                        ed1.setText("");
                        c2 = c2 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                            Intent i=new Intent(sixth.this,seventh.class);
                            startActivity(i);
                        }

                        break;
                    case "S":
                        b5.setText("S");
                        ed1.setText("");
                        c3 = c3 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                            Intent i=new Intent(sixth.this,seventh.class);
                            startActivity(i);
                        }

                        break;
                    case "H":
                        b6.setText("H");
                        ed1.setText("");
                        c4 = c4 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
                            Intent i=new Intent(sixth.this,seventh.class);
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
                            Intent i = new Intent(sixth.this, sixth.class);
                            startActivity(i);
                        }
                        break;
                }
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "IF YOU BELIEVE IN SUPER POWERS.... I BET YOU WIILL LOVE THIS MOVIE ", Toast.LENGTH_SHORT).show();
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {

                    Intent i=new Intent(sixth.this,seventh.class);
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
