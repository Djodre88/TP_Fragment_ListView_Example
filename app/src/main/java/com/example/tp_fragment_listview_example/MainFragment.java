package com.example.tp_fragment_listview_example;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {

    public MainFragment() {
        // Required empty public constructor
    }

    static String[] category = {"Fruits", "Légumes", "Boissons", "Quicaillerie"};
    static String[][] article = {
            {"Abricot", "Fraise", "Banane", "Pomme"},
            {"Haricot", "Carotte", "Brocolis", "Petits pois"},
            {"Eau", "Coca", "Oasis", "Café"},
            {"Vis", "Clou", "Rivet", "Cheville"}};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = contentView.findViewById(R.id.listview);

        listView.setAdapter(new ArrayAdapter<>(
                listView.getContext(),
                android.R.layout.simple_list_item_1,
                category));
        return contentView;
    }
}