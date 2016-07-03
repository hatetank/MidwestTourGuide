package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gavin on 7/3/2016.
 */
public class HighlightAdapter extends ArrayAdapter<Highlight> {
    int mBackGroundColor;

    public HighlightAdapter(Context context, ArrayList<Highlight> words, int backGroundColor) {
        super(context, 0, words);
        mBackGroundColor = backGroundColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // create (inflate) a new list item view if one isn't available already to reuse
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.highlight_list_item, parent, false);
        }


        // get the Highlight at this position
        Highlight currentHighlight = getItem(position);

        // populate the TextViews on this list item View with the current Highlight's values.
        TextView highlightDescriptionView = (TextView) listItemView.findViewById(R.id.highlight_description);
        highlightDescriptionView.setText(currentHighlight.getHighlightDescription());

        TextView highlightNameView = (TextView) listItemView.findViewById(R.id.highlight_name);
        highlightNameView.setText(currentHighlight.getHighlightName());


        ImageView highlightImage = (ImageView) listItemView.findViewById(R.id.image);
        if (currentHighlight.hasImage()) {
            // unhide image
            highlightImage.setVisibility(View.VISIBLE);
            // set image for this view
            highlightImage.setImageResource(currentHighlight.getImageResourceID());
        } else {
            // remove imageview from layout for this item
            highlightImage.setVisibility(View.GONE);
        }

        // in this list item view, grab the text box container for words/tranlations
        View listBox = listItemView.findViewById(R.id.list_item);

        // change background color for this WordAdapter to the right id
        listBox.setBackgroundColor(ContextCompat.getColor(getContext(), mBackGroundColor));

        // return this List ItemView to the ListView for display
        return listItemView;
    }
}
