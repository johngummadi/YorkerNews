package me.yorker.yorkernews.rest.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
import org.parceler.Transient;

/**
 * Created by johngummadi on 6/26/16.
 */

@Parcel
public class AboutItem {

    @Transient
    @SerializedName("readLink")
    private String _readLink;
    public String getReadLink() { return _readLink; }


    @Transient
    @SerializedName("name")
    private String _name;
    public String getName() { return _name; }
}

