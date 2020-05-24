package com.example.p.mrmrsmksaini;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Main_flase_activity extends AppCompatActivity {
        private static int SPLASH_TIME_OUT = 3000;

        ActionBar actionBar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN  );
            setContentView(R.layout.activity_main_flase_activity);

            //flase in full screen
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent homeIntent = new Intent(com.example.p.mrmrsmksaini.Main_flase_activity.this,Navigation_drawer.class);
                    startActivity(homeIntent);
                    finish();
                }
            },SPLASH_TIME_OUT);

            // end

            // change colour and name of action bar
            getSupportActionBar().setTitle(" ");
            actionBar=getSupportActionBar();
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));

            // end
        }
    }
