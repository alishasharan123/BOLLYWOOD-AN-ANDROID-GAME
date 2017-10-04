package com.example.alisha.justguess2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class fifth extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7,b8;
    EditText ed1;
    TextView tv;
    String s,s1="";
    int c1=0, c2=0, c3=0;
    int turn = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        b1 = (Button) findViewById(R.id.m51);
        b2 = (Button) findViewById(R.id.m52);
        b3 = (Button) findViewById(R.id.m53);
        b4 = (Button) findViewById(R.id.m54);
        b5 = (Button) findViewById(R.id.m55);
        b6 = (Button) findViewById(R.id.m5enter);
        b7 = (Button) findViewById(R.id.m5h);
        b8 = (Button) findViewById(R.id.m5next);
        ed1 = (EditText) findViewById(R.id.m5ed);
        tv = (TextView) findViewById(R.id.m5turns);
        tv.setText("No of turns left=" + turn);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = ed1.getText().toString().toUpperCase();
                switch (s) {
                    case "B":
                        b1.setText("B");

                        ed1.setText("");
                        c1 = c1 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1)) {
                            Intent i=new Intent(fifth.this,sixth.class);
                            startActivity(i);
                        }

                        break;
                    case "G":
                        b4.setText("G");
                        ed1.setText("");
                        c2 = c2 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1)) {
                            Intent i=new Intent(fifth.this,sixth.class);
                            startActivity(i);
                        }

                        break;
                    case "H":
                        b5.setText("H");
                        ed1.setText("");
                        c3 = c3 + 1;
                        if ((c1 == 1) && (c2 == 1) && (c3 == 1)) {
                            Intent i=new Intent(fifth.this,sixth.class);
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
                            Intent i = new Intent(fifth.this, fifth.class);
                            startActivity(i);
                        }
                        break;
                }

            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "THE ROLE OF THE ACTRESS WAS PLAYED BY SHRADHA KAPOOR ", Toast.LENGTH_SHORT).show();
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if ((c1 == 1) && (c2 == 1)) {
                    Intent i=new Intent(fifth.this,sixth.class);
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
