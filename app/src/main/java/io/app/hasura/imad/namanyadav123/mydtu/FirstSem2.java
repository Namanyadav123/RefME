package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FirstSem2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_secsem);

        TextView t1=  (TextView) findViewById(R.id.books2);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstSem2.this,Books2.class);
                startActivity(i);

            }
        });
        TextView t2=  (TextView) findViewById(R.id.notes2);

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstSem2.this,Notes2.class);
                startActivity(i);

            }
        });
        TextView t3=  (TextView) findViewById(R.id.ques2);

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstSem2.this,Ques2.class);
                startActivity(i);

            }
        });



    }
}