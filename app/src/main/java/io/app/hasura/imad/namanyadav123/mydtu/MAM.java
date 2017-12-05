package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MAM extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_thirdsem);

        TextView t1=  (TextView) findViewById(R.id.books2);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MAM.this,Books3mam.class);
                startActivity(i);

            }
        });

        TextView t3=  (TextView) findViewById(R.id.ques2);

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MAM.this,"Sorry,Papers Are Not Available Now For This Sem,They'll Be Uploaded Soon",Toast.LENGTH_SHORT).show();


            }
        });
        TextView t4=  (TextView) findViewById(R.id.cont2);

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MAM.this,Cont1.class);
                startActivity(i);

            }
        });


    }
}