package com.dreamdigitizers.androidsoundcloudapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quota {
    @SerializedName("unlimited_upload_quota")
    @Expose
    private boolean mUnlimitedUploadQuota;

    @SerializedName("upload_seconds_used")
    @Expose
    private int mUploadSecondsUsed;

    @SerializedName("upload_seconds_left")
    @Expose
    private int mUploadSecondsLeft;

    public boolean isUnlimitedUploadQuota() {
        return this.mUnlimitedUploadQuota;
    }

    public void setUnlimitedUploadQuota(boolean pUnlimitedUploadQuota) {
        this.mUnlimitedUploadQuota = pUnlimitedUploadQuota;
    }

    public int getUploadSecondsUsed() {
        return this.mUploadSecondsUsed;
    }

    public void setUploadSecondsUsed(int pUploadSecondsUsed) {
        this.mUploadSecondsUsed = pUploadSecondsUsed;
    }

    public int getUploadSecondsLeft() {
        return this.mUploadSecondsLeft;
    }

    public void setUploadSecondsLeft(int pUploadSecondsLeft) {
        this.mUploadSecondsLeft = pUploadSecondsLeft;
    }
}
