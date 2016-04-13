package com.leeya;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;


public class MainActivity extends FragmentActivity {
    ViewPager Tab;
    TabPagerAdapter TabAdapter;
    ActionBar actionBar;

    private ImageView buttonOneSlected;
    private ImageView buttonTwo;
    private ImageView buttonThree;
    private ImageView buttonFour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOneSlected = (ImageView) findViewById(R.id.one_selected);
        buttonTwo = (ImageView) findViewById(R.id.two);
        buttonThree = (ImageView) findViewById(R.id.three);
        buttonFour = (ImageView) findViewById(R.id.four);

        TabAdapter = new TabPagerAdapter(getSupportFragmentManager());
        Tab = (ViewPager) findViewById(R.id.pager);
        Tab.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                //actionBar = getActionBar();
                //actionBar.setSelectedNavigationItem(position);
                setImage(position);

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

    private void setImage(int position) {
        switch (position) {
            case 0:
                buttonOneSlected.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttononeclick));
                buttonTwo.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttontwo));
                buttonThree.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttonthree));
                buttonFour.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttonfour));
                break;
            case 1:
                buttonOneSlected.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttonone));
                buttonTwo.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttontwoclick));
                buttonThree.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttonthree));
                buttonFour.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttonfour));
                break;
            case 2:
                buttonOneSlected.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttonone));
                buttonTwo.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttontwo));
                buttonThree.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttonthreeclick));
                buttonFour.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttonfour));
                break;
            case 3:
                buttonOneSlected.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttonone));
                buttonTwo.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttontwo));
                buttonThree.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttonthree));
                buttonFour.setBackgroundDrawable(getResources().getDrawable(R.drawable.buttonfourclick));
                break;
        }
    }
}