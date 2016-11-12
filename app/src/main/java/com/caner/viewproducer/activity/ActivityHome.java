package com.caner.viewproducer.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.view.View;

import com.caner.viewproducer.R;
import com.caner.viewproducer.utils.BaseActivity;

/**
 * Created by Caner on 12.11.2016.
 */

public class ActivityHome extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public int setLayout() {
        return R.layout.layout_activity_home;
    }

    @Override
    protected void onResume() {
        super.onResume();
        mToolbar.setTitle("Rent a Harley");
    }

}
