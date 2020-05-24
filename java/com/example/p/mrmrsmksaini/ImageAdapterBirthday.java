package com.example.p.mrmrsmksaini;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterBirthday extends BaseAdapter{
    private Context context;

    public Integer[] images = {
            R.drawable.bday_1,  R.drawable.bday_2,
            R.drawable.bday_3,  R.drawable.bday_4,
            R.drawable.bday_5
    };

    public ImageAdapterBirthday(Context c) {
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
