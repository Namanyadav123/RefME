package io.app.hasura.imad.namanyadav123.mydtu;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class Papers3coe extends AppCompatActivity {
    ImageView b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    DownloadManager dm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papers3coe);

        b1 = (ImageView) findViewById(R.id.coe3papers1);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/analog%20electronics%202010%20nov%20endsem.pdf?alt=media&token=5ee5a2d9-9021-4004-b46e-2897a940d113");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b2 = (ImageView) findViewById(R.id.coe3papers2);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/analog%20electronics%202010%20sept%20midsem.jpg?alt=media&token=f6f23c28-a5a1-4b15-93aa-a4166bc31838");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b3 = (ImageView) findViewById(R.id.coe3papers3);
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/analog%20electronics%202011%20sept%20midsem%202.jpg?alt=media&token=aed567e5-647f-460c-a8a8-718b3f9396a9");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b4 = (ImageView) findViewById(R.id.coe3papers4);
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/data%20structure%202010%20nov%20endsem.pdf?alt=media&token=e9beb029-3266-4a9e-bebc-8de526e57d7d");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b5 = (ImageView) findViewById(R.id.coe3papers5);
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/data%20structures%202010%20sept%20midsem.pdf?alt=media&token=90279ef4-e6db-4c82-bc80-514beac71012");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });

        b6 = (ImageView) findViewById(R.id.coe3papers6);
        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/data%20structures%202010%20sept%20midsem.jpg?alt=media&token=f0e71bf3-dcd8-44e2-9600-dec74ef28a9d");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b7= (ImageView) findViewById(R.id.coe3papers7);
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/digital%20circuits%20and%20systems%202010%20sept%20midsem.pdf?alt=media&token=58bffeb4-f031-43c8-9ae1-378ab4e97bf7");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b8 = (ImageView) findViewById(R.id.coe3papers8);
        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/digital%20system%20design%202011%20sept%20midsem.jpg?alt=media&token=4bb930fa-9dd2-4f44-8e70-48d105b2b338");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b9 = (ImageView) findViewById(R.id.coe3papers9);
        b9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/discrete%20mathematics%202010%20nov%20endsem.pdf?alt=media&token=7b108067-6dc0-4c37-ae4d-b6e78ef1006d");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b10 = (ImageView) findViewById(R.id.coe3papers10);
        b10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/discrete%20mathematics%202010%20sept%20midsem.pdf?alt=media&token=6de5bf27-bb8a-4f1b-81f9-67fac2662f71");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });

        b11 = (ImageView) findViewById(R.id.coe3papers11);
        b11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/oops%202010%20nov%20endsem.pdf?alt=media&token=5f869d6c-28ab-4627-9146-c06e630ec5d8");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b12 = (ImageView) findViewById(R.id.coe3papers12);
        b12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/oops%202010%20sept%20midsem.jpg?alt=media&token=feecf20b-30d1-4349-86c9-8432b7a6ba48");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b13 = (ImageView) findViewById(R.id.coe3papers13);
        b13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/oops%202011%20sept%20midsem.jpg?alt=media&token=e8106c0a-0d24-459b-a9b6-ffb619ff09c8");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b14 = (ImageView) findViewById(R.id.coe3papers14);
        b14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/se%20analog%20electronics%202010%20midsem%20sept.jpg?alt=media&token=eee1a48e-a6d0-42e9-827b-6f45f32f5048");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b15 = (ImageView) findViewById(R.id.coe3papers15);
        b15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/se%20digital%20systems%202010%20sept%20midsem.jpg?alt=media&token=6f3b98f6-12eb-46b0-9fb4-155ceb5b5f20");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b16 = (ImageView) findViewById(R.id.coe3papers16);
        b16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i=new Intent(Papers3coe.this,Eco3papers.class);
                startActivity(i);
            }


        });



    }
}
