package com.example.klaudia.przewodnik;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMapLoadedCallback {


    private GoogleMap googleMap;
    Marker marker;
    ArrayList<String> indeks;
    ArrayList<LatLng> tab;
//    final String title = getIntent().getStringExtra("title");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
       // lista = new ArrayList<>();


        File myfile = new File("res/raw/dane.txt");
        Scanner odczyt = null;
        odczyt = new Scanner(getResources().openRawResource(R.raw.dane));
        //String s = odczyt.nextLine();
        indeks = new ArrayList<>();
        tab = new ArrayList<>();
        String s, n;
        int i = 0;
        while (odczyt.hasNext())
        {
            if (i == 0)
            {
                s = odczyt.nextLine();
                if (s.equals(""))
                {
                    n = odczyt.nextLine();
                    indeks.add("\n " + n);
                    i++;
                }
                else
                {
                    indeks.add(s);
                    i++;
                }

            }
            else
            {
                i--;
                double l1 = Double.parseDouble(odczyt.nextLine());
                double l2 = Double.parseDouble(odczyt.nextLine());
                tab.add(new LatLng(l1, l2));
            }

        }
        Log.d("rozmiar", String.valueOf(indeks.size()));
        MapFragment map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map));
        map.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        googleMap.setOnMapLoadedCallback(this);
    }

    @Override
    public void onMapLoaded() {
        String title = getIntent().getStringExtra("title");
        Log.d("title", title);
        int i = 0;
        while(i < indeks.size())
        {
            Log.d("nazwa", indeks.get(i));
            if(indeks.get(i).equals(title))
            {
                Log.d("nazwa2", indeks.get(i));
                googleMap.addMarker(new MarkerOptions().position(tab.get(i)).title(indeks.get(i)));
                CameraPosition cameraPosition = new CameraPosition.Builder().target(tab.get(i)).zoom(16).build();
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                break;
            }
            i++;
        }

    }

}
