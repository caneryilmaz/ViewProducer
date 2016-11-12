package com.caner.viewproducer.utils;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.caner.viewproducer.R;

/**
 * Created by Caner on 11.11.2016.
 */

public abstract class BaseActivity extends AppCompatActivity {
    public ListView mList;
    public Toolbar mToolbar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());

        mList = (ListView) findViewById(R.id.listview_cars);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        final String[] mCarList = getResources().getStringArray(R.array.car_list);
        ArrayAdapter<String> mAadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mCarList);
        mList.setAdapter(mAadapter);
    }

    @LayoutRes
    public int setLayout() {
        return 0;
    }


}
