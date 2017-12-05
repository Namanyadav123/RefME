package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cuboid.cuboidcirclebutton.CuboidButton;

public class Ques2 extends AppCompatActivity {

    CuboidButton x1,x2,x3,x4,x5,x6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques2);
        x1=(CuboidButton) findViewById(R.id.a1);
        x2=(CuboidButton) findViewById(R.id.a2);
        x3=(CuboidButton) findViewById(R.id.a3);
        x4=(CuboidButton) findViewById(R.id.a4);
        x5=(CuboidButton) findViewById(R.id.a5);
        x6=(CuboidButton) findViewById(R.id.a6);


        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Ques2.this,Papers2Physics.class);
                startActivity(i);
            }
        });
        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Ques2.this,Papers2Maths.class);
                startActivity(i);
            }
        });
        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Ques2.this,Papers1EE.class);
                startActivity(i);
            }
        });
        x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Ques2.this,Papers1Comp.class);
                startActivity(i);
            }
        });
        x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Ques2.this,Papers1Ene.class);
                startActivity(i);
            }
        });
        x6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Ques2.this,Papers1ED.class);
                startActivity(i);
            }
        });


    }
}
