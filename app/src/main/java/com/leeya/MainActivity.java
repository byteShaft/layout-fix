package com.leeya;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;


public class MainActivity extends FragmentActivity
{
    ViewPager Tab;
    TabPagerAdapter TabAdapter;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabAdapter = new TabPagerAdapter(getSupportFragmentManager());
        Tab = (ViewPager) findViewById(R.id.pager);
        Tab.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                //actionBar = getActionBar();
                //actionBar.setSelectedNavigationItem(position);

            }
        });
        Tab.setAdapter(TabAdapter);
        //actionBar = getActionBar();
        // Enable Tabs on Action Bar
        //actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        /*ActionBar.TabListener tabListener = new ActionBar.TabListener()
        {
            @Override
            public void onTabReselected(android.app.ActionBar.Tab tab, FragmentTransaction ft)
            {
            }

            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft)
            {
                Tab.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(android.app.ActionBar.Tab tab,FragmentTransaction ft)
            {
            }
        };
        //Add New Tab
        *//*actionBar.addTab(actionBar.newTab().setText("Explore").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("Words").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("Story").setTabListener(tabListener));*//*
        actionBar.addTab(actionBar.newTab().setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setTabListener(tabListener));
    }*/
    }
}