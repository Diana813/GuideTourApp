package com.example.android.guidetourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Intent descriptionIntent = getIntent();
        int intImage = descriptionIntent.getIntExtra("intImage", 0);
        String PlaceName = descriptionIntent.getStringExtra("name");
        String PlaceAddress = descriptionIntent.getStringExtra("address");

        displayImage(intImage);
        displayPlaceName(PlaceName);
        displayPlaceAddress(PlaceAddress);
    }

    public void displayImage(int image) {
        ImageView imageView = (ImageView) findViewById(R.id.placeImage);
        imageView.setImageResource(image);
    }
    public void displayPlaceName(String name) {
        TextView textView = (TextView) findViewById(R.id.placeName);
        textView.setText(name);
    }
    public void displayPlaceAddress(String name) {
        TextView textView = (TextView) findViewById(R.id.placeAddress);
        textView.setText(name);
    }
}

