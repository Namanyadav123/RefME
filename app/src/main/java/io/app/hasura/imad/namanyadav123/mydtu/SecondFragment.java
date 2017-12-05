package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cuboid.cuboidcirclebutton.CuboidButton;


public class SecondFragment extends Fragment {

    View view;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

      View  rootview = inflater.inflate(R.layout.activity_second, container, false);

        CuboidButton course7 = (CuboidButton) rootview.findViewById(R.id.button2);
        course7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),MapsActivity.class);
                startActivity(i);

            }
        });
        CuboidButton lab2 = (CuboidButton) rootview.findViewById(R.id.lab);
        lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),LabLocation.class);
                startActivity(i);

            }
        });
        CuboidButton hint = (CuboidButton) rootview.findViewById(R.id.hint);
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Usage.class);
                startActivity(i);

            }
        });

        return rootview;
    }

}