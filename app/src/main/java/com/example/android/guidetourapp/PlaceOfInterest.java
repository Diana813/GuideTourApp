package com.example.android.guidetourapp;

import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by diana on 22.05.2018.
 */

public class PlaceOfInterest extends ArrayList<Parcelable> {
    private int ImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Name of the place we can visit
     */
    private String PlaceName;

    /**
     * The address of the place we can visit
     */
    private String PlaceAddress;


    /**
     * Create a new PlaceOfInterest object.
     *
     * @param placeName is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param placeAddress   is the word in the Miwok language
     */
    public PlaceOfInterest(String placeName, String placeAddress) {
        PlaceName = placeName;
        PlaceAddress = placeAddress;
    }

    /**
     * Create a new PlaceOfInterest object.
     *
     * @param placeName is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param placeAddress   is the word in the Miwok language
     * @param imageResourceID    is an image associated to the word
     */
    public PlaceOfInterest(int imageResourceID, String placeName, String placeAddress) {

        ImageResourceID = imageResourceID;
        PlaceName = placeName;
        PlaceAddress = placeAddress;
    }

    public PlaceOfInterest(Parcelable[] position) {
    }

    /**
     * Get the name of the place
     */
    public String getPlaceName() {
        return PlaceName;
    }

    /**
     * Get the address of the place.
     */
    public String getPlaceAddress() {
        return PlaceAddress;
    }


    /**
     * Get the image of the word.
     */
    public int getImageResourcesId() {
        return ImageResourceID;
    }

    public boolean hasImage() {
        return ImageResourceID != NO_IMAGE_PROVIDED;
    }

}

