package me.yorker.yorkernews.rest.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
import org.parceler.Transient;

/**
 * Created by johngummadi on 6/26/16.
 */

@Parcel
public class Image {

    @Transient
    @SerializedName("thumbnail")
    private Thumbnail _thumbnail;
    public Thumbnail getThumbnail() { return _thumbnail; }

    // TODO: Find out of image has something else (other than thumb nail).
}

