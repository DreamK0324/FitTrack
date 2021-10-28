package com.codepath.fittrack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        BottomNavigationItemView bottomNavigationView = findViewById(R.id.bottom_navigation);
//
//
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                Fragment fragment;
//                switch (item.getItemId()) {
//                    case R.id.nav_meal:
//                        fragment = new MealFragment();
//                        break;
//                    case R.id.nav_feed:
//                        fragment = new FeedFragment();
//                        break;
//                    case R.id.nav_user:
//                        fragment = new UserFragment();
//                        break;
//                    default:
//                        fragment = new HomeFragment();
//                        break;
//                }
//                fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
//                return true;
//            }
//        });
//        // Set default selection
//        bottomNavigationView.setSelectedItemId(R.id.nav_home);


    }

}