package com.example.klaudia.przewodnik;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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

        final String title = getIntent().getStringExtra("title");
        Bitmap bitmap = getIntent().getParcelableExtra("image");
        byte[] bytes = getIntent().getByteArrayExtra("image");
        Bitmap bmp = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);

        TextView titleTextView = (TextView) findViewById(R.id.title);
        titleTextView.setText(title);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageBitmap(bmp);
//        imageView.setImageResource(R.drawable.image_1);

        final Button opisyButton = (Button) findViewById(R.id.button3);
        opisyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivity.this, DescriptionsActivity.class);
                intent.putExtra("title", title);
                Log.d("details", "nazwa" + title);
                startActivity(intent);
            }
        });
//----------------------------------------------------
        final Button mapyButton = (Button) findViewById(R.id.button4);
        if (title.equals("Wrocławskie krasnale")) {
            mapyButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(DetailsActivity.this, KrasnaleActivity.class);
                    intent.putExtra("title", title);
                    startActivity(intent);
                }
            });
        }
        else
        {
            mapyButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(DetailsActivity.this, MapsActivity.class);
                    intent.putExtra("title", title);
                    startActivity(intent);
                }
            });
        }

        //---------------------------------------------

    }



}