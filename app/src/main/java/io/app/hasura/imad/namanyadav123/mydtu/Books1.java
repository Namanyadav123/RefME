package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cuboid.cuboidcirclebutton.CuboidButton;

public class Books1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books1);

      CuboidButton  b1=(CuboidButton) findViewById(R.id.p1);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Books1.this,Books1Physics.class);
                    startActivity(i);

                }
            });
        CuboidButton  b2=(CuboidButton) findViewById(R.id.p2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Books1.this,Books1Maths.class);
                startActivity(i);

            }
        });CuboidButton  b3=(CuboidButton) findViewById(R.id.p3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Books1.this,Books2chem.class);
                startActivity(i);

            }
        });CuboidButton  b4=(CuboidButton) findViewById(R.id.p4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Books1.this,Books2bme.class);
                startActivity(i);

            }
        });CuboidButton  b5=(CuboidButton) findViewById(R.id.p5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Books1.this,Books2hu.class);
                startActivity(i);

            }
        });
        }




    }
