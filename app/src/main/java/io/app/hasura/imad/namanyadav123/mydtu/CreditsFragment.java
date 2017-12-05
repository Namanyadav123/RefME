package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cuboid.cuboidcirclebutton.CuboidButton;

public class CreditsFragment extends Fragment {
    View view;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View  rootView = inflater.inflate(R.layout.activity_food, container, false);



        CuboidButton course1 = (CuboidButton) rootView.findViewById(R.id.circle1);
        course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Monday.class);
                startActivity(i);

            }
        });
        CuboidButton course2 = (CuboidButton) rootView.findViewById(R.id.cuboidButton);
        course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Tuesday.class);
                startActivity(i);

            }
        });
        CuboidButton course3 = (CuboidButton) rootView.findViewById(R.id.cuboidButton3);
        course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Wednesday.class);
                startActivity(i);

            }
        });
        CuboidButton course4 = (CuboidButton) rootView.findViewById(R.id.cuboidButton4);
        course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Thursday.class);
                startActivity(i);

            }
        });
        CuboidButton course5 = (CuboidButton) rootView.findViewById(R.id.cuboidButton5);
        course5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Friday.class);
                startActivity(i);

            }
        });
        CuboidButton course6 = (CuboidButton) rootView.findViewById(R.id.cuboidButton6);
        course6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Saturday.class);
                startActivity(i);

            }
        });

        CuboidButton course7 = (CuboidButton) rootView.findViewById(R.id.cuboidButton7);
        course7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Sunday.class);
                startActivity(i);

            }
        });




        return rootView;
    }


}