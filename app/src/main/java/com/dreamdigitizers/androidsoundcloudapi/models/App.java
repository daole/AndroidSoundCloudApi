package com.dreamdigitizers.androidsoundcloudapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class App extends Model {
    @SerializedName("id")
    @Expose
    private int mId;

    @SerializedName("kind")
    @Expose
    private String mKind;

    @SerializedName("name")
    @Expose
    private String mName;

    @SerializedName("uri")
    @Expose
    private String mUri;

    @SerializedName("permalink_url")
    @Expose
    private String mPermalinkUrl;

    @SerializedName("external_url")
    @Expose
    private String mExternalUrl;

    @SerializedName("creator")
    @Expose
    private String mCreator;

    public int getId() {
        return this.mId;
    }

    public void setId(Integer pId) {
        this.mId = pId;
    }

    public String getKind() {
        return this.mKind;
    }

    public void setKind(String pKind) {
        this.mKind = pKind;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String pName) {
        this.mName = pName;
    }

    public String getUri() {
        return this.mUri;
    }

    public void setUri(String pUri) {
        this.mUri = pUri;
    }

    public String getPermalinkUrl() {
        return this.mPermalinkUrl;
    }

    public void setPermalinkUrl(String pPermalinkUrl) {
        this.mPermalinkUrl = pPermalinkUrl;
    }

    public String getExternalUrl() {
        return this.mExternalUrl;
    }

    public void setExternalUrl(String pExternalUrl) {
        this.mExternalUrl = pExternalUrl;
    }

    public String getCreator() {
        return this.mCreator;
    }

    public void setCreator(String pCreator) {
        this.mCreator = pCreator;
    }
}
