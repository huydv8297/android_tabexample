package com.example.tabexample.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.example.tabexample.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class TabFragment extends Fragment {


    public static TabFragment newInstance(int tab_layout) {
        TabFragment f = new TabFragment();
        Bundle b = new Bundle();
        b.putInt("tab_layout", tab_layout);
        f.setArguments(b);
        return f;
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        int tab_layout = bundle.getInt("tab_layout");
        View root =  inflater.inflate(tab_layout, container, false);
        return root;
    }
}