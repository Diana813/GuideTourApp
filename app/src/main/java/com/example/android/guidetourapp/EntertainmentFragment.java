package com.example.android.guidetourapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EntertainmentFragment extends Fragment {


    public EntertainmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create an array of places to visit
        final ArrayList<PlaceOfInterest> places = new ArrayList<PlaceOfInterest>();
        places.add(new PlaceOfInterest(R.drawable.trekking, R.string.trekking, R.string.TPN, R.string.trek));
        places.add(new PlaceOfInterest(R.drawable.grota, R.string.salt, R.string.spa, R.string.sal));
        places.add(new PlaceOfInterest(R.drawable.jazd_na_nartach, R.string.ski, R.string.Lipki, R.string.snow));
        places.add(new PlaceOfInterest(R.drawable.przelecz_pod_chlopkiem, R.string.photos, R.string.TPN, R.string.photo));
        places.add(new PlaceOfInterest(R.drawable.rower, R.string.bike, R.string.TPN, R.string.cycle));
        places.add(new PlaceOfInterest(R.drawable.termy, R.string.therms, R.string.Bukowina, R.string.therm));
        places.add(new PlaceOfInterest(R.drawable.wspinaczka, R.string.climbing, R.string.TPN, R.string.climb));
        places.add(new PlaceOfInterest(R.drawable.dysko, R.string.disco, R.string.Kolorowa, R.string.club));
        places.add(new PlaceOfInterest(R.drawable.images, R.string.maze, R.string.labirynt, R.string.lab));
        places.add(new PlaceOfInterest(R.drawable.dzika_przyroda, R.string.wildlife, R.string.TPN, R.string.wild));

        PlacesListAdapter adapter = new PlacesListAdapter(getActivity(), places, R.color.category_entertainment);

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
