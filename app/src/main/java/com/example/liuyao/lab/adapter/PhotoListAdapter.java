package com.example.liuyao.lab.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.liuyao.lab.R;
import com.example.liuyao.lab.dao.PhotoItemCollectionDao;
import com.example.liuyao.lab.dao.PhotoItemDao;
import com.example.liuyao.lab.manager.PhotoListManager;
import com.example.liuyao.lab.view.PhotoListItem;

public class PhotoListAdapter extends BaseAdapter{
    PhotoItemCollectionDao dao;

    int lastPosition = -1;
    public void setDao(PhotoItemCollectionDao dao) {
        this.dao = dao;
    }

    @Override
    public int getCount() {
        if (dao == null)
            return 0;
        if (dao == null)
            return 0;
        return dao.getData().size();
    }

    @Override
    public Object getItem(int position) {
        return dao.getData().get(position);

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

                if (position>lastPosition) {
                    Animation animation = AnimationUtils.loadAnimation(viewGroup.getContext(),
                            R.anim.up_frome_buutton);
                    item.startAnimation(animation);
                    lastPosition = position;
                }
            }
            return item;
    }
}
