package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondSem extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.first103, R.string.first82,
                R.drawable.coe3));
        words.add(new Word( R.string.first102,R.string.first73,
                R.drawable.it3 ));
        words.add(new Word(R.string.first89,R.string.first74
                ,R.drawable.se3));
        words.add(new Word(R.string.first90,R.string.first75,
                R.drawable.ece3));
        words.add(new Word(R.string.first91,R.string.first85,
                R.drawable.mce3));
        words.add(new Word( R.string.first92,R.string.first76,
                R.drawable.eee3));
        words.add(new Word(R.string.first93, R.string.first77,
                R.drawable.ee3));
        words.add(new Word(R.string.first94, R.string.first87,
                R.drawable.ep3));
        words.add(new Word(R.string.first95, R.string.first78,
                R.drawable.me3));
        words.add(new Word(R.string.first96, R.string.first79,
                R.drawable.ce3));
        words.add(new Word(R.string.first97, R.string.first88,
                R.drawable.mam3));
        words.add(new Word(R.string.first98, R.string.first80,
                R.drawable.pct3));
        words.add(new Word(R.string.first99, R.string.first83,
                R.drawable.ene3));
        words.add(new Word(R.string.first100, R.string.first84,
                R.drawable.pie3));
        words.add(new Word(R.string.first101, R.string.first86,
                R.drawable.bt3));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter4 adapter = new WordAdapter4(SecondSem.this, words, R.color.colorAccent5);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                switch (i){

                    case 0:

                        Intent intent=new Intent(getApplicationContext(),COE.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1=new Intent(getApplicationContext(),COE.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2=new Intent(getApplicationContext(),SE.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(getApplicationContext(),ECE.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(getApplicationContext(),MCE.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5=new Intent(getApplicationContext(),EEE.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6=new Intent(getApplicationContext(),EE.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7=new Intent(getApplicationContext(),EP.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8=new Intent(getApplicationContext(),ME.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9=new Intent(getApplicationContext(),CE.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10=new Intent(getApplicationContext(),MAM.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11=new Intent(getApplicationContext(),PSCT.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12=new Intent(getApplicationContext(),ENE.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13=new Intent(getApplicationContext(),PIE.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14=new Intent(getApplicationContext(),BT.class);
                        startActivity(intent14);
                        break;


                }



            }
        });
    }


}


