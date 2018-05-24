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
        int PlaceName = descriptionIntent.getExtras().getInt("placeName");
        int PlaceAddress = descriptionIntent.getExtras().getInt("placeAddress");
        int intImage = descriptionIntent.getExtras().getInt("image", 0);
        int PlaceDescription = descriptionIntent.getExtras().getInt("placeDescription");

        displayImage(intImage);
        displayPlaceName(PlaceName);
        displayPlaceAddress(PlaceAddress);
        displayPlaceDescription(PlaceDescription);
    }

    public void displayImage(int image) {
        ImageView imageView = (ImageView) findViewById(R.id.placeImage);
        imageView.setImageResource(image);
    }
    public void displayPlaceName(int name) {
        TextView textView = (TextView) findViewById(R.id.placeName);
        textView.setText(name);
    }
    public void displayPlaceAddress(int name) {
        TextView textView = (TextView) findViewById(R.id.placeAddress);
        textView.setText(name);
    }
    public void displayPlaceDescription(int description) {
        TextView textView = (TextView) findViewById(R.id.descripton);
        textView.setText(description);
    }
}

