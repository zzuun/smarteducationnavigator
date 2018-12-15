package com.example.zunnorain.smarteducationnavigator.Fragments;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.zunnorain.smarteducationnavigator.R;
import com.example.zunnorain.smarteducationnavigator.SearchActivity.SearchActivity;

public class SearchFragmeent extends Fragment implements View.OnClickListener {

    private View view;
    private TextView searchbarText;
    private RelativeLayout mainLayout, recentLayoutFragment , mostlyLayout;
    private RecyclerView recentList, mostlyList;
    public SearchFragmeent() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return view=inflater.inflate(R.layout.fragment_search_fragmeent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        getItemsInitialized();
        searchbarText.setOnClickListener(this);
    }

    private void getItemsInitialized() {

        searchbarText= (TextView)view.findViewById(R.id.searchBarText);
        mainLayout =(RelativeLayout)view.findViewById(R.id.mainLayoutSearchFragment);
        recentLayoutFragment=(RelativeLayout)view.findViewById(R.id.recentLayoutFragment);
        mostlyLayout=(RelativeLayout)view.findViewById(R.id.mostlyLayoutFragment);
        recentList=(RecyclerView)view.findViewById(R.id.recentSearchListFragment);
        mostlyList=(RecyclerView)view.findViewById(R.id.mostlySearchListFragment);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id==R.id.searchBarText)
        {
            Intent intent = new Intent(getActivity(),SearchActivity.class);
            Pair pair= new Pair(searchbarText,"searchView");
            ActivityOptions activityOptions= ActivityOptions.makeSceneTransitionAnimation(getActivity(),pair);
            startActivity(intent,activityOptions.toBundle());
        }
    }


}
