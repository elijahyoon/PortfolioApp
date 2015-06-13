package com.elijahyoon.portfolioapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openApp(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        switch (view.getId()) {
            case R.id.spotifyButton:
                Toast.makeText(context, "Spotify app coming soon!", duration).show();
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
