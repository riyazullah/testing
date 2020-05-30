package com.example.ccustomlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by INSPIRON on 04-06-2018.
 */

public class MyListAdapter extends BaseAdapter {
    Context context;
    String[] names;
    String[] names1;
    int[] flags;
    LayoutInflater inflater;

    public MyListAdapter(Context context, int[] flags,String[] names,String[] names1) {
        this.context=context;
        this.names=names;
        this.names1=names1;
        inflater = (LayoutInflater.from(context));

    }

    @Override
    public int getCount() {
        return flags.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custom_list, null, true);


        TextView tv1= (TextView)view.findViewById(R.id.tv1);
        ImageView iv = (ImageView)view.findViewById(R.id.iv);
        TextView tv2 = (TextView)view.findViewById(R.id.tv2);

        tv1.setText(names[i]);
        iv.setImageResource(flags[i]);
        tv2.setText(names1[i]);

        return view;
    }
}
