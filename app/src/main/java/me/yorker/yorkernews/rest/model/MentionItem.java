package me.yorker.yorkernews.rest.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
import org.parceler.Transient;

/**
 * Created by johngummadi on 6/26/16.
 */

@Parcel
public class MentionItem {
    @Transient
    @SerializedName("name")
    private String _name;
    public String getName() { return _name; }
}

