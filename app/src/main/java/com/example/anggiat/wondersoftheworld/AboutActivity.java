package com.example.anggiat.wondersoftheworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Objects;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar_about);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("About Me");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
