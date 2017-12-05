package io.app.hasura.imad.namanyadav123.mydtu;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.cuboid.cuboidcirclebutton.CuboidButton;


public class Books4mce extends AppCompatActivity {
    CuboidButton b1,b2,b3,b4,b5,b6,b7;
    DownloadManager dm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books4mce);

        b1 = (CuboidButton) findViewById(R.id.books4mce1);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/horowitz-and-sahani-fundamentals-of-computer-algorithms-2nd-edition.pdf?alt=media&token=1cc953c2-d7d4-488a-bfb6-ea76fee01298");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b2 = (CuboidButton) findViewById(R.id.books4mce2);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/MK.Computer.Organization.and.Design.4th.Edition.Oct.2011.pdf?alt=media&token=f00cb8cd-3f03-4da9-8303-789f23c614f1");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b3 = (CuboidButton) findViewById(R.id.books4mce3);
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(Books4mce.this,"Sorry,Not Available",Toast.LENGTH_SHORT).show();

            }


        });
        b4 = (CuboidButton) findViewById(R.id.books4mce4);
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(Books4mce.this,"Sorry,Not Available",Toast.LENGTH_SHORT).show();

            }


        });
        b5 = (CuboidButton) findViewById(R.id.books4mce5);
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(Books4mce.this,"Sorry,Not Available",Toast.LENGTH_SHORT).show();

            }


        });
        b6 = (CuboidButton) findViewById(R.id.books4mce6);
        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Fundamentals%20of%20Management.pdf?alt=media&token=503617de-b393-480f-a071-03ab48ceee79");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });

    }
}
