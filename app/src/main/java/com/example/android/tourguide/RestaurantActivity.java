package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Gavin on 7/3/2016.
 */
public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highlight_list);

        final ArrayList<Highlight> eventsList = new ArrayList<>();
        Collections.addAll(eventsList,
                new Highlight(getString(R.string.mcds), getString(R.string.description_mcds),
                        R.drawable.ic_restaurant_menu_white_24dp),
                new Highlight(getString(R.string.burger_king), getString(R.string.description_burger_king),
                        R.drawable.ic_restaurant_menu_white_24dp),
                new Highlight(getString(R.string.wendys), getString(R.string.description_wendys),
                        R.drawable.ic_restaurant_menu_white_24dp),
                new Highlight(getString(R.string.chipotle), getString(R.string.description_chipotle),
                        R.drawable.ic_restaurant_menu_white_24dp),
                new Highlight(getString(R.string.taco_bell), getString(R.string.description_taco_bell),
                        R.drawable.ic_restaurant_menu_white_24dp),
                new Highlight(getString(R.string.hooters), getString(R.string.description_hooters),
                        R.drawable.ic_restaurant_menu_white_24dp)
        );

        HighlightAdapter itemsAdapter = new HighlightAdapter(this, eventsList, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }

}