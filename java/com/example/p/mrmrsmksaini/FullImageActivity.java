package com.example.p.mrmrsmksaini;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class FullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        Intent i =getIntent();

        int position = i.getExtras().getInt("id");
        ImageAdapter adapter = new ImageAdapter((this));
       // ImageAdapterBarath adapter1 = new ImageAdapterBarath((this));
       // ImageAdapterBhath adapte2 = new ImageAdapterBhath((this));
        //ImageAdapterBirthday adapter3 = new ImageAdapterBirthday((this));
        //ImageAdapterChak adapter4 = new ImageAdapterChak((this));
        //ImageAdapterGhar adapter5 = new ImageAdapterGhar((this));
       //ImageAdapterVedhi adapter6 = new ImageAdapterVedhi((this));

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(adapter.images[position]);


    }



}
