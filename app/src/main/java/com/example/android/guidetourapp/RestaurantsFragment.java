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
        places.add(new PlaceOfInterest(R.drawable.czarci_jar, "Czarci Jar", "Polish cuisine"));
        places.add(new PlaceOfInterest(R.drawable.dobra_kasza_nasza, "Dobra Kasza Nasza", "Groats in a thousand ways"));
        places.add(new PlaceOfInterest(R.drawable.goralski_dworek, "Góralski dworek", "Polish cuisine"));
        places.add(new PlaceOfInterest(R.drawable.kuchenne_rewolucje, "Obrochtówka", "Polish cuisine"));
        places.add(new PlaceOfInterest(R.drawable.adamo, "Adamo", "Italian cuisine"));
        places.add(new PlaceOfInterest(R.drawable.cristina_ristorante, "Cristina Ristorante", "Italian cuisine"));
        places.add(new PlaceOfInterest(R.drawable.namaste, "Namaste", "Indian cuisine"));
        places.add(new PlaceOfInterest(R.drawable.pstrag_zakopane, "Pstrąg Górski", "Fresh fish"));
        places.add(new PlaceOfInterest(R.drawable.casa_mia, "Casa mia", "Mediterranean cuisine, polish cuisine, vegetarian, vegan"));
        places.add(new PlaceOfInterest(R.drawable.bakowo_zohylina_niznio, "Bakowo Zohylina Niznio", "Polish cuisine, vegetarian"));

        PlacesListAdapter adapter = new PlacesListAdapter(getActivity(), places, R.color.category_restaurants);

        final ListView listView = (ListView) rootView.findViewById(R.id.list_item);

        listView.setAdapter(adapter);

        //This method will be executed when the item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent descriptionIntent = new Intent(getActivity(), DescriptionActivity.class);

                // Start the new activity
                startActivity(descriptionIntent);

            }

        });

        return rootView;
    }


}
