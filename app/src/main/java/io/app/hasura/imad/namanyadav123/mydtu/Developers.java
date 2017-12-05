package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class Developers extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_aboutdeveloper);

        CircleImageView t1 = (CircleImageView) findViewById(R.id.naman3);



        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url2 = "https://www.instagram.com/namy_ambusment/";
                Intent i1 = new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse(url2));
                startActivity(i1);


            }
        });
    }
}
