package com.example.dell.android_s6a1_singlefragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by dell on 4/7/2017.
 */
public class FragmentClass extends Fragment {

    TextView editText;
    Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String editString = getArguments().getString("msg");
        View view = inflater.inflate(R.layout.fragment_layout, container,false);
        editText.setText(editString);
        return view;
    }


}
