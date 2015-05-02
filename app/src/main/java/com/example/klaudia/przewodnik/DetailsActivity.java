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

public class DetailsActivity extends Activity implements OnRatingBarChangeListener {

    RatingBar rb1;
    SharedPreferences wmbPreference1;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

       // rb1 = (RatingBar)findViewById(R.id.ratingBar1);

        //((RatingBar) findViewById(R.id.ratingBar1))
       //         .setOnRatingBarChangeListener(this);
        wmbPreference1 = PreferenceManager.getDefaultSharedPreferences(this);
        float rating = wmbPreference1.getFloat(getIntent().getStringExtra("title"), 0f);
//        rb1.setRating(rating);

      //  Intent intent = new Intent(DetailsActivity.this, MainActivity.class);
        //intent.putExtra("rating", rating);
       // DetailsActivity.this.setResult((int)rating, intent);

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

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor = wmbPreference1.edit();
        editor.putFloat(getIntent().getStringExtra("title"), rating);
        editor.commit();
        //int ratings = wmbPreference1.getInt("numStars", 0);
    }


}