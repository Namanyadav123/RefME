package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cuboid.cuboidcirclebutton.CuboidButton;

public class Books2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books2);

      CuboidButton  b1=(CuboidButton) findViewById(R.id.m1);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Books2.this,Books1Physics.class);
                    startActivity(i);

                }
            });
        CuboidButton  b2=(CuboidButton) findViewById(R.id.m2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Books2.this,Books1Maths.class);
                startActivity(i);

            }
        }); CuboidButton  b3=(CuboidButton) findViewById(R.id.m3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Books2.this,Books1Electrical.class);
                startActivity(i);

            }
        }); CuboidButton  b4=(CuboidButton) findViewById(R.id.m4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Books2.this,Books1Comp.class);
                startActivity(i);

            }
        }); CuboidButton  b5=(CuboidButton) findViewById(R.id.m5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Books2.this,Books1Envi.class);
                startActivity(i);

            }
        }); CuboidButton  b6=(CuboidButton) findViewById(R.id.m6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Books2.this,Books1ED.class);
                startActivity(i);

            }
        });
        }




    }
