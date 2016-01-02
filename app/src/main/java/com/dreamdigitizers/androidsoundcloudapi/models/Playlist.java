package com.dreamdigitizers.androidsoundcloudapi.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Playlist extends Model {
    @SerializedName("duration")
    @Expose
    private int mDuration;

    @SerializedName("permalink_url")
    @Expose
    private String mPermalinkUrl;

    @SerializedName("genre")
    @Expose
    private String mGenre;

    @SerializedName("permalink")
    @Expose
    private String mPermalink;

    @SerializedName("purchase_url")
    @Expose
    private String mPurchaseUrl;

    @SerializedName("release_day")
    @Expose
    private int mReleaseDay;

    @SerializedName("release_month")
    @Expose
    private int mReleaseMonth;

    @SerializedName("release_year")
    @Expose
    private int mReleaseYear;

    @SerializedName("description")
    @Expose
    private String mDescription;

    @SerializedName("uri")
    @Expose
    private String mUri;

    @SerializedName("label_name")
    @Expose
    private String mLabelName;

    @SerializedName("tag_list")
    @Expose
    private String mTagList;

    @SerializedName("track_count")
    @Expose
    private int mTrackCount;

    @SerializedName("user_id")
    @Expose
    private int mUserId;

    @SerializedName("last_modified")
    @Expose
    private String mLastModified;

    @SerializedName("license")
    @Expose
    private String mLicense;

    @SerializedName("playlist_type")
    @Expose
    private String mPlaylistType;

    @SerializedName("id")
    @Expose
    private int mId;

    @SerializedName("downloadable")
    @Expose
    private boolean mDownloadable;

    @SerializedName("sharing")
    @Expose
    private String mSharing;

    @SerializedName("created_at")
    @Expose
    private String mCreatedAt;

    @SerializedName("release")
    @Expose
    private String mRelease;

    @SerializedName("kind")
    @Expose
    private String mKind;

    @SerializedName("title")
    @Expose
    private String mTitle;

    @SerializedName("type")
    @Expose
    private String mType;

    @SerializedName("purchase_title")
    @Expose
    private String mPurchaseTitle;

    @SerializedName("artwork_url")
    @Expose
    private String mArtworkUrl;

    @SerializedName("ean")
    @Expose
    private String mEan;

    @SerializedName("streamable")
    @Expose
    private boolean mStreamable;

    @SerializedName("embeddable_by")
    @Expose
    private String mEmbeddableBy;

    @SerializedName("label_id")
    @Expose
    private int mLabelId;

    @SerializedName("user")
    @Expose
    private User mUser;

    @SerializedName("tracks")
    @Expose
    private List<Track> mTracks = new ArrayList<Track>();

    public int getDuration() {
        return this.mDuration;
    }

    public void setDuration(int pDuration) {
        this.mDuration = pDuration;
    }

    public int getReleaseDay() {
        return this.mReleaseDay;
    }

    public void setReleaseDay(int pReleaseDay) {
        this.mReleaseDay = pReleaseDay;
    }

    public String getPermalinkUrl() {
        return this.mPermalinkUrl;
    }

    public void setPermalinkUrl(String pPermalinkUrl) {
        this.mPermalinkUrl = pPermalinkUrl;
    }

    public String getGenre() {
        return this.mGenre;
    }

    public void setGenre(String pGenre) {
        this.mGenre = pGenre;
    }

    public String getPermalink() {
        return this.mPermalink;
    }

    public void setPermalink(String pPermalink) {
        this.mPermalink = pPermalink;
    }

    public String getPurchaseUrl() {
        return this.mPurchaseUrl;
    }

    public void setPurchaseUrl(String pPurchaseUrl) {
        this.mPurchaseUrl = pPurchaseUrl;
    }

    public int getReleaseMonth() {
        return this.mReleaseMonth;
    }

    public void setReleaseMonth(int pReleaseMonth) {
        this.mReleaseMonth = pReleaseMonth;
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

    public String getLabelName() {
        return this.mLabelName;
    }

    public void setLabelName(String pLabelName) {
        this.mLabelName = pLabelName;
    }

    public String getTagList() {
        return this.mTagList;
    }

    public void setTagList(String pTagList) {
        this.mTagList = pTagList;
    }

    public int getReleaseYear() {
        return this.mReleaseYear;
    }

    public void setReleaseYear(int pReleaseYear) {
        this.mReleaseYear = pReleaseYear;
    }

    public int getTrackCount() {
        return this.mTrackCount;
    }

    public void setTrackCount(int pTrackCount) {
        this.mTrackCount = pTrackCount;
    }

    public int getUserId() {
        return this.mUserId;
    }

    public void setUserId(int pUserId) {
        this.mUserId = pUserId;
    }

    public String getLastModified() {
        return this.mLastModified;
    }

    public void setLastModified(String pLastModified) {
        this.mLastModified = pLastModified;
    }

    public String getLicense() {
        return this.mLicense;
    }

    public void setLicense(String pLicense) {
        this.mLicense = pLicense;
    }

    public String getPlaylistType() {
        return this.mPlaylistType;
    }

    public void setPlaylistType(String pPlaylistType) {
        this.mPlaylistType = pPlaylistType;
    }

    public int getId() {
        return this.mId;
    }

    public void setId(int pId) {
        this.mId = pId;
    }

    public boolean isDownloadable() {
        return this.mDownloadable;
    }

    public void setDownloadable(boolean pDownloadable) {
        this.mDownloadable = pDownloadable;
    }

    public String getSharing() {
        return this.mSharing;
    }

    public void setSharing(String pSharing) {
        this.mSharing = pSharing;
    }

    public String getCreatedAt() {
        return this.mCreatedAt;
    }

    public void setCreatedAt(String pCreatedAt) {
        this.mCreatedAt = pCreatedAt;
    }

    public String getRelease() {
        return this.mRelease;
    }

    public void setRelease(String pRelease) {
        this.mRelease = pRelease;
    }

    public String getKind() {
        return this.mKind;
    }

    public void setKind(String pKind) {
        this.mKind = pKind;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String pTitle) {
        this.mTitle = pTitle;
    }

    public String getType() {
        return this.mType;
    }

    public void setType(String pType) {
        this.mType = pType;
    }

    public String getPurchaseTitle() {
        return this.mPurchaseTitle;
    }

    public void setPurchaseTitle(String pPurchaseTitle) {
        this.mPurchaseTitle = pPurchaseTitle;
    }

    public String getArtworkUrl() {
        return this.mArtworkUrl;
    }

    public void setArtworkUrl(String pArtworkUrl) {
        this.mArtworkUrl = pArtworkUrl;
    }

    public String getEan() {
        return this.mEan;
    }

    public void setEan(String pEan) {
        this.mEan = pEan;
    }

    public boolean isStreamable() {
        return this.mStreamable;
    }

    public void setStreamable(boolean pStreamable) {
        this.mStreamable = pStreamable;
    }

    public String getEmbeddableBy() {
        return this.mEmbeddableBy;
    }

    public void setEmbeddableBy(String pEmbeddableBy) {
        this.mEmbeddableBy = pEmbeddableBy;
    }

    public int getLabelId() {
        return this.mLabelId;
    }

    public void setLabelId(int pLabelId) {
        this.mLabelId = pLabelId;
    }

    public User getUser() {
        return this.mUser;
    }

    public void setUser(User pUser) {
        this.mUser = pUser;
    }

    public List<Track> getTracks() {
        return this.mTracks;
    }

    public void setTracks(List<Track> pTracks) {
        this.mTracks = pTracks;
    }
}
