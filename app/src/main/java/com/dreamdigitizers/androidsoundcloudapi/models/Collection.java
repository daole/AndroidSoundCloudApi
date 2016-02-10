package com.dreamdigitizers.androidsoundcloudapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Collection extends ModelBase {
    @SerializedName("collection")
    @Expose
    private List<Track> mCollection;

    @SerializedName("next_href")
    @Expose
    private String mNextHref;

    public List<Track> getCollection() {
        return this.mCollection;
    }

    public void setCollection(List<Track> pCollection) {
        this.mCollection = pCollection;
    }

    public String getNextHref() {
        return this.mNextHref;
    }

    public void setNextHref(String pNextHref) {
        this.mNextHref = pNextHref;
    }
}
