package com.example.klaudia.przewodnik;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

/**
 * Created by klaudia on 17.05.15.
 */
public class TrasaDetails extends Activity {

    int pozycja;
    TextView text,text1;
    LinearLayout real;
    Button guzik,guzik1,guzik2,guzik3,guzik4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trasy);
        real= (LinearLayout) findViewById(R.id.real);
        text = (TextView) findViewById(R.id.text);
        text1= (TextView) findViewById(R.id.text1);
        guzik = new Button(this);
        guzik1 = new Button(this);
        guzik2 = new Button(this);
        guzik3 = new Button(this);
        guzik4 = new Button(this);
        Intent i=getIntent();
        pozycja=i.getIntExtra("pozycja",0);
        Log.d("Powiekszenie", "onAcivity" + pozycja);
        show(pozycja);
    }

    public void show(int pozycja) {
        switch (pozycja) {
            case 0: text.setText(getResources().getText(R.string.trasa1));
                    text1.setText(getResources().getText(R.string.trasaa1));
                guzik.setTextSize(20);guzik1.setTextSize(20);guzik2.setTextSize(20);guzik3.setTextSize(20);guzik4.setTextSize(20);
                    guzik.setText("Panorama Racławicka");
                    guzik1.setText("Bazylika św.Elżbiety");
                    guzik2.setText("Pałac Królewski");
                    guzik3.setText("Opera");
                    guzik4.setText("Teatr Capitol");

                    real.addView(guzik);
                    real.addView(guzik1);
                    real.addView(guzik2);
                    real.addView(guzik3);
                    real.addView(guzik4);

                guzik.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TrasaDetails.this,DetailsActivity.class);

                        //Create intent
                        intent.putExtra("title", "Panorama Racławicka");
                        //intent.putExtra("image", item.getImage());
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image4);
                        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        byte[] bytes = stream.toByteArray();
                        intent.putExtra("image", bytes);
                        startActivity(intent);

                    }
                });
                guzik1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TrasaDetails.this,DetailsActivity.class);

                        //Create intent
                        intent.putExtra("title", "Bazylika Św.Elżbiety");
                        //intent.putExtra("image", item.getImage());
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image17);
                        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        byte[] bytes = stream.toByteArray();
                        intent.putExtra("image", bytes);
                        startActivity(intent);

                    }
                });
                guzik2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TrasaDetails.this,DetailsActivity.class);

                        //Create intent
                        intent.putExtra("title", "\n Pałac Królewski");
                        //intent.putExtra("image", item.getImage());
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image18);
                        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        byte[] bytes = stream.toByteArray();
                        intent.putExtra("image", bytes);
                        startActivity(intent);

                    }
                });
                guzik3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TrasaDetails.this,DetailsActivity.class);

                        //Create intent
                        intent.putExtra("title", "\n Opera");
                        //intent.putExtra("image", item.getImage());
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image11);
                        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        byte[] bytes = stream.toByteArray();
                        intent.putExtra("image", bytes);
                        startActivity(intent);

                    }
                });
                guzik4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TrasaDetails.this,DetailsActivity.class);

                        //Create intent
                        intent.putExtra("title", "\n Teatr Capitol");
                        //intent.putExtra("image", item.getImage());
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image16);
                        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        byte[] bytes = stream.toByteArray();
                        intent.putExtra("image", bytes);
                        startActivity(intent);

                    }
                });

                break;
            case 1: text.setText(getResources().getText(R.string.trasa2));
                    text1.setText(getResources().getText(R.string.trasaa2));
                guzik.setTextSize(20);guzik1.setTextSize(20);guzik2.setTextSize(20);guzik3.setTextSize(20);
                guzik.setText("Ogród zoologiczny i Afrykarium");
                guzik1.setText("Hala Stulecia");
                guzik2.setText("Pergola i fontanna multimedialna");
                guzik3.setText("Ogród japoński");

                real.addView(guzik);
                real.addView(guzik1);
                real.addView(guzik2);
                real.addView(guzik3);


                guzik.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TrasaDetails.this,DetailsActivity.class);

                        //Create intent
                        intent.putExtra("title", "Ogród zoologiczny i Afrykarium");
                        //intent.putExtra("image", item.getImage());
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image6);
                        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        byte[] bytes = stream.toByteArray();
                        intent.putExtra("image", bytes);
                        startActivity(intent);

                    }
                });
                guzik1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TrasaDetails.this,DetailsActivity.class);

                        //Create intent
                        intent.putExtra("title", "\n Hala Stulecia");
                        //intent.putExtra("image", item.getImage());
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image5);
                        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        byte[] bytes = stream.toByteArray();
                        intent.putExtra("image", bytes);
                        startActivity(intent);

                    }
                });
                guzik2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TrasaDetails.this,DetailsActivity.class);

                        //Create intent
                        intent.putExtra("title", "Pergola i fontanna multimedialna");
                        //intent.putExtra("image", item.getImage());
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image9);
                        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        byte[] bytes = stream.toByteArray();
                        intent.putExtra("image", bytes);
                        startActivity(intent);

                    }
                });
                guzik3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TrasaDetails.this,DetailsActivity.class);

                        //Create intent
                        intent.putExtra("title", "\n Ogród japoński");
                        //intent.putExtra("image", item.getImage());
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image7);
                        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        byte[] bytes = stream.toByteArray();
                        intent.putExtra("image", bytes);
                        startActivity(intent);

                    }
                });
                break;
            case 2: text.setText(getResources().getText(R.string.trasa3));
                    text1.setText(getResources().getText(R.string.trasaa3));
                guzik.setTextSize(20);guzik1.setTextSize(20);guzik2.setTextSize(20);
                guzik.setText("Rynek");
                guzik1.setText("Ostrów Tumski");
                guzik2.setText("Ogród botaniczny");

                real.addView(guzik);
                real.addView(guzik1);
                real.addView(guzik2);


                guzik.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TrasaDetails.this,DetailsActivity.class);

                        //Create intent
                        intent.putExtra("title", "Rynek");
                        //intent.putExtra("image", item.getImage());
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image1);
                        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        byte[] bytes = stream.toByteArray();
                        intent.putExtra("image", bytes);
                        startActivity(intent);

                    }
                });
                guzik1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TrasaDetails.this,DetailsActivity.class);

                        //Create intent
                        intent.putExtra("title", "Ostrów Tumski");
                        //intent.putExtra("image", item.getImage());
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image3);
                        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        byte[] bytes = stream.toByteArray();
                        intent.putExtra("image", bytes);
                        startActivity(intent);

                    }
                });
                guzik2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TrasaDetails.this,DetailsActivity.class);

                        //Create intent
                        intent.putExtra("title", "\n Ogród botaniczny");
                        //intent.putExtra("image", item.getImage());
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.image8);
                        bm.compress(Bitmap.CompressFormat.PNG, 100, stream);
                        byte[] bytes = stream.toByteArray();
                        intent.putExtra("image", bytes);
                        startActivity(intent);

                    }
                });
                break;

        }
    }
}
