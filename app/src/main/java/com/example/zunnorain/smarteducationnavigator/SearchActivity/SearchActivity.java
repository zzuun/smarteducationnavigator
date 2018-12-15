package com.example.zunnorain.smarteducationnavigator.SearchActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.zunnorain.smarteducationnavigator.R;

public class SearchActivity extends AppCompatActivity {


    private LinearLayout nearbyButton;
    private SearchView searchField;
    private RecyclerView searchlist, recentlist;
    private RelativeLayout searchlistLayout , recentsectionlayout;
    private TextView clearrecentButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getItemsInitialized();

    }

    private void getItemsInitialized() {

        clearrecentButton= (TextView)findViewById(R.id.clearRecentSearch);
        searchlistLayout =(RelativeLayout)findViewById(R.id.searchrecyclerViewLayout);
        recentsectionlayout=(RelativeLayout)findViewById(R.id.searchScreenrecentlayout);
        nearbyButton=(LinearLayout)findViewById(R.id.searchnearbyinstitutes);
        searchlist=(RecyclerView)findViewById(R.id.searchrecyclerView);
        recentlist=(RecyclerView)findViewById(R.id.recentSearchListActivity);
        searchField=(SearchView)findViewById(R.id.searchbarSearchScreen);
    }

}
