package com.example.android.guidetourapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.guidetourapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Set a click listener
        binding.start.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "Start the tour" is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BackgroundActivity}
                Intent preferencesIntent = new Intent(MainActivity.this, BackgroundActivity.class);

                // Start the new activity
                startActivity(preferencesIntent);
            }
        });

    }


}

