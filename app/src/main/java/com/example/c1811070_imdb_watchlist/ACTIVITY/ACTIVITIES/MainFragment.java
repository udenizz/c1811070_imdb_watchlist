package com.example.c1811070_imdb_watchlist.ACTIVITY.ACTIVITIES;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import java.io.*;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c1811070_imdb_watchlist.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}