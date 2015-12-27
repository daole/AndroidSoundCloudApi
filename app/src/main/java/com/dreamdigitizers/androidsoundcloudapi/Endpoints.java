package com.dreamdigitizers.androidsoundcloudapi;

public class Endpoints {
    public static final String CONNECT_URL = "https://soundcloud.com/connect"
            + "?client_id=%s"
            + "&redirect_uri=%s"
            + "&response_type=%s"
            + "&scope=%s"
            + "&display=%s";

    public static final String API_BASE_URL = "https://api.soundcloud.com";

    public static final String TOKEN = "/oauth2/token";

    public static final String TRACKS  = "/tracks";
    public static final String TRACK_DETAILS = "/tracks/%d";
    public static final String TRACK_COMMENTS = "/tracks/%d/comments";
    public static final String TRACK_FAVORITERS = "/tracks/%d/favoriters";
    public static final String TRACK_PLAYS = "/tracks/%d/plays";
    public static final String TRACK_PERMISSIONS = "/tracks/%d/permissions";

    public static final String PLAYLISTS = "/playlists";
    public static final String PLAYLIST_DETAILS = "/playlists/%d";
    public static final String PLAYLIST_TRACKS = "/playlists/%d/tracks";

    public static final String USERS = "/users";
    public static final String USER_DETAILS = "/users/%d";
    public static final String USER_FOLLOWINGS = "/users/%d/followings";
    public static final String USER_FOLLOWERS = "/users/%d/followers";
    public static final String USER_TRACKS = "/users/%d/tracks";
    public static final String USER_FAVORITES = "/users/%d/favorites";
    public static final String USER_PLAYLISTS = "/users/%d/playlists";

    public static final String MY_DETAILS = "/me";
    public static final String MY_CONNECTIONS = "/me/connections";
    public static final String MY_ACTIVITIES = "/me/activities/tracks";
    public static final String MY_EXCLUSIVE_TRACKS = "/me/activities/tracks/exclusive";
    public static final String MY_NEWS = "/me/activities/all/own";
    public static final String MY_TRACKS = "/me/tracks";
    public static final String MY_PLAYLISTS = "/me/playlists";
    public static final String MY_FAVORITES = "/me/favorites";
    public static final String MY_FAVORITE = "/me/favorites/%d";
    public static final String MY_FOLLOWERS = "/me/followers";
    public static final String MY_FOLLOWER = "/me/followers/%d";
    public static final String MY_FOLLOWINGS = "/me/followings";
    public static final String MY_FOLLOWING = "/me/followings/%d";
    public static final String MY_CONFIRMATION = "/me/email-confirmations";
    public static final String MY_FRIENDS = "/me/connections/friends";
    public static final String MY_DEVICES = "/me/devices";

    public static final String SUGGESTED_USERS = "/users/suggested";

    public static final String RESOLVE = "/resolve";

    public static final String SEND_PASSWORD  = "/passwords/reset-instructions";
    public static final String CONNECT = "/connect";
    public static final String FACEBOOK_CONNECT = "/connect/via/facebook";
}
