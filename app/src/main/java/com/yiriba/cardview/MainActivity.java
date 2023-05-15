package com.yiriba.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.yiriba.cardview.adapter.MyPagerAdapter;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.viewPager);

        MyPagerAdapter myAdapter = new MyPagerAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}