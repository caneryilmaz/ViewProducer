package com.caner.viewproducer.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.caner.viewproducer.R;
import com.caner.viewproducer.utils.BaseActivity;

/**
 * Created by Caner on 12.11.2016.
 */

public class ActivityHome extends BaseActivity {
    private Toolbar mToolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindViews();

    }

    @Override
    public int setLayout() {
        return R.layout.layout_activity_home;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void bindViews() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
