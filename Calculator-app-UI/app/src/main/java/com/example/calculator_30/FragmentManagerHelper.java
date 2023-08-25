package com.example.calculator_30;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.calculator_30.R;

public class FragmentManagerHelper {
    private FragmentManager fragmentManager;

    public FragmentManagerHelper(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
