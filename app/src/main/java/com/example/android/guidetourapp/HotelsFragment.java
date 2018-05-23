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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create an array of words
        final ArrayList<PlaceOfInterest> places = new ArrayList<PlaceOfInterest>();
        places.add(new PlaceOfInterest(R.drawable.aries_hotel_spa, "Aries Hotel & Spa", "Zaruskiego 5, Zakopane"));
        places.add(new PlaceOfInterest(R.drawable.art_and_spa, "Art & Spa", "Kościuszki 18, Zakopane"));
        places.add(new PlaceOfInterest(R.drawable.tatra_chalet, "Tatra Chalet", "Bogdańskiego 5, Zakopane"));
        places.add(new PlaceOfInterest(R.drawable.villa_miodula, "Villa Miodula", "Mocarni 17, Kościelisko"));
        places.add(new PlaceOfInterest(R.drawable.gorska_osada, "Górska Osada", "Kośne Hamry, Poronin"));
        places.add(new PlaceOfInterest(R.drawable.osada_harenda, "Osada Harenda", "Harenda 28A, Zakopane"));
        places.add(new PlaceOfInterest(R.drawable.grand_hotel_stamary, "Grand Hotel Stamary", "Kościuszki 19, Zakopane"));
        places.add(new PlaceOfInterest(R.drawable.grand_hotel_nosalowy_dwor, "Grand Hotel Nosalowy Dwór", "Balzera 21D, Zakopane"));
        places.add(new PlaceOfInterest(R.drawable.rezydencja_dwa_nosalowy_dwor, "Rezydencja II Nosalowy Dwór", "Balzera 21D, Zakopane"));
        places.add(new PlaceOfInterest(R.drawable.biala_owca, "Biała Owca", "Bogdańskiego 8, Zakopane"));

        PlacesListAdapter adapter = new PlacesListAdapter(getActivity(), places, R.color.category_hotels);

        final ListView listView = (ListView) rootView.findViewById(R.id.list_item);

        listView.setAdapter(adapter);

        return rootView;
    }


}
