package com.example.android.guidetourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create an array of words
        final ArrayList<PlaceOfInterest> places = new ArrayList<PlaceOfInterest>();
        places.add(new PlaceOfInterest(R.drawable.czarny_staw_pod_rysami, "Czarny Staw Pod Rysami", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.granaty, "Granaty", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.maly_koscielec, "Mały Kościelec", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.polana_chocholowska, "Polana Chochołowska", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.dolina_za_mnichem, "Dolina za Mnichem", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.rysy, "Rysy", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.trzydniowianski_wierch, "Trzydniowiański Wierch", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.dolina_pieciu_stawow, "Dolina Pięciu Stawów", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.czerwone_wierchy, "Czerwone Wierchy", "Tatrzański Park Narodowy"));
        places.add(new PlaceOfInterest(R.drawable.morskie_oko, "Morskie Oko", "Tatrzański Park Narodowy"));

        PlacesListAdapter adapter = new PlacesListAdapter(getActivity(), places, R.color.category_nature);

        final ListView listView = (ListView) rootView.findViewById(R.id.list_item);

        listView.setAdapter(adapter);

        return rootView;
    }


}
