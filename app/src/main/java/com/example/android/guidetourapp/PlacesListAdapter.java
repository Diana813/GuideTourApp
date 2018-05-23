package com.example.android.guidetourapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by diana on 22.05.2018.
 */

public class PlacesListAdapter extends ArrayAdapter<PlaceOfInterest> {

    private int ColorResourceId;

    /**
     *
     * @param PlacesListAdapter The current context. Used to inflate the layout file.
     * @param places       A List of AndroidFlavor objects to display in a list
     */
    public PlacesListAdapter(Activity PlacesListAdapter, ArrayList<PlaceOfInterest> places, int colorResourceId) {

        // Initializing the ArrayAdapter's internal storage for the context and the list.
        super(PlacesListAdapter, 0, places);
        ColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        PlaceOfInterest currentWord = getItem(position);

        // Find the TextView in the item.xml layout with the ID version_name
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        placeTextView.setText(currentWord.getPlaceName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        addressTextView.setText(currentWord.getPlaceAddress());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

        ImageView imageImageView = (ImageView) listItemView.findViewById(R.id.picture);
        imageImageView.setImageResource(currentWord.getImageResourcesId());
        if (currentWord.hasImage()) {
            imageImageView.setImageResource(currentWord.getImageResourcesId());
            imageImageView.setVisibility(View.VISIBLE);
        } else {
            imageImageView.setVisibility(View.GONE);
        }
        // Set the theme color for the list item
        final View textContainer = listItemView.findViewById(R.id.item);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), ColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;

    }

}
