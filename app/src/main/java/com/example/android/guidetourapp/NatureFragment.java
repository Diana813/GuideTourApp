package com.example.android.guidetourapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create an array of places to visit
        final ArrayList<PlaceOfInterest> places = new ArrayList<PlaceOfInterest>();
        places.add(new PlaceOfInterest(R.drawable.czarny_staw, R.string.czarny_staw, R.string.TPN, R.string.czarny));
        places.add(new PlaceOfInterest(R.drawable.granaty, R.string.granaty, R.string.TPN, R.string.granat));
        places.add(new PlaceOfInterest(R.drawable.maly_koscielec, R.string.koscielec, R.string.TPN, R.string.kosciel));
        places.add(new PlaceOfInterest(R.drawable.chocholowska, R.string.chocholowska, R.string.TPN, R.string.chochol));
        places.add(new PlaceOfInterest(R.drawable.dolina_za_mnichem, R.string.za_mnichem, R.string.TPN, R.string.mnich));
        places.add(new PlaceOfInterest(R.drawable.rysy, R.string.rysy, R.string.TPN, R.string.rys));
        places.add(new PlaceOfInterest(R.drawable.trzydniowianski_wierch, R.string.trzydniowianski, R.string.TPN, R.string.trzyd));
        places.add(new PlaceOfInterest(R.drawable.dolina_pieciu_stawow, R.string.piec_stawow, R.string.TPN, R.string.piec));
        places.add(new PlaceOfInterest(R.drawable.czerwone_wierchy, R.string.czerwone, R.string.TPN, R.string.wierchy ));
        places.add(new PlaceOfInterest(R.drawable.morskie_oko, R.string.morskie, R.string.TPN, R.string.morskie_oko));

        PlacesListAdapter adapter = new PlacesListAdapter(getActivity(), places, R.color.category_nature);

        final ListView listView = (ListView) rootView.findViewById(R.id.list_item);

        listView.setAdapter(adapter);

        //This method will be executed when the item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent descriptionIntent = new Intent(getActivity(), DescriptionActivity.class);
                descriptionIntent.putExtra("placeName", places.get(position).getPlaceName());
                descriptionIntent.putExtra("placeAddress", places.get(position).getPlaceAddress());
                descriptionIntent.putExtra("image", places.get(position).getImageResourcesId());
                descriptionIntent.putExtra("placeDescription", places.get(position).getPlaceDescription());
                // Start the new activity
                startActivity(descriptionIntent);
            }
        });

        return rootView;
    }

}


