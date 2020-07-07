package com.example.tolkworld;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.Locale;

public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
    private static final int NUM_PAGES = 2;
    private static final String BASE_NAME = "Tab #%d";
    public ScreenSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            default:
                return ScreenSlidePageFragment.newInstance("This is fragment #1");
            case 1:
                return ScreenSlidePageSecondFragment.newInstance("This is fragment #2");
        }
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       // return String.format(Locale.getDefault(), BASE_NAME, position + 1);
        switch(position){
            case 1: return "Sketches";
            default: return "Places";
        }
    }
    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}
