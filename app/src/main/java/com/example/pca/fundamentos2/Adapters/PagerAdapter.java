package com.example.pca.fundamentos2.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.pca.fundamentos2.fragments.tab_fragment_1;
import com.example.pca.fundamentos2.fragments.tab_fragment_2;
import com.example.pca.fundamentos2.fragments.tab_fragment_3;

public class PagerAdapter extends FragmentStatePagerAdapter{

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm , int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                tab_fragment_1 tab1 = new tab_fragment_1();
                return tab1;
            case 1:
                tab_fragment_2 tab2 = new tab_fragment_2();
                return tab2;
            case 2:
                tab_fragment_3 tab3 = new tab_fragment_3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
