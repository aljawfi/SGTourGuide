package com.example.melvin.sgtourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);

        //Create an adaptor that knows which fragment should be shown on each page
        CategoryAdaptor adaptor = new CategoryAdaptor(this,getSupportFragmentManager());

        //Set the adaptor onto the viewpager
        viewPager.setAdapter(adaptor);

        // Find the tab layout that shows the tabs
        TabLayout tablayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tablayout.setupWithViewPager(viewPager);

    }
}
