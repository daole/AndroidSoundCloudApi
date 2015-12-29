package com.dreamdigitizers.androidsoundcloudapi.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    @Expose
    private int mId;

    @SerializedName("kind")
    @Expose
    private String mKind;

    @SerializedName("permalink")
    @Expose
    private String mPermalink;

    @SerializedName("username")
    @Expose
    private String mUsername;

    @SerializedName("last_modified")
    @Expose
    private String mLastModified;

    @SerializedName("uri")
    @Expose
    private String mUri;

    @SerializedName("permalink_url")
    @Expose
    private String mPermalinkUrl;

    @SerializedName("avatar_url")
    @Expose
    private String mAvatarUrl;

    @SerializedName("country")
    @Expose
    private String mCountry;

    @SerializedName("first_name")
    @Expose
    private String mFirstName;

    @SerializedName("last_name")
    @Expose
    private String mLastName;

    @SerializedName("full_name")
    @Expose
    private String mFullName;

    @SerializedName("description")
    @Expose
    private String mDescription;

    @SerializedName("city")
    @Expose
    private String mCity;

    @SerializedName("discogs_name")
    @Expose
    private String mDiscogsName;

    @SerializedName("myspace_name")
    @Expose
    private String mMyspaceName;

    @SerializedName("website")
    @Expose
    private String mWebsite;

    @SerializedName("website_title")
    @Expose
    private String mWebsiteTitle;

    @SerializedName("online")
    @Expose
    private boolean mOnline;

    @SerializedName("track_count")
    @Expose
    private int mTrackCount;

    @SerializedName("playlist_count")
    @Expose
    private int mPlaylistCount;

    @SerializedName("plan")
    @Expose
    private String mPlan;

    @SerializedName("public_favorites_count")
    @Expose
    private int mPublicFavoritesCount;

    @SerializedName("followers_count")
    @Expose
    private int mFollowersCount;

    @SerializedName("followings_count")
    @Expose
    private int mFollowingsCount;

    @SerializedName("mSubscriptions")
    @Expose
    private List mSubscriptions = new ArrayList();

    public int getId() {
        return this.mId;
    }

    public void setId(int pId) {
        this.mId = pId;
    }

    public String getKind() {
        return this.mKind;
    }

    public void setKind(String pKind) {
        this.mKind = pKind;
    }

    public String getPermalink() {
        return this.mPermalink;
    }

    public void setPermalink(String pPermalink) {
        this.mPermalink = pPermalink;
    }

    public String getUsername() {
        return this.mUsername;
    }

    public void setUsername(String pUsername) {
        this.mUsername = pUsername;
    }

    public String getLastModified() {
        return this.mLastModified;
    }

    public void setLastModified(String pLastModified) {
        this.mLastModified = pLastModified;
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

    public String getAvatarUrl() {
        return this.mAvatarUrl;
    }

    public void setAvatarUrl(String pAvatarUrl) {
        this.mAvatarUrl = pAvatarUrl;
    }

    public String getCountry() {
        return this.mCountry;
    }

    public void setCountry(String pCountry) {
        this.mCountry = pCountry;
    }

    public String getFirstName() {
        return this.mFirstName;
    }

    public void setFirstName(String pFirstName) {
        this.mFirstName = pFirstName;
    }

    public String getLastName() {
        return this.mLastName;
    }

    public void setLastName(String pLastName) {
        this.mLastName = pLastName;
    }

    public String getFullName() {
        return this.mFullName;
    }

    public void setFullName(String pFullName) {
        this.mFullName = pFullName;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public void setDescription(String pDescription) {
        this.mDescription = pDescription;
    }

    public String getCity() {
        return this.mCity;
    }

    public void setCity(String pCity) {
        this.mCity = pCity;
    }

    public String getDiscogsName() {
        return this.mDiscogsName;
    }

    public void setDiscogsName(String pDiscogsName) {
        this.mDiscogsName = pDiscogsName;
    }

    public String getMyspaceName() {
        return this.mMyspaceName;
    }

    public void setMyspaceName(String pMyspaceName) {
        this.mMyspaceName = pMyspaceName;
    }

    public String getWebsite() {
        return this.mWebsite;
    }

    public void setWebsite(String pWebsite) {
        this.mWebsite = pWebsite;
    }

    public String getWebsiteTitle() {
        return this.mWebsiteTitle;
    }

    public void setWebsiteTitle(String pWebsiteTitle) {
        this.mWebsiteTitle = pWebsiteTitle;
    }

    public boolean getOnline() {
        return this.mOnline;
    }

    public void setOnline(boolean pOnline) {
        this.mOnline = pOnline;
    }

    public int getTrackCount() {
        return this.mTrackCount;
    }

    public void setTrackCount(int pTrackCount) {
        this.mTrackCount = pTrackCount;
    }

    public int getPlaylistCount() {
        return this.mPlaylistCount;
    }

    public void setPlaylistCount(int pPlaylistCount) {
        this.mPlaylistCount = pPlaylistCount;
    }

    public String getPlan() {
        return this.mPlan;
    }

    public void setPlan(String pPlan) {
        this.mPlan = pPlan;
    }

    public int getPublicFavoritesCount() {
        return this.mPublicFavoritesCount;
    }

    public void setPublicFavoritesCount(int pPublicFavoritesCount) {
        this.mPublicFavoritesCount = pPublicFavoritesCount;
    }

    public int getFollowersCount() {
        return this.mFollowersCount;
    }

    public void setFollowersCount(int pFollowersCount) {
        this.mFollowersCount = pFollowersCount;
    }

    public int getFollowingsCount() {
        return this.mFollowingsCount;
    }

    public void setFollowingsCount(int pFollowingsCount) {
        this.mFollowingsCount = pFollowingsCount;
    }

    public List getSubscriptions() {
        return this.mSubscriptions;
    }

    public void setSubscriptions(List pSubscriptions) {
        this.mSubscriptions = pSubscriptions;
    }
}
