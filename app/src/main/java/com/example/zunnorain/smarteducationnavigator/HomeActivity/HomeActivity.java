package com.example.zunnorain.smarteducationnavigator.HomeActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;

import com.example.zunnorain.smarteducationnavigator.R;
import com.example.zunnorain.smarteducationnavigator.SearchActivity.SearchActivity;

public class HomeActivity extends AppCompatActivity {

    private TextView textSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textSearch=(TextView)findViewById(R.id.textSearch);

        textSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(HomeActivity.this,SearchActivity.class);
                Pair[] pairs= new Pair[1];
                pairs[0]=new Pair(textSearch,"search");
                ActivityOptions activityOptions= ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this,pairs);

                getWindow().getSharedElementEnterTransition().setDuration(1000);
                startActivity(intent,activityOptions.toBundle());
            }
        });

    }
}
