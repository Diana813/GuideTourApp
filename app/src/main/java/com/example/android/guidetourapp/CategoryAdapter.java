package com.example.android.guidetourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by diana on 22.05.2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {



    /** Context of the app */
    private Context mContext;

    public CategoryAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NatureFragment();
        } else if (position == 1){
            return new EntertainmentFragment();
        } else if (position == 2){
            return new RestaurantsFragment();
        }else {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

   @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_nature);
        } else if (position == 1) {
            return mContext.getString(R.string.category_entertainment);
        } else if (position == 2) {
            return mContext.getString(R.string.category_restaurants);
        } else {
            return mContext.getString(R.string.category_hotels);
        }
    }
}
