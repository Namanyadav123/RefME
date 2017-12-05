package io.app.hasura.imad.namanyadav123.mydtu;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cuboid.cuboidcirclebutton.CuboidButton;


public class Books4mam extends AppCompatActivity {
    CuboidButton b1,b2,b3,b4,b5,b6,b7;
    DownloadManager dm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books4mam);

        b1 = (CuboidButton) findViewById(R.id.books4mam1);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Understanding-Automotive-Electronics.pdf?alt=media&token=c26bfe9e-f99d-479a-966f-580873a5af3b");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b2 = (CuboidButton) findViewById(R.id.books4mam2);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Fundamentals%20of%20Heat%20and%20Mass%20Transfer%20-%206th%20Edition%20Incropera%20.pdf?alt=media&token=82413339-bd48-42d3-9c65-84c10ac6389d");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b3 = (CuboidButton) findViewById(R.id.books4mam3);
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/book_maretial-science-callister.pdf?alt=media&token=ea00fd6f-aaab-40ec-8cde-9974be2832a0");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b4 = (CuboidButton) findViewById(R.id.books4mam4);
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Strength-of-material-by%20R%20K%20Bansal.pdf.pdf?alt=media&token=0bbd6104-dcf9-47f0-8bef-c0f7d290d73e");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b5 = (CuboidButton) findViewById(R.id.books4mam5);
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Theories%20of%20Machine%20-%20S.s.Rattan.pdf.pdf?alt=media&token=3425353c-2541-4b74-b7c3-0bd332347027");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b6 = (CuboidButton) findViewById(R.id.books4mam6);
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
