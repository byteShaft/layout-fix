package com.leeya;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter
{
    public TabPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }



    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                // Fragment for Level-1 Tab
                return new Level1();
            case 1:
                // Fragment for Level-2 Tab
                return new Level2();
            case 2:
                // Fragment for Level-3 Tab
                return new Level3();
            case 3:
                // Fragment for Level-4 Tab
                return new Level4();
        }
        return null;
    }

    public int getCount()
    {
        return 4;
    }
}
