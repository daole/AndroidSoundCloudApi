package com.dreamdigitizers.androidsoundcloudapi.models.parameters;

import com.dreamdigitizers.androidsoundcloudapi.models.ModelBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ParameterAddTrackToPlaylist extends ModelBase {
    @SerializedName("playlist")
    @Expose
    private Playlist mPlaylist;

    public Playlist getPlaylist() {
        return this.mPlaylist;
    }

    public void setPlaylist(Playlist pPlaylist) {
        this.mPlaylist = pPlaylist;
    }

    public static class Playlist extends ModelBase {
        @SerializedName("tracks")
        @Expose
        private List<Track> mTracks;

        public List<Track> getTracks() {
            return this.mTracks;
        }

        public void setTracks(List<Track> pTracks) {
            this.mTracks = pTracks;
        }

        public static class Track {
            @SerializedName("id")
            @Expose
            private int mId;

            public int getId() {
                return this.mId;
            }

            public void setId(int pId) {
                this.mId = pId;
            }
        }
    }
}
