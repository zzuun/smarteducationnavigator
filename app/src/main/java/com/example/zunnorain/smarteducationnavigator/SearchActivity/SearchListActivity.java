package com.example.zunnorain.smarteducationnavigator.SearchActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.example.zunnorain.smarteducationnavigator.R;

public class SearchListActivity extends AppCompatActivity {

    private ImageView filterButton, mapButton;
    private RecyclerView searchDetailList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_list);
        getItemsInitialized();
    }

    private void getItemsInitialized() {
        filterButton=(ImageView)findViewById(R.id.filterButton);
        mapButton=(ImageView)findViewById(R.id.mapButton);
        searchDetailList=(RecyclerView)findViewById(R.id.searchDetailList);
    }
}
