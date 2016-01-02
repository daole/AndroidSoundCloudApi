package com.dreamdigitizers.androidsoundcloudapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WebProfile extends Model {
    @SerializedName("id")
    @Expose
    private int mId;

    @SerializedName("kind")
    @Expose
    private String mKind;

    @SerializedName("service")
    @Expose
    private String mService;

    @SerializedName("title")
    @Expose
    private String mTitle;

    @SerializedName("url")
    @Expose
    private String mUrl;

    @SerializedName("username")
    @Expose
    private String mUsername;

    @SerializedName("created_at")
    @Expose
    private String mCreatedAt;

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

    public String getService() {
        return this.mService;
    }

    public void setService(String pService) {
        this.mService = pService;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String pTitle) {
        this.mTitle = pTitle;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public void setUrl(String pUrl) {
        this.mUrl = pUrl;
    }

    public String getUsername() {
        return this.mUsername;
    }

    public void setUsername(String pUsername) {
        this.mUsername = pUsername;
    }

    public String getCreatedAt() {
        return this.mCreatedAt;
    }

    public void setCreatedAt(String pCreatedAt) {
        this.mCreatedAt = pCreatedAt;
    }
}
