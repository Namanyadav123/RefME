package io.app.hasura.imad.namanyadav123.mydtu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Cont1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);



        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.first374, R.string.first373));
        words.add(new Word(R.string.first368, R.string.first367));
        words.add(new Word(R.string.first252, R.string.first251));
        words.add(new Word(R.string.first254, R.string.first253));
        words.add(new Word(R.string.first256, R.string.first255));
        words.add(new Word(R.string.first258, R.string.first257));
        words.add(new Word(R.string.first260, R.string.first259));
        words.add(new Word(R.string.first262,R.string.first261));
        words.add(new Word(R.string.first264, R.string.first263));
        words.add(new Word(R.string.first266, R.string.first265));
        words.add(new Word(R.string.first268, R.string.first267));
        words.add(new Word(R.string.first270, R.string.first269));
        words.add(new Word(R.string.first272, R.string.first271));
        words.add(new Word(R.string.first274, R.string.first273));
        words.add(new Word(R.string.first276, R.string.first275));
        words.add(new Word(R.string.first278, R.string.first277));
        words.add(new Word(R.string.first280, R.string.first279));
        words.add(new Word(R.string.first282, R.string.first281));
        words.add(new Word(R.string.first284, R.string.first283));
        words.add(new Word(R.string.first348, R.string.first347));
        words.add(new Word(R.string.first350, R.string.first349));
        words.add(new Word(R.string.first352, R.string.first351));
        words.add(new Word(R.string.first354, R.string.first353));
        words.add(new Word(R.string.first356, R.string.first355));
        words.add(new Word(R.string.first358, R.string.first357));
        words.add(new Word(R.string.first360, R.string.first359));
        words.add(new Word(R.string.first362, R.string.first361));
        words.add(new Word(R.string.first364, R.string.first363));
        words.add(new Word(R.string.first366, R.string.first365));
        words.add(new Word(R.string.first248, R.string.first247));
        words.add(new Word(R.string.first370, R.string.first369));
        words.add(new Word(R.string.first372, R.string.first371));
        words.add(new Word(R.string.first250, R.string.first249));
        words.add(new Word(R.string.first376, R.string.first375));
        words.add(new Word(R.string.first378, R.string.first377));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter5 adapter = new WordAdapter5(Cont1.this, words, R.color.colorAccent4);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
