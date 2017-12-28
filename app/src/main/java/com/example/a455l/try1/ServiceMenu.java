package com.example.a455l.try1;

/**
 * Created by A455L on 21/12/2017.
 */

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by SYAZLIN on 21/12/2017.
 */

public class ServiceMenu extends BaseAdapter {

    private Context mContext;

    public Integer [] mThumbIDs ={
            R.drawable.photostat, R.drawable.tshirt,
            R.drawable.banner , R.drawable.card,
            R.drawable.bunting, R.drawable.photobook
    };

    public ServiceMenu (Context c){
        mContext = c;
    }

    @Override
    public int getCount (){
        return mThumbIDs.length;
    }

    @Override
    public Object getItem (int position){
        return mThumbIDs[position];
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIDs[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(150,150));
        return imageView;
    }
}
