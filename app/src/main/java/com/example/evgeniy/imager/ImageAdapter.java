package com.example.evgeniy.imager;

/**
 * Created by Evgeniy on 7/30/2016.
 */
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import 	android.view.LayoutInflater;
import 	android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;


public class ImageAdapter extends BaseAdapter {
    private final Integer[] mItems = {
            R.drawable.picture1, R.drawable.picture2, R.drawable.picture3,
            R.drawable.picture4, R.drawable.picture1, R.drawable.picture3};
    private final LayoutInflater mInflater;

    public ImageAdapter(Context context) {
        mInflater = LayoutInflater.from(context);


    }

    @Override
    public int getCount() {
        return MainActivity.list.size();
    }

    @Override
    public Object getItem(int i) {
        return MainActivity.list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        ImageView picture;
        //TextView name;

        if (v == null) {
            v = mInflater.inflate(R.layout.grid_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            //v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        picture = (ImageView) v.getTag(R.id.picture);
        //name = (TextView) v.getTag(R.id.text);


        picture.setImageURI(Uri.parse(getItem(i).toString()));
        //picture.setImageBitmap(MainActivity.img);
        //name.setText(item.name);

        return v;
    }

}