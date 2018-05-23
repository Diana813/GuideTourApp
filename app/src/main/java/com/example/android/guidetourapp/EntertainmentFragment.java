package com.example.android.guidetourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        //Create an array of words
        final ArrayList<PlaceOfInterest> places = new ArrayList<PlaceOfInterest>();
        places.add(new PlaceOfInterest(R.drawable.trekking, "Trekking", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.grota, "SPA", "Art&Spa Hotel, Zakopane"));
        places.add(new PlaceOfInterest(R.drawable.jazd_na_nartach, "Ski or Snowboard", "Ski lift Lipki"));
        places.add(new PlaceOfInterest(R.drawable.raj_dla_fotografow, "Photography", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.rower, "Bike", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.termy, "Therms", "Bukowina Tatrzańska"));
        places.add(new PlaceOfInterest(R.drawable.wspinaczka, "Climbing", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.dysko, "Disco", "Kolorowa, Zakopane"));
        places.add(new PlaceOfInterest(R.drawable.medytacja, "Relax with friends", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.dzika_przyroda, "Watching wildlife", "Tatrzański Park Narodowy"));

        PlacesListAdapter adapter = new PlacesListAdapter(getActivity(), places, R.color.category_entertainment);

        final ListView listView = (ListView) rootView.findViewById(R.id.list_item);

        listView.setAdapter(adapter);

        return rootView;
    }


}
