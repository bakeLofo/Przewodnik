package com.example.klaudia.przewodnik;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class TrasyActivity extends ListActivity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] values = new String[] { "Dla milosnikow sztuki","Dla aktywnych", "Dla zakochanych" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //String item = (String) getListAdapter().getItem(position);
        Log.d("MainAcivity", "onListItem" + position);
        Intent intent=new Intent(this,TrasaDetails.class);

        intent.putExtra("pozycja",position);
        startActivity(intent);


    }
}


