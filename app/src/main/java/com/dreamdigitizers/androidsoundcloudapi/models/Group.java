package com.dreamdigitizers.androidsoundcloudapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Group extends ModelBase {
    @SerializedName("kind")
    @Expose
    private String mKind;

    @SerializedName("id")
    @Expose
    private int mId;

    @SerializedName("created_at")
    @Expose
    private String mCreatedAt;

    @SerializedName("permalink")
    @Expose
    private String pPermalink;

    @SerializedName("track_count")
    @Expose
    private int mTrackCount;

    @SerializedName("members_count")
    @Expose
    private int mMembersCount;

    @SerializedName("moderated")
    @Expose
    private boolean mModerated;

    @SerializedName("contributors_count")
    @Expose
    private int mContributorsCount;

    @SerializedName("name")
    @Expose
    private String mName;

    @SerializedName("short_description")
    @Expose
    private String mShortDescription;

    @SerializedName("description")
    @Expose
    private String mDescription;

    @SerializedName("uri")
    @Expose
    private String mUri;

    @SerializedName("artwork_url")
    @Expose
    private String mArtworkUrl;

    @SerializedName("permalink_url")
    @Expose
    private String pPermalinkUrl;

    @SerializedName("creator")
    @Expose
    private User mCreator;

    public String getKind() {
        return this.mKind;
    }

    public void setKind(String pKind) {
        this.mKind = pKind;
    }

    public int getId() {
        return this.mId;
    }

    public void setId(int pId) {
        this.mId = pId;
    }

    public String getCreatedAt() {
        return this.mCreatedAt;
    }

    public void setCreatedAt(String pCreatedAt) {
        this.mCreatedAt = pCreatedAt;
    }

    public String getPermalink() {
        return this.pPermalink;
    }

    public void setPermalink(String pPermalink) {
        this.pPermalink = pPermalink;
    }

    public int getTrackCount() {
        return this.mTrackCount;
    }

    public void setTrackCount(int pTrackCount) {
        this.mTrackCount = pTrackCount;
    }

    public int getMembersCount() {
        return this.mMembersCount;
    }

    public void setMembersCount(int pMembersCount) {
        this.mMembersCount = pMembersCount;
    }

    public boolean isModerated() {
        return this.mModerated;
    }

    public void setModerated(boolean pModerated) {
        this.mModerated = pModerated;
    }

    public int getContributorsCount() {
        return this.mContributorsCount;
    }

    public void setContributorsCount(int pContributorsCount) {
        this.mContributorsCount = pContributorsCount;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String pName) {
        this.mName = pName;
    }

    public String getShortDescription() {
        return this.mShortDescription;
    }

    public void setShortDescription(String pShortDescription) {
        this.mShortDescription = pShortDescription;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public void setDescription(String pDescription) {
        this.mDescription = pDescription;
    }

    public String getUri() {
        return this.mUri;
    }

    public void setUri(String pUri) {
        this.mUri = pUri;
    }

    public String getArtworkUrl() {
        return this.mArtworkUrl;
    }

    public void setArtworkUrl(String pArtworkUrl) {
        this.mArtworkUrl = pArtworkUrl;
    }

    public String getPermalinkUrl() {
        return this.pPermalinkUrl;
    }

    public void setPermalinkUrl(String pPermalinkUrl) {
        this.pPermalinkUrl = pPermalinkUrl;
    }

    public User getCreator() {
        return this.mCreator;
    }

    public void setCreator(User pCreator) {
        this.mCreator = pCreator;
    }
}
