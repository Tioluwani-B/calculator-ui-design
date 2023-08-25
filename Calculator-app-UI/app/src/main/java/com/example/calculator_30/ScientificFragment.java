package com.example.calculator_30;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ScientificFragment extends Fragment {
    private Button returnBtn;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_scientific, container, false);

        returnBtn = view.findViewById(R.id.returnBtn);

//method to switch between scientific calculator and basic calculator
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get the FragmentManager
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();

                // Create an instance of FragmentManagerHelper
                FragmentManagerHelper fragmentManagerHelper = new FragmentManagerHelper(fragmentManager);

                // Replace the current fragment with a new fragment
                fragmentManagerHelper.replaceFragment(new MainFragment());

            }
        });

        return view;



    }
}