package io.app.hasura.imad.namanyadav123.mydtu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class sample extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.first12, R.string.first23
              ));
        words.add(new Word( R.string.first13,R.string.first24
                ));
        words.add(new Word(R.string.first14,R.string.first25
              ));
        words.add(new Word(R.string.first15,R.string.first26
                ));
        words.add(new Word( R.string.first16,R.string.first27
        ));
        words.add(new Word(R.string.first17, R.string.first28
        ));
        words.add(new Word(R.string.first18, R.string.first29
        ));
        words.add(new Word(R.string.first19, R.string.first30
        ));
        words.add(new Word(R.string.first20, R.string.first31
        ));
        words.add(new Word(R.string.first21, R.string.first32
               ));
        words.add(new Word(R.string.first22, R.string.first33
               ));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(sample.this, words, R.color.colorAccent);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }


}


