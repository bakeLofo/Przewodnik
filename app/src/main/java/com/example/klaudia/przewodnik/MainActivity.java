package com.example.klaudia.przewodnik;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.RatingBar;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MainActivity extends Activity {
    private GridView gridView;
    private GridViewAdapter GridAdapter;

    RatingBar rb1;
    SharedPreferences wmbPreference1;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        gridView = (GridView) findViewById(R.id.gridView);
        GridAdapter = new GridViewAdapter(this, R.layout.row_grid, getData());
        gridView.setAdapter(GridAdapter);

        /*gridView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ImageItem item = (ImageItem) parent.getItemAtPosition(position);
                //Create intent
                Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
                intent.putExtra("title", item.getTitle());
                //intent.putExtra("image", item.getImage());

                //Start details activity
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/

        gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Log.d("grid", "klik");
                long viewId = v.getId();

                ImageItem item = (ImageItem) parent.getItemAtPosition(position);
                //Create intent
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("title", item.getTitle());
                //intent.putExtra("image", item.getImage());
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                Bitmap bitmap = item.getImage();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] bytes = stream.toByteArray();
                intent.putExtra("image", bytes);

                //Start details activity
                startActivity(intent);

            }

        });

    }

    private ArrayList<ImageItem> getData() {
        final ArrayList<ImageItem> imageItems = new ArrayList<ImageItem>();
        // retrieve String drawable array
        Resources res = getResources();
        String[] miejsca = res.getStringArray(R.array.opisy);
        TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);
        for (int i = 0; i < imgs.length(); i++) {
            Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),
                    imgs.getResourceId(i, -1));
            imageItems.add(new ImageItem(bitmap, miejsca[i]));
        }

        return imageItems;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();  // Always call the superclass

        // Stop method tracing that the activity started during onCreate()
        android.os.Debug.stopMethodTracing();
    }

}