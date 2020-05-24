package com.example.p.mrmrsmksaini;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter{
    private Context context;

    public Integer[] images = {

            R.drawable.lagan_3,  R.drawable.lagan_4,
            R.drawable.lagan_5,  R.drawable.lagan_6,
            R.drawable.lagan_7,  R.drawable.lagan_8,
            R.drawable.lagan_9,  R.drawable.lagan_10,
            R.drawable.lagan_11, R.drawable.lagan_13,
            R.drawable.lagan_14, R.drawable.lagan_15,
            R.drawable.lagan_16, R.drawable.lagan_17,
            R.drawable.lagan_18,
            R.drawable.lagan_19,  R.drawable.lagan_20,
            R.drawable.lagan_21,  R.drawable.lagan_22,
            R.drawable.lagan_23,  R.drawable.lagan_24,
            R.drawable.lagan_25,  R.drawable.lagan_26,
            R.drawable.lagan_27
    };

    public ImageAdapter(Context c) {
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
