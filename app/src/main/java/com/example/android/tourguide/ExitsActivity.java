package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Gavin on 7/3/2016.
 */
public class ExitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highlight_list);

        final ArrayList<Highlight> eventsList = new ArrayList<>();
        Collections.addAll(eventsList,
                new Highlight(getString(R.string.plane), getString(R.string.description_plane)),
                new Highlight(getString(R.string.train), getString(R.string.description_train)),
                new Highlight(getString(R.string.automobile), getString(R.string.description_automobile)),
                new Highlight(getString(R.string.sub_orbital_craft), getString(R.string.description_suborbital)),
                new Highlight(getString(R.string.horseback), getString(R.string.description_horseback)),
                new Highlight(getString(R.string.on_foot), getString(R.string.description_on_foot))
        );

        HighlightAdapter itemsAdapter = new HighlightAdapter(this, eventsList, R.color.category_exits);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }

}