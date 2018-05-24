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
    private int PlaceName;

    /**
     * The address of the place we can visit
     */
    private int PlaceAddress;

    /**
     * The description of the place we can visit
     */
    private int PlaceDescription;


    /**
     * Create a new PlaceOfInterest object.
     *
     * @param placeName is the name of the place
     * @param placeAddress   is the address of the place
     */
    public PlaceOfInterest(int placeName, int placeAddress,int placeDescription) {
        PlaceName = placeName;
        PlaceAddress = placeAddress;
        PlaceDescription = placeDescription;

    }

    /**
     * Create a new PlaceOfInterest object.
     *
     * @param placeName is the name of the place
     * @param placeAddress   is the address of the place
     * @param imageResourceID    is an image associated to the place
     */
    public PlaceOfInterest(int imageResourceID, int placeName, int placeAddress, int placeDescription) {

        ImageResourceID = imageResourceID;
        PlaceName = placeName;
        PlaceAddress = placeAddress;
        PlaceDescription = placeDescription;
    }


    /**
     * Get the name of the place
     *
     */
    public int getPlaceName() {
        return PlaceName;
    }

    /**
     * Get the address of the place.
     */
    public int getPlaceAddress() {
        return PlaceAddress;
    }


    /**
     * Get the description of the place.
     */
    public int getPlaceDescription() {
        return PlaceDescription;
    }

    /**
     * Get the image of the place.
     */
    public int getImageResourcesId() {
        return ImageResourceID;
    }

    public boolean hasImage() {
        return ImageResourceID != NO_IMAGE_PROVIDED;
    }

}

