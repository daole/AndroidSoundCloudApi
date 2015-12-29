package com.dreamdigitizers.androidsoundcloudapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Me extends User {
    @SerializedName("upload_seconds_left")
    @Expose
    private int mUploadSecondsLeft;

    @SerializedName("private_tracks_count")
    @Expose
    private int mPrivateTracksCount;

    @SerializedName("private_playlists_count")
    @Expose
    private int mPrivatePlaylistsCount;

    @SerializedName("primary_email_confirmed")
    @Expose
    private boolean mPrimaryEmailConfirmed;

    @SerializedName("locale")
    @Expose
    private String mLocale;

    @SerializedName("quota")
    @Expose
    private Quota mQuota;

    public int getUploadSecondsLeft() {
        return this.mUploadSecondsLeft;
    }

    public void setUploadSecondsLeft(int pUploadSecondsLeft) {
        this.mUploadSecondsLeft = pUploadSecondsLeft;
    }

    public Quota getQuota() {
        return this.mQuota;
    }

    public void setQuota(Quota pQuota) {
        this.mQuota = pQuota;
    }

    public int getPrivateTracksCount() {
        return this.mPrivateTracksCount;
    }

    public void setPrivateTracksCount(int pPrivateTracksCount) {
        this.mPrivateTracksCount = pPrivateTracksCount;
    }

    public int getPrivatePlaylistsCount() {
        return this.mPrivatePlaylistsCount;
    }

    public void setPrivatePlaylistsCount(int pPrivatePlaylistsCount) {
        this.mPrivatePlaylistsCount = pPrivatePlaylistsCount;
    }

    public boolean isPrimaryEmailConfirmed() {
        return this.mPrimaryEmailConfirmed;
    }

    public void setPrimaryEmailConfirmed(boolean pPrimaryEmailConfirmed) {
        this.mPrimaryEmailConfirmed = pPrimaryEmailConfirmed;
    }

    public String getLocale() {
        return this.mLocale;
    }

    public void setLocale(String pLocale) {
        this.mLocale = pLocale;
    }
}
