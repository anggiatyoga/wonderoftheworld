package com.example.anggiat.wondersoftheworld;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_DATA = "extra_data";
    private ImageView imageObjectLocation;
    private ImageView imageObjectCountry;
    private ImageView imageObjectBanner;
    private RatingBar imageObjectRating;
    private TextView textObjectCountry;
    private TextView textObjectDetail;
    private TextView textObjectRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageObjectBanner = findViewById(R.id.image_object_banner);
        imageObjectRating = findViewById(R.id.image_object_rate);
        imageObjectCountry = findViewById(R.id.image_object_country);
        imageObjectLocation = findViewById(R.id.image_object_location);
        textObjectCountry = findViewById(R.id.text_object_country);
        textObjectDetail = findViewById(R.id.text_object_detail);
        textObjectRate = findViewById(R.id.text_object_rate);

        Object object = getIntent().getParcelableExtra(EXTRA_DATA);

        initView(object);

        setImageCountryFlag(object);

        showCollapsingToolbar(object);

        showLocationOnGmaps(object);

        setRatingBar(object);

    }

    private void initView(Object object) {
        Glide.with(DetailActivity.this)
                .load(object.getPhoto())
                .into(imageObjectBanner);

        textObjectCountry.setText(object.getCountry());
        textObjectDetail.setText(object.getDetail());
        textObjectRate.setText(object.getRate());

    }

    private void setImageCountryFlag(Object object) {
        String country = object.getCountry();

        int srcImageCountry = 0;

        switch (country) {
            case "Cina":
                srcImageCountry = R.drawable.china_flag;
                break;
            case "Mesir":
                srcImageCountry = R.drawable.egypt_flag;
                break;
            case "Itali":
                srcImageCountry = R.drawable.italy_flag;
                break;
            case "Yordania":
                srcImageCountry = R.drawable.jordan_flag;
                break;
            case "Peru":
                srcImageCountry = R.drawable.peru_flag;
                break;
            case "India":
                srcImageCountry = R.drawable.india_flag;
                break;
            case "Meksiko":
                srcImageCountry = R.drawable.mexico_flag;
                break;
            case "Brazil":
                srcImageCountry = R.drawable.brazil_flag;
                break;
            case "Paris":
                srcImageCountry = R.drawable.france_flag;
                break;
            case "Amerika":
                srcImageCountry = R.drawable.united_states;
                break;
        }

        Glide.with(DetailActivity.this)
                .load(srcImageCountry)
                .into(imageObjectCountry);

    }

    private void showCollapsingToolbar(Object object){

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar_detail);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle(object.getName());
        collapsingToolbarLayout.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_START);

        collapsingToolbarLayout.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.cardview_light_background));
        collapsingToolbarLayout.setExpandedTitleColor(ContextCompat.getColor(this, R.color.cardview_light_background));
    }

    private void showLocationOnGmaps(Object object) {
        final String coordinateLocation = object.getCoordinate();
        imageObjectLocation.setClickable(true);
        imageObjectLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:latitude,longitude?q="+coordinateLocation);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(DetailActivity.this, "Lokasi belum tersedia", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void setRatingBar(Object object) {
        float rateFloat = Float.valueOf(object.getRate());
        imageObjectRating.setRating(rateFloat);
    }

}
