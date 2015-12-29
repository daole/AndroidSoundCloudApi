package com.dreamdigitizers.androidsoundcloudapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Token {
    @SerializedName("access_token")
    @Expose
    private String mAccessToken;

    @SerializedName("scope")
    @Expose
    private String mScope;

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public void setAccessToken(String pAccessToken) {
        this.mAccessToken = pAccessToken;
    }

    public String getScope() {
        return this.mScope;
    }

    public void setScope(String pScope) {
        this.mScope = pScope;
    }
}
