package com.example.yasham.ysinstitute;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yasham on 9/21/2015.
 */
public class SupportFragment extends Fragment {

    public SupportFragment(){}
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_support, container, false);

        return rootView;
    }
}
