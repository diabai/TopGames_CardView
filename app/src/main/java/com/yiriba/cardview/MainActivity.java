package com.yiriba.cardview;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.yiriba.cardview.adapter.MyPagerAdapter;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabLayout tabLayout = findViewById(R.id.tabLayout);
        TabItem tabChat = findViewById(R.id.ti_chat);
        TabItem tabStatus = findViewById(R.id.ti_status);
        TabItem tabCalls = findViewById(R.id.ti_calls);

        ViewPager viewPager = findViewById(R.id.viewPager);
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

    }

}