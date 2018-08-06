package com.example.liuyao.lab.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.liuyao.lab.dao.PhotoItemDao;
import com.example.liuyao.lab.manager.PhotoListManager;
import com.example.liuyao.lab.view.PhotoListItem;

public class PhotoListAdapter extends BaseAdapter{
    @Override
    public int getCount() {
        if (PhotoListManager.getInstance().getDao() == null)
            return 0;
        if (PhotoListManager.getInstance().getDao().getData() == null)
            return 0;
        return PhotoListManager.getInstance().getDao().getData().size();
    }

    @Override
    public Object getItem(int position) {
        return   PhotoListManager.getInstance().getDao().getData().get(position);

    }

    @Override
    public long getItemId(int i) {
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

            PhotoListItem item;
            if (convertView != null) {
                item = (PhotoListItem) convertView;
            } else {
                item = new PhotoListItem(viewGroup.getContext());

                PhotoItemDao dao = (PhotoItemDao) getItem(position);
                item.setNameText(dao.getCaption());
                item.setDescriptionText(dao.getUsername() + "\n" + dao.getCamera());
                item.setImageUrl(dao.getImageUrl());

            }
            return item;
    }
}
