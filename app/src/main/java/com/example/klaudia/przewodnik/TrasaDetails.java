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
    TextView text,text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trasy);
        text = (TextView) findViewById(R.id.text);
        text1= (TextView) findViewById(R.id.text1);
        Intent i=getIntent();
        pozycja=i.getIntExtra("pozycja",0);
        Log.d("Powiekszenie", "onAcivity" + pozycja);
        show(pozycja);
    }

    public void show(int pozycja) {
        switch (pozycja) {
            case 0: text.setText(getResources().getText(R.string.trasa1));
                    text1.setText(getResources().getText(R.string.trasaa1));
                break;
            case 1: text.setText(getResources().getText(R.string.trasa2));
                    text1.setText(getResources().getText(R.string.trasaa2));
                break;
            case 2: text.setText(getResources().getText(R.string.trasa3));
                    text1.setText(getResources().getText(R.string.trasaa3));
                break;

        }
    }
}
