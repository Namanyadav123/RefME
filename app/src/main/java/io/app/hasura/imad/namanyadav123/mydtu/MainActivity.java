package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        int SPLASH_TIME_OUT = 2000;
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);


                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }



}
