package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Gavin on 7/3/2016.
 */
public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highlight_list);

        final ArrayList<Highlight> eventsList = new ArrayList<>();
        Collections.addAll(eventsList,
                new Highlight(getString(R.string.bon_voyage),
                        getString(R.string.description_bonvoyage),
                        R.drawable.ic_directions_run_white_24dp),
                new Highlight(getString(R.string.tavern),
                        getString(R.string.description_tavern),
                        R.drawable.ic_directions_run_white_24dp),
                new Highlight(getString(R.string.parking_lot),
                        getString(R.string.description_parkinglot),
                        R.drawable.ic_directions_run_white_24dp),
                new Highlight(getString(R.string.midway_village),
                        getString(R.string.description_midway_village),
                        R.drawable.ic_directions_run_white_24dp),
                new Highlight(getString(R.string.wal_mart),
                        getString(R.string.description_walmart),
                        R.drawable.ic_directions_run_white_24dp)
        );

        HighlightAdapter itemsAdapter = new HighlightAdapter(this, eventsList, R.color.category_places);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }

}