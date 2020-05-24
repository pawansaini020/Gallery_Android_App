package com.example.p.mrmrsmksaini;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterBhath extends BaseAdapter{
    private Context context;

    public Integer[] images = {
            R.drawable.bhath_1,  R.drawable.bhath_2,
            R.drawable.bhath_3,  R.drawable.bhath_4,
            R.drawable.bhath_5,  R.drawable.bhath_6,
            R.drawable.bhath_7,  R.drawable.bhath_8,
            R.drawable.bhath_9,  R.drawable.bhath_10,
            R.drawable.bhath_11,  R.drawable.bhath_12,
            R.drawable.bhath_13,  R.drawable.bhath_14,
            R.drawable.bhath_15,  R.drawable.bhath_16,
            R.drawable.bhath_17,  R.drawable.bhath_18,
            R.drawable.bhath_19,  R.drawable.bhath_20,
            R.drawable.bhath_21,  R.drawable.bhath_22,
            R.drawable.bhath_23,  R.drawable.bhath_24,
            R.drawable.bhath_25,  R.drawable.bhath_26,
            R.drawable.bhath_27,  R.drawable.bhath_28,
            R.drawable.bhath_29,  R.drawable.bhath_30,
            R.drawable.bhath_31
    };

    public ImageAdapterBhath(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(520,420));
        return imageView;
    }
}
