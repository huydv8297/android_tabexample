package com.example.tabexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.tabexample.ui.main.HomeFragment;
import com.example.tabexample.ui.main.NotificationFragment;
import com.example.tabexample.ui.main.SectionsPagerAdapter;
import com.example.tabexample.ui.main.SettingFragment;
import com.example.tabexample.ui.main.TabFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = findViewById(R.id.view_pager);
        setupViewPager(viewPager);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void setupViewPager(ViewPager viewPager){
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new HomeFragment(), "Home");
        adapter.addFragment(new NotificationFragment(), "Notification");
        adapter.addFragment(new SettingFragment(), "Setting");

        viewPager.setAdapter(adapter);
    }
}