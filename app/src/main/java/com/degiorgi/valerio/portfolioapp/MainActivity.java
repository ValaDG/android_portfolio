package com.degiorgi.valerio.portfolioapp;

import android.content.Context;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spotifyOpener(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Spotify app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM, 0, Gravity.BOTTOM);
        toast.show();

    }

    public void scoreOpener(View view)

    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Scores app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM, 0, Gravity.BOTTOM);
        toast.show();


    }

    public void libraryOpener(View view)

    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Library app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM, 0, Gravity.BOTTOM);
        toast.show();


    }

    public void buildItBiggerOpener(View view)

    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my BUILD IT BIGGER app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM, 0, Gravity.BOTTOM);
        toast.show();


    }

    public void XYZOpener(View view)

    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my XYZ Reader app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM, 0, Gravity.BOTTOM);
        toast.show();


    }

    public void capstoneOpener(View view)

    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my capstone own app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM, 0, Gravity.BOTTOM);
        toast.show();


    }

}
