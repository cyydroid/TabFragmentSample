package com.tutorial.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment{
    
    
 @Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

     View view = inflater.inflate(R.layout.hello_earth, container, false);
   
        return view;
 
}
}
