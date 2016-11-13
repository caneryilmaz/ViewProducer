package com.caner.viewproducer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.caner.viewproducer.R;
import com.caner.viewproducer.utils.BaseActivity;

public class ActivityMain extends BaseActivity {
    private Toolbar mToolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mList = (ListView) findViewById(R.id.listview_cars);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        mToolbar.setTitleTextColor(ContextCompat.getColor(this,android.R.color.white));

    }

    @Override
    protected void onResume() {
        super.onResume();
        mToolbar.setTitle("Rent a Car");
    }

    @Override
    public int setLayout() {
        return R.layout.layout_activity_main;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item_accessibility:
                startActivity(new Intent(this, ActivityHome.class));
                return true;
            case R.id.item_child:
                toaster("item_child");
                return true;
            case R.id.item_balance:
                toaster("item_balance");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


    private void toaster(String item) {
        Toast.makeText(this, item, Toast.LENGTH_SHORT).show();
    }

}
