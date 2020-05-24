package com.example.p.mrmrsmksaini;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterVedhi extends BaseAdapter{
    private Context context;

    public Integer[] images = {
            R.drawable.vedi_1,  R.drawable.vedi_2,
            R.drawable.vedi_3,  R.drawable.vedi_4,
            R.drawable.vedi_5,  R.drawable.vedi_6,
            R.drawable.vedi_7,  R.drawable.vedi_8,
            R.drawable.vedi_9,  R.drawable.vedi_10,
            R.drawable.vedi_11,

    };

    public ImageAdapterVedhi(Context c) {
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
