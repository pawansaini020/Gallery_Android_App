package com.example.p.mrmrsmksaini;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterBarath extends BaseAdapter{
    private Context context;

    public Integer[] images = {
            R.drawable.barath_1,  R.drawable.barath_2,
            R.drawable.barath_3,  R.drawable.barath_4,
            R.drawable.barath_5,  R.drawable.barath_6,
            R.drawable.barath_7,  R.drawable.barath_8,
            R.drawable.barath_9,  R.drawable.barath_10,
            R.drawable.barath_11,  R.drawable.barath_12,
            R.drawable.barath_3,  R.drawable.barath_14,
            R.drawable.barath_15,  R.drawable.barath_16,
            R.drawable.barath_17,  R.drawable.barath_18,
            R.drawable.barath_19,  R.drawable.barath_20,
            R.drawable.barath_21,  R.drawable.barath_22,
            R.drawable.barath_23,  R.drawable.barath_24,
            R.drawable.barath_25,  R.drawable.barath_26,
            R.drawable.barath_27,  R.drawable.barath_28,
            R.drawable.barath_29,  R.drawable.barath_30,
            R.drawable.barath_31,
            R.drawable.barath_32,
            R.drawable.barath_33,  R.drawable.barath_34,
            R.drawable.barath_35,  R.drawable.barath_36,
            R.drawable.barath_37,  R.drawable.barath_38,
            R.drawable.barath_39,  R.drawable.barath_40,
            R.drawable.barath_41,  R.drawable.barath_42,
            R.drawable.barath_43,  R.drawable.barath_44,
            R.drawable.barath_45,  R.drawable.barath_46,
            R.drawable.barath_47,  R.drawable.barath_48,
            R.drawable.barath_49,  R.drawable.barath_50,
            R.drawable.barath_51,
            R.drawable.barath_52,  R.drawable.barath_53,
            R.drawable.barath_54, R.drawable.barath_55,  R.drawable.barath_56,
            R.drawable.barath_57,  R.drawable.barath_58,
            R.drawable.barath_59,
            R.drawable.barath_60,  R.drawable.barath_61,
            R.drawable.barath_62
    };

    public ImageAdapterBarath(Context c) {
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
