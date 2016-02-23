package com.dreamdigitizers.androidsoundcloudapi.models.v2;

import com.dreamdigitizers.androidsoundcloudapi.models.Track;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Charts {
    @SerializedName("genre")
    @Expose
    private String mGenre;

    @SerializedName("kind")
    @Expose
    private String mKind;

    @SerializedName("last_updated")
    @Expose
    private String mLastUpdated;

    @SerializedName("collection")
    @Expose
    private List<Collection> mCollection;

    @SerializedName("query_urn")
    @Expose
    private String mQueryUrn;

    @SerializedName("next_href")
    @Expose
    private String mNextHref;

    public String getGenre() {
        return this.mGenre;
    }

    public void setGenre(String pGenre) {
        this.mGenre = pGenre;
    }

    public String getKind() {
        return this.mKind;
    }

    public void setKind(String pKind) {
        this.mKind = pKind;
    }

    public String getLastUpdated() {
        return this.mLastUpdated;
    }

    public void setLastUpdated(String pLastUpdated) {
        this.mLastUpdated = pLastUpdated;
    }

    public List<Collection> getCollection() {
        return this.mCollection;
    }

    public void setCollection(List<Collection> pCollection) {
        this.mCollection = pCollection;
    }

    public String getQueryUrn() {
        return this.mQueryUrn;
    }

    public void setQueryUrn(String pQueryUrn) {
        this.mQueryUrn = pQueryUrn;
    }

    public String getNextHref() {
        return this.mNextHref;
    }

    public void setNextHref(String pNextHref) {
        this.mNextHref = pNextHref;
    }

    public static class Collection {
        @SerializedName("track")
        @Expose
        private Track mTrack;

        @SerializedName("score")
        @Expose
        private double mScore;

        public Track getTrack() {
            return this.mTrack;
        }

        public void setTrack(Track pTrack) {
            this.mTrack = pTrack;
        }

        public double getScore() {
            return this.mScore;
        }

        public void setScore(double pScore) {
            this.mScore = pScore;
        }
    }
}
