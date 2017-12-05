package io.app.hasura.imad.namanyadav123.mydtu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class LabLocation extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.first236, R.string.first225
               ));
        words.add(new Word( R.string.first237,R.string.first226
               ));
        words.add(new Word(R.string.first238,R.string.first224
                ));
        words.add(new Word(R.string.first239,R.string.first227
                ));
        words.add(new Word( R.string.first240,R.string.first228
               ));
        words.add(new Word(R.string.first241, R.string.first229
            ));
        words.add(new Word(R.string.first242, R.string.first234
               ));
        words.add(new Word(R.string.first243, R.string.first230
              ));
        words.add(new Word(R.string.first244, R.string.first231
             ));
        words.add(new Word(R.string.first245, R.string.first232
               ));
        words.add(new Word(R.string.first246, R.string.first233
            ));
        words.add(new Word(R.string.first383, R.string.first379
                ));
        words.add(new Word(R.string.first384, R.string.first380
        ));  words.add(new Word(R.string.first385, R.string.first381
    ));  words.add(new Word(R.string.first386, R.string.first382
    )); 
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter7 adapter = new WordAdapter7(LabLocation.this, words, R.color.colorAccent9);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);






    }


}


