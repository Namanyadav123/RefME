package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FirstSem extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_firstsem);

        TextView t1=  (TextView) findViewById(R.id.books);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstSem.this,Books1.class);
                startActivity(i);

            }
        });
        TextView t2=  (TextView) findViewById(R.id.notes);

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstSem.this,Notes1.class);
                startActivity(i);

            }
        });
        TextView t3=  (TextView) findViewById(R.id.ques);

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstSem.this,Ques1.class);
                startActivity(i);

            }
        });



    }
}