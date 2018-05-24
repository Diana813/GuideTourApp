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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create an array of places to visit
        final ArrayList<PlaceOfInterest> places = new ArrayList<PlaceOfInterest>();
        places.add(new PlaceOfInterest(R.drawable.aries_hotel_spa, R.string.Aries, R.string.aries, R.string.Arie));
        places.add(new PlaceOfInterest(R.drawable.art_and_spa, R.string.Art, R.string.art, R.string.Ar));
        places.add(new PlaceOfInterest(R.drawable.tatra_chalet, R.string.Tatra, R.string.tatra, R.string.Tatr));
        places.add(new PlaceOfInterest(R.drawable.villa_miodula, R.string.villa, R.string.miodula, R.string.vill));
        places.add(new PlaceOfInterest(R.drawable.gorska_osada, R.string.gorska, R.string.osada, R.string.gorsk));
        places.add(new PlaceOfInterest(R.drawable.osada_harenda, R.string.harenda, R.string.Harenda, R.string.harend));
        places.add(new PlaceOfInterest(R.drawable.grand_hotel_stamary, R.string.stamary, R.string.Stamary, R.string.stamar));
        places.add(new PlaceOfInterest(R.drawable.grand_hotel_nosalowy_dwor, R.string.nosalowy, R.string.Nosalowy, R.string.nosalow));
        places.add(new PlaceOfInterest(R.drawable.rezydencja_dwa_nosalowy_dwor, R.string.nosalowy_dwa, R.string.Nosalowy, R.string.nosalowy_dw));
        places.add(new PlaceOfInterest(R.drawable.biala_owca, R.string.owca, R.string.Owca, R.string.owc));

        PlacesListAdapter adapter = new PlacesListAdapter(getActivity(), places, R.color.category_hotels);

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
