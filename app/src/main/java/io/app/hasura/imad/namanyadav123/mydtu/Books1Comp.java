package io.app.hasura.imad.namanyadav123.mydtu;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class Books1Comp extends AppCompatActivity {
    ImageView b1,b2,b3,b4,b5;
    DownloadManager dm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books1comp);

        b1 = (ImageView) findViewById(R.id.comp1);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/c-the-complete-reference-4th-edition-by-herbert-schildt%20(1).pdf?alt=media&token=958e9d9e-c760-451b-9bc2-a227289b573c");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b2 = (ImageView) findViewById(R.id.comp2);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/c-the-complete-reference-herbert-schildt-4th-edition%20(1).pdf?alt=media&token=7d7080a0-ac0e-4a25-ac20-8631afc2f04b");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b3 = (ImageView) findViewById(R.id.comp3);
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/let-us-c-yashwant-kanetkar.pdf?alt=media&token=a642bf19-baf0-43e8-8e7f-3d466bece80a");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b4 = (ImageView) findViewById(R.id.comp4);
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/problem-solving-and-program-design-in-c-jeri-r-hanly%20(1).pdf?alt=media&token=c598a19a-8986-4eda-8de8-c7b299984f88");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
        b5 = (ImageView) findViewById(R.id.comp5);
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/the-c-programming-language.pdf?alt=media&token=9c23d92c-1342-4d4c-ae3e-d4211d19b3a8");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                Long reference = dm.enqueue(request);
            }


        });
    }
}
