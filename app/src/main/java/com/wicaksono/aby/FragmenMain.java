package com.wicaksono.aby;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;




/**
 * Created by Mhd Khalid on 11/8/2018.
 */

public class FragmenMain extends Fragment {




    private FrameLayout menu1, menu2, menu3, menu4, menu5, menu6;

    public FragmenMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_activity, container, false);
        // Inflate the layout for this fragment


        menu1 = (FrameLayout) rootView.findViewById(R.id.menu1);
        menu2 = (FrameLayout) rootView.findViewById(R.id.menu2);
        menu3 = (FrameLayout) rootView.findViewById(R.id.menu3);
        menu4 = (FrameLayout) rootView.findViewById(R.id.menu4);
        menu5 = (FrameLayout) rootView.findViewById(R.id.menu5);
        menu6 = (FrameLayout) rootView.findViewById(R.id.menu6);


        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(getActivity(), siakad.class);
                startActivity(goPindah);
            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(getActivity(), vclass.class);
                startActivity(goPindah);
            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(getActivity(), kkn.class);
                startActivity(goPindah);
            }
        });

        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(getActivity(), ekkn.class);
                startActivity(goPindah);
            }
        });

        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(getActivity(), unila.class);
                startActivity(goPindah);
            }
        });

        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(getActivity(), simanila.class);
                startActivity(goPindah);
            }
        });
        // jika internet aktfif


        return rootView;
    }





}