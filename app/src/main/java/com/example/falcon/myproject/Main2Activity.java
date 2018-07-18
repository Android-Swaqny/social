package com.example.falcon.myproject;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddReviewFragment addReviewFragment = new AddReviewFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,addReviewFragment).addToBackStack(null).commit();
            }
        });

        AHBottomNavigation bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);

        AHBottomNavigationItem home = new AHBottomNavigationItem("home", R.drawable.ic_home);
        AHBottomNavigationItem profile = new AHBottomNavigationItem("profile", R.drawable.ic_profile);
        AHBottomNavigationItem search = new AHBottomNavigationItem("search", R.drawable.ic_search);
        AHBottomNavigationItem notifications = new AHBottomNavigationItem("notifications", R.drawable.ic_notification);

        bottomNavigation.addItem(home);
        bottomNavigation.addItem(profile);
        bottomNavigation.addItem(search);
        bottomNavigation.addItem(notifications);

        bottomNavigation.setDefaultBackgroundColor(getResources().getColor(R.color.colorPrimary));
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_HIDE);
        bottomNavigation.setAccentColor(getResources().getColor(R.color.white));
        bottomNavigation.setInactiveColor(getResources().getColor(R.color.white));
        AHNotification notification = new AHNotification.Builder()
                .setText("99")
                .setBackgroundColor(getResources().getColor(R.color.material_red))
                .setTextColor(getResources().getColor(R.color.white))
                .build();
        bottomNavigation.setNotification(notification, 3);

        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                Fragment fragment = null;

                switch (position){
                    case 0: // home
                        break;
                    case 1: // profile
                        fragment = new ProfileFragment();
                        break;
                    case 2: // search
                        fragment = new SearchFragment();
                        break;
                    case 3: // notifications
                        fragment = new NotificationFragment();
                        break;
                }
                if(fragment != null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit();
                }
                return true;
            }
        });

    }
}
