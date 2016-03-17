package com.example.tempuser.phaseone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by tempuser on 3/4/16.
 */
public class CustomPagerAdapter extends FragmentPagerAdapter {

    public CustomPagerAdapter(FragmentManager fm){
        super(fm);
    }

    // titles to be used in the tablayout. Returned using getPageTitle()
    private String[] tabTitles = { "Editor", "Browser", "Results"};
    // the number of panels created on the ViewPager
    private int panelCount = 3;


    @Override
    public Fragment getItem(int pos){
        switch (pos){
            case 0:
                return EditorFragment.getInstance();
            case 1:
                return BrowserFragment.getInstance();
            default:
                return ResultsFragment.getInstance();
        }

    }

    @Override
    public int getCount(){
        return panelCount;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }


}
