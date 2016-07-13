package me.yorker.yorkernews.rest.model;

import com.google.gson.annotations.SerializedName;
import org.parceler.Parcel;
import org.parceler.Transient;

/**
 * Created by johngummadi on 6/26/16.
 */

@Parcel
public class Thumbnail {

    @Transient
    @SerializedName("contentUrl")
    private String _contentUrl;
    public String getContentUrl() { return _contentUrl; }

    @Transient
    @SerializedName("width")
    private int _width;
    public int getWidth() { return _width; }

    @Transient
    @SerializedName("height")
    private int _height;
    public int getHeight() { return _height; }
}

