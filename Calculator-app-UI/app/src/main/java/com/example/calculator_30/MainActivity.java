package com.example.calculator_30;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button switchButton;
    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //hide  the status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main); // Your layout file
        // Get the fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();
// Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
// Replace the contents of the container with the new fragment
        ft.replace(R.id.frameLayout, new MainFragment());
// or ft.add(R.id.your_placeholder, new FooFragment());
// Complete the changes added above
        ft.commit();
//     MainFragment main = new MainFragment();
//
//        // load main Fragment
//     loadFragment(main);


    }




//method to load first or second fragment
    public void loadFragment(Fragment fragment) {
//    // Begin the transaction
//    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//// Replace the contents of the container with the new fragment
//    ft.replace(R.id.frameLayout, fragment);
//// or ft.add(R.id.your_placeholder, new FooFragment());
//// Complete the changes added above
//    ft.commit();




    }};

        //evaluate expression

