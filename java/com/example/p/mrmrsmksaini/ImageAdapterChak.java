package com.example.p.mrmrsmksaini;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterChak extends BaseAdapter{
    private Context context;

    public Integer[] images = {
            R.drawable.chak_1,  R.drawable.chak_2,
            R.drawable.chak_3,  R.drawable.chak_4,
            R.drawable.chak_5,  R.drawable.chak_6,
            R.drawable.chak_7,  R.drawable.chak_8,
            R.drawable.chak_9,  R.drawable.chak_10,
            R.drawable.chak_11,  R.drawable.chak_12,
            R.drawable.chak_13,  R.drawable.chak_14,
            R.drawable.chak_15,  R.drawable.chak_16,
            R.drawable.chak_17,  R.drawable.chak_18,
            R.drawable.chak_19

    };

    public ImageAdapterChak(Context c) {
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
