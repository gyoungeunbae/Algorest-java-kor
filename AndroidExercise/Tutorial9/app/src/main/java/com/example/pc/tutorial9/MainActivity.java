package com.example.pc.tutorial9;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Adapter adater;
    ViewPager viewPager;
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         viewPager = (ViewPager)findViewById(R.id.view);
         adater = new Adapter(this);
         viewPager.setAdapter(adater);

    }
}
