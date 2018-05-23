package com.example.android.guidetourapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.guidetourapp.databinding.BackgroundBinding;

public class BackgroundActivity extends AppCompatActivity {

    BackgroundBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.background);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager()) {
        };

        // Set the adapter onto the view pager
        binding.viewpager.setAdapter(adapter);

        // Connect the tab layout with the view pager.
        binding.tabs.setupWithViewPager(binding.viewpager);
    }
}
