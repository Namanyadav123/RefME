package io.app.hasura.imad.namanyadav123.mydtu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


public class ThirdFragment extends Fragment {

    View view;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

      View  rview = inflater.inflate(R.layout.activity_first, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.first67, R.string.first58));
        words.add(new Word(R.string.first68, R.string.first191));
        words.add(new Word(R.string.first69, R.string.first192));
        words.add(new Word(R.string.first70, R.string.first193));
        words.add(new Word(R.string.first71, R.string.first194));
        words.add(new Word(R.string.first197, R.string.first195));
        words.add(new Word(R.string.first198, R.string.first55));
        words.add(new Word(R.string.first199,R.string.first223));
        words.add(new Word(R.string.first200, R.string.first45));
        words.add(new Word(R.string.first201, R.string.first46));
        words.add(new Word(R.string.first203, R.string.first47));
        words.add(new Word(R.string.first204, R.string.first49));
        words.add(new Word(R.string.first205, R.string.first196));
        words.add(new Word(R.string.first206, R.string.first50));
      words.add(new Word(R.string.first207, R.string.first51));
      words.add(new Word(R.string.first208, R.string.first52));
      words.add(new Word(R.string.first209, R.string.first53));
      words.add(new Word(R.string.first210, R.string.first54));
      words.add(new Word(R.string.first211, R.string.first55));
      words.add(new Word(R.string.first212, R.string.first223));
      words.add(new Word(R.string.first213, R.string.first56));
      words.add(new Word(R.string.first214, R.string.first57));
      words.add(new Word(R.string.first216, R.string.first60));
      words.add(new Word(R.string.first217, R.string.first61));
      words.add(new Word(R.string.first218, R.string.first62));
      words.add(new Word(R.string.first219, R.string.first63));
      words.add(new Word(R.string.first220, R.string.first64));
      words.add(new Word(R.string.first221, R.string.first65));
      words.add(new Word(R.string.first222, R.string.first66));




      // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter6 adapter = new WordAdapter6(getActivity(), words, R.color.category_numbers2);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rview.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);






        return rview;
    }

}