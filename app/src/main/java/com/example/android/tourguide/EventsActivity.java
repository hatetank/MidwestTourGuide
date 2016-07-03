package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Gavin on 7/3/2016.
 */
public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highlight_list);

        final ArrayList<Highlight> eventsList = new ArrayList<>();
        Collections.addAll(eventsList,
                new Highlight(getString(R.string.building_fire),
                        getString(R.string.description_building_fire),
                        R.drawable.ic_child_care_white_24dp),
                new Highlight(getString(R.string.store_closing),
                        getString(R.string.description_store_closing),
                        R.drawable.ic_child_care_white_24dp),
                new Highlight(getString(R.string.mass_layoff),
                        getString(R.string.description_mass_layoff),
                        R.drawable.ic_child_care_white_24dp),
                new Highlight(getString(R.string.shooting),
                        getString(R.string.description_shooting),
                        R.drawable.ic_child_care_white_24dp),
                new Highlight(getString(R.string.extreme_wrestling),
                        getString(R.string.description_extreme_wrestling),
                        R.drawable.ic_child_care_white_24dp),
                new Highlight(getString(R.string.road_repair),
                        getString(R.string.description_road_repair),
                        R.drawable.ic_child_care_white_24dp),
                new Highlight(getString(R.string.protest_governor),
                        getString(R.string.description_protest_governor),
                        R.drawable.ic_child_care_white_24dp)
        );

        HighlightAdapter itemsAdapter = new HighlightAdapter(this, eventsList, R.color.category_events);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }

}