package io.app.hasura.imad.namanyadav123.mydtu;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class Papers4ce extends AppCompatActivity {
    ImageView b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    DownloadManager dm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papers4ce);

        b1 = (ImageView) findViewById(R.id.ce4papers1);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Civil%20design%20of%20structural%20elements%202010%20endsem%20may.pdf?alt=media&token=72966b22-e67e-4a78-b241-9a2dd1060b32");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b2 = (ImageView) findViewById(R.id.ce4papers2);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/civil%20electrical%20technology%202010%20endsem%20may.pdf?alt=media&token=fcd9cdf9-4afd-4236-81bd-0ad97886bd88");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b3 = (ImageView) findViewById(R.id.ce4papers3);
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/civil%20fluid%20mech%202012%20may%20endsem.pdf?alt=media&token=0792a556-a5c1-4a56-8b07-ff074fb42ae5");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b4 = (ImageView) findViewById(R.id.ce4papers4);
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/civil%20engg%20geology%202012%20may%20endsem.pdf?alt=media&token=b5336e59-912a-4a66-8490-cb6f85a35b5e");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b5 = (ImageView) findViewById(R.id.ce4papers5);
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/civil%20fundamentals%20of%20mech%20engg%202012%20may%20endsem.pdf?alt=media&token=5f615a33-72b4-4fdf-a8cf-75bc809bdc7e");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b6 = (ImageView) findViewById(R.id.ce4papers6);
        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/civil%20hydraulics%20and%20hydraulic%20machines%202017%20endsem%20may.pdf?alt=media&token=294e0dfb-7ce0-42a0-830e-51b80862ec1f");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b7 = (ImageView) findViewById(R.id.ce4papers7);
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Civil%20soil%20mechanics%202010%20endsem%20May.pdf?alt=media&token=523bc79b-ea12-4c82-a4a5-86db6eb4c958");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b8 = (ImageView) findViewById(R.id.ce4papers8);
        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Civil%20soil%20mechanics%202017%20endsem%20may.pdf?alt=media&token=e41a4ae9-5e6a-4c25-9e9e-ea3d950eca5a");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b9 = (ImageView) findViewById(R.id.ce4papers9);
        b9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/civil%20structural%20analysis%202012%20may%20endsem.pdf?alt=media&token=06a4428c-4385-4148-8908-36acfaaab225");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b10 = (ImageView) findViewById(R.id.ce4papers10);
        b10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/civil%20surveying%201%202010%20endsem%20may.pdf?alt=media&token=84dae001-e16d-4538-b2f0-597ac13c1f46");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b11 = (ImageView) findViewById(R.id.ce4papers11);
        b11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/civil%20surveying%202%202012%20may%20endsem.pdf?alt=media&token=f19d9077-e984-4802-8b2f-84ac3637bd7a\n");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b12 = (ImageView) findViewById(R.id.ce4papers12);
        b12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i=new Intent(Papers4ce.this,Fom4papers.class);
                startActivity(i);
            }


        });


    }
}
