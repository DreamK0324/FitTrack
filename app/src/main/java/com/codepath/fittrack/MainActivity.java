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

//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                Fragment fragment;
//                switch (item.getItemId()) {
//                    case R.id.action_home:
////                        Toast.makeText(MainActivity.this, "Home!!!", Toast.LENGTH_SHORT).show();
//                        fragment = new PostsFragment();
//                        break;
//                    case R.id.action_compose:
////                        Toast.makeText(MainActivity.this, "Compose!!!", Toast.LENGTH_SHORT).show();
//                        fragment = new ComposeFragment();
//                        break;
//                    case R.id.action_profile:
//                    default:
////                        Toast.makeText(MainActivity.this, "Profile!!!", Toast.LENGTH_SHORT).show();
//                        fragment = new ProfileFragment();
//                        break;
//                }
//                fragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit();
//                return true;
//            }
//        });
//        // Set default selection
//        bottomNavigationView.setSelectedItemId(R.id.action_home);


    }

}