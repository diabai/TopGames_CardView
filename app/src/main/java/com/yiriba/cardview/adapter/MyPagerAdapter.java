package com.yiriba.cardview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.yiriba.cardview.model.Course;

public class MyPagerAdapter extends PagerAdapter  {

    private Context context;

    public MyPagerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        Course course =  Course.values()[position];
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewGroup layout = (ViewGroup) inflater.inflate(course.getmLayoutID(), container, false);
        container.addView(layout);
        return layout;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager) container).removeView((View) object);
    }

    @Override
    public int getCount() {
        return Course.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Course customPagerEnum = Course.values()[position];
        return context.getString(customPagerEnum.getmTitleID());
    }
}
