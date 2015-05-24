package com.example.klaudia.przewodnik;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class KrasnaleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krasnale);

        ImageView image = (ImageView)findViewById(R.id.image);
        image.setImageResource(R.drawable.mapka);
    }


}
