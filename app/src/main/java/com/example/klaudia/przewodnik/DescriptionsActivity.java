package com.example.klaudia.przewodnik;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DescriptionsActivity extends Activity {

    private MySQLiteHelper SQLHelper; // = new MySQLiteHelper(DescriptionsActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descriptions);

        TextView text = (TextView)findViewById(R.id.textView2);
        final String title = getIntent().getStringExtra("title");
        text.setText(title);

        TextView opis = (TextView)findViewById(R.id.textView3);
        String description = "SELECT * FROM " + MySQLiteHelper.TABLE_DESCRIPTION +
                " WHERE " + MySQLiteHelper.TITLE + " = '" + title + "'";

        SQLHelper = new MySQLiteHelper(DescriptionsActivity.this);
        SQLiteDatabase sqlDB = SQLHelper.getReadableDatabase();

        Cursor cursor = sqlDB.rawQuery(description, null);

        cursor.moveToFirst();

        String c = cursor.getString(2);

        //sqlDB.execSQL(description);
        opis.setText(c);

    }




}
