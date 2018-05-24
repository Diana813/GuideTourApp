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

        //Create an array of places to visit
        final ArrayList<PlaceOfInterest> places = new ArrayList<PlaceOfInterest>();
        places.add(new PlaceOfInterest(R.drawable.czarci_jar, R.string.czarci, R.string.Polish, R.string.czart));
        places.add(new PlaceOfInterest(R.drawable.dobra_kasza_nasza, R.string.kasza, R.string.groats, R.string.kasz));
        places.add(new PlaceOfInterest(R.drawable.goralski_dworek, R.string.dworek, R.string.Polish, R.string.dwor));
        places.add(new PlaceOfInterest(R.drawable.kuchenne_rewolucje, R.string.obrochtowka, R.string.Polish, R.string.obroch));
        places.add(new PlaceOfInterest(R.drawable.adamo, R.string.adamo, R.string.Italian, R.string.adam));
        places.add(new PlaceOfInterest(R.drawable.cristina_ristorante, R.string.cristina, R.string.Italian, R.string.cristi));
        places.add(new PlaceOfInterest(R.drawable.namaste, R.string.namaste, R.string.Indian, R.string.namas));
        places.add(new PlaceOfInterest(R.drawable.pstrag_zakopane, R.string.pstrąg, R.string.fish, R.string.pstr));
        places.add(new PlaceOfInterest(R.drawable.casa_mia, R.string.casa, R.string.Mediterranean, R.string.cas));
        places.add(new PlaceOfInterest(R.drawable.bakowo_zohylina_niznio, R.string.bakowo, R.string.Veg, R.string.bak));

        PlacesListAdapter adapter = new PlacesListAdapter(getActivity(), places, R.color.category_restaurants);

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
