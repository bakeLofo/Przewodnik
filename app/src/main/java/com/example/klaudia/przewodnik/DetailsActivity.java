package com.example.klaudia.przewodnik;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;

public class DetailsActivity extends Activity{

    SharedPreferences wmbPreference1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        wmbPreference1 = PreferenceManager.getDefaultSharedPreferences(this);

        String title = getIntent().getStringExtra("title");
        //Bitmap bitmap = getIntent().getParcelableExtra("image");
        byte[] bytes = getIntent().getByteArrayExtra("image");
        Bitmap bmp = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);

        TextView titleTextView = (TextView) findViewById(R.id.title);
        titleTextView.setText(title);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageBitmap(bmp);
        //imageView.setImageResource(R.drawable.image_1);
    }



}