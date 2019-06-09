package com.wicaksono.aby;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.wicaksono.aby.FragmenMain;

public class MainActivity extends AppCompatActivity {


    private FrameLayout menu1, menu2, menu3, menu4, menu5, menu6;
    LayoutInflater inflater;
    ViewGroup container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_activity);
        menu1 = findViewById(R.id.menu1);
        menu2 = findViewById(R.id.menu2);
        menu3 = findViewById(R.id.menu3);
        menu4 = findViewById(R.id.menu4);
        menu5 = findViewById(R.id.menu5);
        menu6 = findViewById(R.id.menu6);


        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(MainActivity.this, siakad.class);
                startActivity(goPindah);
            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(MainActivity.this, vclass.class);
                startActivity(goPindah);
            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(MainActivity.this, kkn.class);
                startActivity(goPindah);
            }
        });

        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(MainActivity.this, ekkn.class);
                startActivity(goPindah);
            }
        });

        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(MainActivity.this,unila.class);
                startActivity(goPindah);
            }
        });

        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPindah = new Intent(MainActivity.this, simanila.class);
                startActivity(goPindah);
            }
        });

//        FragmenMain homeFragment = new FragmenMain();
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.content_activity, homeFragment);
//        fragmentTransaction.commit();
//        fragmentTransaction.commitAllowingStateLoss();
    }
}
