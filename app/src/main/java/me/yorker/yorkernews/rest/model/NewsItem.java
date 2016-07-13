package me.yorker.yorkernews.rest.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
import org.parceler.Transient;

import java.util.Date;

/**
 * Created by johngummadi on 6/26/16.
 */

@Parcel
public class NewsItem {
    @Transient
    @SerializedName("name")
    private String _name;
    public String getName() { return _name; }

    @Transient
    @SerializedName("url")
    private String _url;
    public String getUrl() { return _url; }

    @Transient
    @SerializedName("image")
    private Image _image;
    public Image getImage() { return _image; }

    @Transient
    @SerializedName("description")
    private String _description;
    public String getDescription() { return _description; }

    @Transient
    @SerializedName("about")
    private AboutItem[] _about;
    public AboutItem[] getAbout() { return _about; }

    @Transient
    @SerializedName("mentions")
    private MentionItem[] _mentions;
    public MentionItem[] getMentions() { return _mentions; }

    @Transient
    @SerializedName("provider")
    private ProviderItem[] _provider;
    public ProviderItem[] getProvider() { return _provider; }

    @Transient
    @SerializedName("datePublished")
    private String _datePublished;
    public String getDatePublished() { return _datePublished; } //TODO: Return Date object instead

    @Transient
    @SerializedName("category")
    private String _category;
    public String getCategory() { return _category; }


}

