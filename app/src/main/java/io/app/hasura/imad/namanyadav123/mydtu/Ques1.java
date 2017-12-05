package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cuboid.cuboidcirclebutton.CuboidButton;

public class Ques1 extends AppCompatActivity {

    CuboidButton x1,x2,x3,x4,x5,x6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques1);
        x1=(CuboidButton) findViewById(R.id.k1);
        x2=(CuboidButton) findViewById(R.id.k2);
        x3=(CuboidButton) findViewById(R.id.k3);
        x4=(CuboidButton) findViewById(R.id.k4);
        x5=(CuboidButton) findViewById(R.id.k5);


        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Ques1.this,Papers1Physics.class);
                startActivity(i);
            }
        });
        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Ques1.this,Papers1Maths.class);
                startActivity(i);
            }
        });
        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Ques1.this,Papers2Chem.class);
                startActivity(i);
            }
        });
        x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Ques1.this,Papers2bme.class);
                startActivity(i);
            }
        });
        x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Ques1.this,Papers2hu.class);
                startActivity(i);
            }
        });



    }
}
