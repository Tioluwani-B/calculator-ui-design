package com.example.calculator_30;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class MainFragment extends Fragment {
    private Button sciBtn;
    FragmentManager fragmentManager ;

public MainFragment(){

}
    // Constructor that takes the FragmentManager as a parameter
    public MainFragment(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        sciBtn = view.findViewById(R.id.sciBtn);


        sciBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get the FragmentManager
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();

                // Create an instance of FragmentManagerHelper
                FragmentManagerHelper fragmentManagerHelper = new FragmentManagerHelper(fragmentManager);

                // Replace the current fragment with a new fragment
                fragmentManagerHelper.replaceFragment(new ScientificFragment());
            }
        });

        return view;
    }
}





