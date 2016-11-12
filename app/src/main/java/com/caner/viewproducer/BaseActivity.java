package com.caner.viewproducer;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

/**
 * Created by Caner on 11.11.2016.
 */

public abstract class BaseActivity extends AppCompatActivity {
    public  ListView mList;
    private Toolbar mToolbar;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());

        mList = (ListView) findViewById(R.id.listview_cars);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
    }

    @LayoutRes
    public int setLayout() {
        return 0;
    }


}
