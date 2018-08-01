package com.example.liuyao.lab.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.liuyao.lab.view.PhotoListItem;

public class PhotoListAdapter extends BaseAdapter{
    @Override
    public int getCount() {
        return 10000;
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
    public View getView(int position, View view, ViewGroup viewGroup) {
        return new PhotoListItem(viewGroup.getContext());
    }
}
