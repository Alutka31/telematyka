package com.example.alicja.dziennikdiety;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class BazaProduktowActivity extends AppCompatActivity {
    public String tekst = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baza_produktow);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        new Baza(this).execute(TYP.POBIERZ_BAZE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void wyswietl() {
        TextView tv = (TextView) findViewById(R.id.tv_baza_produktow);
        tv.setText(tekst);
    }

}
