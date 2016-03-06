package com.dreamdigitizers.androidsoundcloudapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Playlists extends ModelBase {
    @SerializedName("collection")
    @Expose
    private List<Playlist> mCollection;

    @SerializedName("next_href")
    @Expose
    private String mNextHref;

    public List<Playlist> getCollection() {
        return this.mCollection;
    }

    public void setCollection(List<Playlist> pCollection) {
        this.mCollection = pCollection;
    }

    public String getNextHref() {
        return this.mNextHref;
    }

    public void setNextHref(String pNextHref) {
        this.mNextHref = pNextHref;
    }
}
