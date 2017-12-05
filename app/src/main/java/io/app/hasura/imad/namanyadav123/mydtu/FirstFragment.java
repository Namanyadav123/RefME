/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class FirstFragment extends Fragment  {


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_first, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.first6, R.string.first,
                R.drawable.one));
        words.add(new Word (R.string.first7,R.string.first1,
                R.drawable.one ));
        words.add(new Word(R.string.first8,R.string.first2
                ,R.drawable.two));
        words.add(new Word(R.string.first9,R.string.first3,
                R.drawable.two));
        words.add(new Word( R.string.first10,R.string.first4,
                R.drawable.n11));
        words.add(new Word( R.string.first272,R.string.first271,
                R.drawable.c));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter1 adapter = new WordAdapter1(getActivity(), words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);





        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                switch (i){

                    case 0:

                        Intent intent=new Intent(getActivity(),FirstSem.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1=new Intent(getActivity(),FirstSem2.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2=new Intent(getActivity(),SecondSem.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(getActivity(),ThirdSem.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(getActivity(),NotesAllYears.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5=new Intent(getActivity(),Cont1.class);
                        startActivity(intent5);
                        break;

                }



            }
        });


            return rootView;


    }

    }
