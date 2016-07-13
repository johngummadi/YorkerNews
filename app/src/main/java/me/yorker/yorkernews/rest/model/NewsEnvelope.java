package me.yorker.yorkernews.rest.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
import org.parceler.Transient;

/**
 * Created by johngummadi on 6/26/16.
 */

@Parcel
public class NewsEnvelope {

    @Transient
    @SerializedName("_type")
    private String _type;
    public String getType() { return _type; }

    @Transient
    @SerializedName("value")
    private NewsItem[] _news;
    public NewsItem[] getNews() { return _news; }
}

