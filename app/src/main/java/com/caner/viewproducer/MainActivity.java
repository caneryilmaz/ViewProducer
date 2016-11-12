package com.caner.viewproducer;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
    protected ArrayAdapter<String> mAadapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        final String[] mCarList = getResources().getStringArray(R.array.car_list);
        mAadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mCarList);
        mList.setAdapter(mAadapter);

        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                toaster(mCarList[i]);

            }
        });

    }

    @Override
    public int setLayout() {
        return R.layout.activity_main;
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
                toaster("item_accessibility");
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
