package com.dreamdigitizers.androidsoundcloudapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comment extends ModelBase {
    @SerializedName("kind")
    @Expose
    private String mKind;

    @SerializedName("id")
    @Expose
    private int mId;

    @SerializedName("created_at")
    @Expose
    private String mCreatedAt;

    @SerializedName("user_id")
    @Expose
    private int mUserId;

    @SerializedName("track_id")
    @Expose
    private int mTrackId;

    @SerializedName("timestamp")
    @Expose
    private int mTimestamp;

    @SerializedName("body")
    @Expose
    private String mBody;

    @SerializedName("uri")
    @Expose
    private String mUri;

    @SerializedName("user")
    @Expose
    private User mUser;

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

    public int getUserId() {
        return this.mUserId;
    }

    public void setUserId(int pUserId) {
        this.mUserId = pUserId;
    }

    public int getTrackId() {
        return this.mTrackId;
    }

    public void setTrackId(int pTrackId) {
        this.mTrackId = pTrackId;
    }

    public int getTimestamp() {
        return this.mTimestamp;
    }

    public void setTimestamp(int pTimestamp) {
        this.mTimestamp = pTimestamp;
    }

    public String getBody() {
        return this.mBody;
    }

    public void setBody(String pBody) {
        this.mBody = pBody;
    }

    public String getUri() {
        return this.mUri;
    }

    public void setUri(String pUri) {
        this.mUri = pUri;
    }

    public User getUser() {
        return this.mUser;
    }

    public void setUser(User pUser) {
        this.mUser = pUser;
    }

}
