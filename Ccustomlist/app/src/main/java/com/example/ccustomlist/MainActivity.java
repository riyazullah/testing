package com.example.ccustomlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lv;
    String[] names = {"flower1", "flower2", "flower3", "flower4", "flower5", "flower6"};
    int[] flags = {R.mipmap.flower1, R.mipmap.flower2, R.mipmap.flower3, R.mipmap.flower4, R.mipmap.flower5, R.mipmap.flower6};
    String[] names1 = {"beautiful", "beautiful", "beautiful", "beautiful", "beautiful", "beautiful"};
    MyListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        lv.setOnItemClickListener(this);
        adapter = new MyListAdapter(MainActivity.this, flags, names, names1);
        lv.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(MainActivity.this,"U Clicked  :"+ names[position],Toast.LENGTH_LONG).show();
    }
}
