package com.example.p.mrmrsmksaini;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.TimerTask;

public class Navigation_drawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //toolbar and back sign
        getSupportActionBar().setTitle("Marriage Ceremony of Mr & Mrs Mk");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // end

//---------------------navigation--------------------------
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //-------------end------------------------------------------------------------

//-----------------autoslider----------------------------------------------------------
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for (int i=0;i<dotscount;i++){
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            sliderDotspanel.addView(dots[i],params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for (int i=0;i<dotscount;i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),2000,4000);

    }

    public class MyTimerTask extends TimerTask {
        @Override
        public void run() {

            Navigation_drawer.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if(viewPager.getCurrentItem()==0){
                            viewPager.setCurrentItem(1);
                        }
                        else if (viewPager.getCurrentItem()==1){
                          viewPager.setCurrentItem(2);
                        }
                        else if (viewPager.getCurrentItem()==2){
                          viewPager.setCurrentItem(3);
                        }
                    else if (viewPager.getCurrentItem()==3){
                          viewPager.setCurrentItem(4);
                        }
                        else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });


        }
    }
    //----------------end-------------------------------------
///////-----------------navigation-------------------------
    @Override
    public void onBackPressed() {
        /////-----------exit dialog--------------------------------------------------
        final AlertDialog.Builder builder = new AlertDialog.Builder(Navigation_drawer.this);
        builder.setTitle("Really");
        builder.setMessage("Do you want to exit it ?");
        builder.setCancelable(true);
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        //----------end---------------------------------------------------------------


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intentsetting = new Intent(Navigation_drawer.this,Setting.class);
            startActivity(intentsetting);
            return true;
        }
        else if (id == R.id.action_feedback) {
            Intent intentsetting = new Intent(Navigation_drawer.this,Feedback.class);
            startActivity(intentsetting);
            return true;
        }
        if (id == R.id.action_help) {
            Intent intentsetting = new Intent(Navigation_drawer.this,Help.class);
            startActivity(intentsetting);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        android.app.FragmentManager fragmentManager = getFragmentManager();
        //FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content_frame);
        if (id == R.id.nav_home) {
            Intent intentsetting = new Intent(Navigation_drawer.this,Navigation_drawer.class);
            startActivity(intentsetting);
            return true;
        }
        else if (id == R.id.nav_relatives) {
            // Intent intentsetting = new Intent(Navigation_drawer.this,Relative.class);
            //startActivity(intentsetting);
            //return true;
            Intent intentsetting = new Intent(Navigation_drawer.this,Relativesp.class);
            startActivity(intentsetting);
            return true;
        }

        else if (id == R.id.nav_lagan) {
            Intent intentsetting = new Intent(Navigation_drawer.this,Lagan.class);
            startActivity(intentsetting);
            return true;

        } else if (id == R.id.nav_bhath) {
            Intent intentsetting = new Intent(Navigation_drawer.this,Bhath.class);
            startActivity(intentsetting);
            return true;
        }else if (id == R.id.nav_chak) {
            Intent intentsetting = new Intent(Navigation_drawer.this,Chak.class);
            startActivity(intentsetting);
            return true;
        }  else if (id == R.id.nav_barath) {
            Intent intentsetting = new Intent(Navigation_drawer.this,Barath.class);
            startActivity(intentsetting);
            return true;
        }else if (id == R.id.nav_vedhi) {
            Intent intentsetting = new Intent(Navigation_drawer.this,Vedhi.class);
            startActivity(intentsetting);
            return true;
        }  else if (id == R.id.nav_ghar_praves) {
            Intent intentsetting = new Intent(Navigation_drawer.this,Ghar_praves.class);
            startActivity(intentsetting);
            return true;
        }
        else if (id == R.id.nav_birthday) {
            Intent intentsetting = new Intent(Navigation_drawer.this,Birthday.class);
            startActivity(intentsetting);
            return true;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
