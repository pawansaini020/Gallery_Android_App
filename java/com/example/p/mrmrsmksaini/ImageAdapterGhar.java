package com.example.p.mrmrsmksaini;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterGhar extends BaseAdapter{
    private Context context;

    public Integer[] images = {
           // R.drawable.ghar_1,  R.drawable.ghar_2,
            R.drawable.ghar_3,  R.drawable.ghar_4,
            R.drawable.ghar_5,  R.drawable.ghar_6,
            R.drawable.ghar_7,  R.drawable.ghar_8,
            R.drawable.ghar_9,  R.drawable.ghar_10,
            R.drawable.ghar_11,R.drawable.ghar_12,
            R.drawable.ghar_13,  R.drawable.ghar_14,
            R.drawable.ghar_15,  R.drawable.ghar_16,
            R.drawable.ghar_17,  R.drawable.ghar_18,
            R.drawable.ghar_19,  R.drawable.ghar_20,
            R.drawable.ghar_21,  R.drawable.ghar_22,
            R.drawable.ghar_23,  R.drawable.ghar_24,
            R.drawable.ghar_25,  R.drawable.ghar_26,
            R.drawable.ghar_27
    };

    public ImageAdapterGhar(Context c) {
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
