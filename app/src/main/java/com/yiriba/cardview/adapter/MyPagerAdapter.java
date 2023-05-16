package com.yiriba.cardview.adapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.yiriba.cardview.fragment.CallsFragment;
import com.yiriba.cardview.fragment.ChatFragment;
import com.yiriba.cardview.fragment.StatusFragment;


public class MyPagerAdapter extends FragmentPagerAdapter {


    private int numTabs;

    public MyPagerAdapter(@NonNull FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ChatFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return numTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        switch(position) {
            case 0:
                title = "Chats";
                break;
            case 1:
                title = "Status";
                break;
            case 2:
                title = "Calls";
        }
        return title;
    }
}
