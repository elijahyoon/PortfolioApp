package com.elijahyoon.portfolioapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openApp(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        switch (view.getId()) {
            case R.id.spotifyButton:
                Toast.makeText(context, "Movies app coming soon!", duration).show();
                break;
            case R.id.scoresButton:
                Toast.makeText(context, "Scores app coming soon!", duration).show();
                break;
            case R.id.libraryButton:
                Toast.makeText(context, "Library app coming soon!", duration).show();
                break;
            case R.id.buildButton:
                Toast.makeText(context, "Build It Bigger app coming soon!", duration).show();
                break;
            case R.id.xyzButton:
                Toast.makeText(context, "XYZ app coming soon!", duration).show();
                break;
            case R.id.capstoneButton:
                Toast.makeText(context, "Capstone app coming soon!", duration).show();
                break;
        }
    }
}
