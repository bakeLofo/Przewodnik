package com.example.klaudia.przewodnik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by klaudia on 17.05.15.
 */
public class TrasaDetails extends Activity {

    int pozycja;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trasy);
        text = (TextView) findViewById(R.id.text);
        Intent i=getIntent();
        pozycja=i.getIntExtra("pozycja",0);
        Log.d("Powiekszenie", "onAcivity" + pozycja);
        show(pozycja);
    }

    public void show(int pozycja) {
        switch (pozycja) {
            case 0: text.setText("0");
                break;
            case 1: text.setText("1");
                break;
            case 2: text.setText("2");
                break;

        }
    }
}
