package com.example.android.tourguide;

/**
 * Created by Gavin on 7/3/2016.
 */
public class Highlight {
    public static final int NO_IMAGE_PROVIDED = -1;
    private String mDescription;
    private String mName;
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /**
     * Create a new Highlight object.
     *
     * @param highlightName        name of location or event
     * @param highlightDescription brief description of the location or event
     */
    public Highlight(String highlightName, String highlightDescription) {
        mDescription = highlightDescription;
        mName = highlightName;

    }

    /**
     * Create a new Highlight object with an associated image
     *
     * @param highlightName        is the name of the location or event
     * @param highlightDescription is the brief description of the location or event
     * @param imageID              is the image resource ID associated with the HighLight.
     */
    public Highlight(String highlightName, String highlightDescription, int imageID) {
        mDescription = highlightDescription;
        mName = highlightName;
        mImageResourceID = imageID;
    }

    public String getHighlightDescription() {
        return mDescription;
    }

    /**
     * @return id for the image resource for this word
     */
    public String getHighlightName() {
        return mName;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }


    @Override
    public String toString() {
        return "Word{" +
                "mDescription='" + mDescription + '\'' +
                ", mName='" + mName + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                '}';
    }
}
