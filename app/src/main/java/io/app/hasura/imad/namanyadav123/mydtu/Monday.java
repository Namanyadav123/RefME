package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Monday extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word( R.string.first13,R.string.first24,
                R.drawable.cvr ));
        words.add(new Word(R.string.first15,R.string.first26,
                R.drawable.vhs));
        words.add(new Word( R.string.first16,R.string.first27,
                R.drawable.vvs));
        words.add(new Word(R.string.first17, R.string.first28,
                R.drawable.hjbb));
        words.add(new Word(R.string.first18, R.string.first29,
                R.drawable.arya));
        words.add(new Word(R.string.first20, R.string.first31,
                R.drawable.snh));
        words.add(new Word( R.string.first13,R.string.first25,
                R.drawable.jcb ));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(Monday.this, words, R.color.colorAccent7);

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

                        Intent intent=new Intent(getApplicationContext(),HostelBCH.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1=new Intent(getApplicationContext(),HostelBCH.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2=new Intent(getApplicationContext(),HostelBCH.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent5=new Intent(getApplicationContext(),HostelHJBMonday.class);
                        startActivity(intent5);
                        break;
                    case 4:
                        Intent intent6=new Intent(getApplicationContext(),HostelGirlsMonday.class);
                        startActivity(intent6);
                        break;

                    case 5:
                        Intent intent10=new Intent(getApplicationContext(),HostelGirlsMonday.class);
                        startActivity(intent10);
                        break;
                    case 6:
                        Intent intent7=new Intent(getApplicationContext(),HostelBCH.class);
                        startActivity(intent7);
                        break;
                }



            }
        });
    }


    }


