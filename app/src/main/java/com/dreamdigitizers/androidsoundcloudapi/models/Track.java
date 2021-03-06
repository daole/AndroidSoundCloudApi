package com.dreamdigitizers.androidsoundcloudapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Track extends ModelBase {
    @SerializedName("id")
    @Expose
    private int mId;

    @SerializedName("kind")
    @Expose
    private String mKind;

    @SerializedName("created_at")
    @Expose
    private String mCreatedAt;

    @SerializedName("user_id")
    @Expose
    private int mUserId;

    @SerializedName("duration")
    @Expose
    private int mDuration;

    @SerializedName("commentable")
    @Expose
    private boolean mCommentable;

    @SerializedName("state")
    @Expose
    private String mState;

    @SerializedName("original_content_size")
    @Expose
    private int mOriginalContentSize;

    @SerializedName("last_modified")
    @Expose
    private String mLastModified;

    @SerializedName("sharing")
    @Expose
    private String mSharing;

    @SerializedName("tag_list")
    @Expose
    private String mTagList;

    @SerializedName("permalink")
    @Expose
    private String mPermalink;

    @SerializedName("streamable")
    @Expose
    private boolean mStreamable;

    @SerializedName("embeddableBy")
    @Expose
    private String mEmbeddableBy;

    @SerializedName("downloadable")
    @Expose
    private boolean mDownloadable;

    @SerializedName("purchase_url")
    @Expose
    private String mPurchaseUrl;

    @SerializedName("label_id")
    @Expose
    private int mLabelId;

    @SerializedName("purchase_title")
    @Expose
    private String mPurchaseTitle;

    @SerializedName("genre")
    @Expose
    private String mGenre;

    @SerializedName("title")
    @Expose
    private String mTitle;

    @SerializedName("description")
    @Expose
    private String mDescription;

    @SerializedName("label_name")
    @Expose
    private String mLabelName;

    @SerializedName("release")
    @Expose
    private String mRelease;

    @SerializedName("track_type")
    @Expose
    private String mTrackType;

    @SerializedName("key_signature")
    @Expose
    private String mKeySignature;

    @SerializedName("isrc")
    @Expose
    private String mIsrc;

    @SerializedName("video_url")
    @Expose
    private String mVideoUrl;

    @SerializedName("bpm")
    @Expose
    private String mBpm;

    @SerializedName("release_year")
    @Expose
    private int mReleaseYear;

    @SerializedName("release_month")
    @Expose
    private int mReleaseMonth;

    @SerializedName("release_day")
    @Expose
    private int mReleaseDay;

    @SerializedName("original_format")
    @Expose
    private String mOriginalFormat;

    @SerializedName("license")
    @Expose
    private String mLicense;

    @SerializedName("uri")
    @Expose
    private String mUri;

    @SerializedName("user")
    @Expose
    private User mUser;

    @SerializedName("created_with")
    @Expose
    private App mCreatedWith;

    @SerializedName("permalink_url")
    @Expose
    private String mPermalinkUrl;

    @SerializedName("artwork_url")
    @Expose
    private String mArtworkUrl;

    @SerializedName("waveform_url")
    @Expose
    private String mWaveformUrl;

    @SerializedName("stream_url")
    @Expose
    private String mStreamUrl;

    @SerializedName("playback_count")
    @Expose
    private int mPlaybackCount;

    @SerializedName("download_count")
    @Expose
    private int mDownloadCount;

    @SerializedName("favoritings_count")
    @Expose
    private int mFavoritingsCount;

    @SerializedName("comment_count")
    @Expose
    private int mCommentCount;

    @SerializedName("attachments_uri")
    @Expose
    private String mAttachmentsUri;

    @SerializedName("user_favorite")
    @Expose
    private boolean mUserFavorite;

    @Override
    public boolean equals(Object pObject) {
        if (pObject == null) {
            return false;
        }
        if (pObject == this) {
            return true;
        }
        if (!(pObject instanceof Track)) {
            return false;
        }
        Track track = (Track) pObject;
        return this.getId() == track.getId();
    }

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

    public String getCreatedAt() {
        return this.mCreatedAt;
    }

    public void setCreatedAt(String pCreatedAt) {
        this.mCreatedAt = pCreatedAt;
    }

    public int getUserId() {
        return this.mUserId;
    }

    public void setUserId(int pUserId) {
        this.mUserId = pUserId;
    }

    public int getDuration() {
        return this.mDuration;
    }

    public void setDuration(int pDuration) {
        this.mDuration = pDuration;
    }

    public boolean getCommentable() {
        return this.mCommentable;
    }

    public void setCommentable(boolean pCommentable) {
        this.mCommentable = pCommentable;
    }

    public String getState() {
        return this.mState;
    }

    public void setState(String pState) {
        this.mState = pState;
    }

    public int getOriginalContentSize() {
        return this.mOriginalContentSize;
    }

    public void setOriginalContentSize(int pOriginalContentSize) {
        this.mOriginalContentSize = pOriginalContentSize;
    }

    public String getLastModified() {
        return this.mLastModified;
    }

    public void setLastModified(String pLastModified) {
        this.mLastModified = pLastModified;
    }

    public String getSharing() {
        return this.mSharing;
    }

    public void setSharing(String pSharing) {
        this.mSharing = pSharing;
    }

    public String getTagList() {
        return this.mTagList;
    }

    public void setTagList(String pTagList) {
        this.mTagList = pTagList;
    }

    public String getPermalink() {
        return this.mPermalink;
    }

    public void setPermalink(String pPermalink) {
        this.mPermalink = pPermalink;
    }

    public boolean getStreamable() {
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

    public boolean getDownloadable() {
        return this.mDownloadable;
    }

    public void setDownloadable(boolean pDownloadable) {
        this.mDownloadable = pDownloadable;
    }

    public String getPurchaseUrl() {
        return this.mPurchaseUrl;
    }

    public void setPurchaseUrl(String pPurchaseUrl) {
        this.mPurchaseUrl = pPurchaseUrl;
    }

    public int getLabelId() {
        return this.mLabelId;
    }

    public void setLabelId(int pLabelId) {
        this.mLabelId = pLabelId;
    }

    public String getPurchaseTitle() {
        return this.mPurchaseTitle;
    }

    public void setPurchaseTitle(String pPurchaseTitle) {
        this.mPurchaseTitle = pPurchaseTitle;
    }

    public String getGenre() {
        return this.mGenre;
    }

    public void setGenre(String pGenre) {
        this.mGenre = pGenre;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String pTitle) {
        this.mTitle = pTitle;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public void setDescription(String pDescription) {
        this.mDescription = pDescription;
    }

    public String getLabelName() {
        return this.mLabelName;
    }

    public void setLabelName(String pLabelName) {
        this.mLabelName = pLabelName;
    }

    public String getRelease() {
        return this.mRelease;
    }

    public void setRelease(String pRelease) {
        this.mRelease = pRelease;
    }

    public String getTrackType() {
        return this.mTrackType;
    }

    public void setTrackType(String pTrackType) {
        this.mTrackType = pTrackType;
    }

    public String getKeySignature() {
        return this.mKeySignature;
    }

    public void setKeySignature(String pKeySignature) {
        this.mKeySignature = pKeySignature;
    }

    public String getIsrc() {
        return this.mIsrc;
    }

    public void setIsrc(String pIsrc) {
        this.mIsrc = pIsrc;
    }

    public String getVideoUrl() {
        return this.mVideoUrl;
    }

    public void setVideoUrl(String pVideoUrl) {
        this.mVideoUrl = pVideoUrl;
    }

    public String getBpm() {
        return this.mBpm;
    }

    public void setBpm(String pBpm) {
        this.mBpm = pBpm;
    }

    public int getReleaseYear() {
        return this.mReleaseYear;
    }

    public void setReleaseYear(int pReleaseYear) {
        this.mReleaseYear = pReleaseYear;
    }

    public int getReleaseMonth() {
        return this.mReleaseMonth;
    }

    public void setReleaseMonth(int pReleaseMonth) {
        this.mReleaseMonth = pReleaseMonth;
    }

    public int getReleaseDay() {
        return this.mReleaseDay;
    }

    public void setReleaseDay(int pReleaseDay) {
        this.mReleaseDay = pReleaseDay;
    }

    public String getOriginalFormat() {
        return this.mOriginalFormat;
    }

    public void setOriginalFormat(String pOriginalFormat) {
        this.mOriginalFormat = pOriginalFormat;
    }

    public String getLicense() {
        return this.mLicense;
    }

    public void setLicense(String pLicense) {
        this.mLicense = pLicense;
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

    public String getArtworkUrl() {
        return this.mArtworkUrl;
    }

    public void setArtworkUrl(String pArtworkUrl) {
        this.mArtworkUrl = pArtworkUrl;
    }

    public String getWaveformUrl() {
        return this.mWaveformUrl;
    }

    public void setWaveformUrl(String pWaveformUrl) {
        this.mWaveformUrl = pWaveformUrl;
    }

    public String getStreamUrl() {
        return this.mStreamUrl;
    }

    public void setStreamUrl(String pStreamUrl) {
        this.mStreamUrl = pStreamUrl;
    }

    public int getPlaybackCount() {
        return this.mPlaybackCount;
    }

    public void setPlaybackCount(int pPlaybackCount) {
        this.mPlaybackCount = pPlaybackCount;
    }

    public int getDownloadCount() {
        return this.mDownloadCount;
    }

    public void setDownloadCount(int pDownloadCount) {
        this.mDownloadCount = pDownloadCount;
    }

    public int getFavoritingsCount() {
        return this.mFavoritingsCount;
    }

    public void setFavoritingsCount(int pFavoritingsCount) {
        this.mFavoritingsCount = pFavoritingsCount;
    }

    public int getCommentCount() {
        return this.mCommentCount;
    }

    public void setCommentCount(int pCommentCount) {
        this.mCommentCount = pCommentCount;
    }

    public String getAttachmentsUri() {
        return this.mAttachmentsUri;
    }

    public void setAttachmentsUri(String pAttachmentsUri) {
        this.mAttachmentsUri = pAttachmentsUri;
    }

    public User getUser() {
        return this.mUser;
    }

    public void setUser(User pUser) {
        this.mUser = pUser;
    }

    public App getCreatedWith() {
        return mCreatedWith;
    }

    public void setCreatedWith(App pCreatedWith) {
        this.mCreatedWith = pCreatedWith;
    }

    public boolean getUserFavorite() {
        return this.mUserFavorite;
    }

    public void setUserFavorite(boolean pUserFavorite) {
        this.mUserFavorite = pUserFavorite;
    }
}
