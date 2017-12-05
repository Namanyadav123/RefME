package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cuboid.cuboidcirclebutton.CuboidButton;

public class Notes1 extends AppCompatActivity {

CuboidButton x1,x2,x3,x4,x5,x6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes1);
        x1=(CuboidButton) findViewById(R.id.n1);
        x2=(CuboidButton) findViewById(R.id.n2);
        x3=(CuboidButton) findViewById(R.id.n3);
        x4=(CuboidButton) findViewById(R.id.n4);
        x5=(CuboidButton) findViewById(R.id.n5);


        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Notes1.this,Notes1Physics.class);
                startActivity(i);
            }
        });
        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Notes1.this,Notes1Maths.class);
                startActivity(i);
            }
        });
        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Notes1.this,Notes2chem.class);
                startActivity(i);
            }
        });
        x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Notes1.this,Notes2bme.class);
                startActivity(i);
            }
        });
        x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Notes1.this,Notes2hu.class);
                startActivity(i);
            }
        });



    }
}
