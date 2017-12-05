package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class BT4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_thirdsem);


        TextView t1=  (TextView) findViewById(R.id.books2);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BT4.this,Books4bt.class);
                startActivity(i);

            }
        });

        TextView t3=  (TextView) findViewById(R.id.ques2);

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BT4.this,Papers4bt.class);
                startActivity(i);

            }
        });
        TextView t4=  (TextView) findViewById(R.id.cont2);

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(BT4.this,Cont1.class);
                startActivity(i);

            }
        });


    }
}