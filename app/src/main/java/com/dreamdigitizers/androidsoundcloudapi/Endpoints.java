package com.dreamdigitizers.androidsoundcloudapi;

class Endpoints {
    static final String CONNECT_URL = "https://soundcloud.com/connect"
            + "?client_id=%s"
            + "&redirect_uri=%s"
            + "&response_type=%s"
            + "&scope=%s"
            + "&display=%s"
            + "&state=%s";

    static final String API_BASE_URL = "https://api.soundcloud.com";

    static final String TOKEN = "/oauth2/token";

    static final String USERS = "/users";
    static final String USER_DETAILS = "/users/{id}";
    static final String USER_TRACKS = "/users/{id}/tracks";
    static final String USER_PLAYLISTS = "/users/{id}/playlists";
    static final String USER_COMMENTS = "/users/{id}/comments";
    static final String USER_GROUPS = "/users/{id}/groups";
    static final String USER_WEB_PROFILES = "/users/{id}/web-profiles";
    static final String USER_FOLLOWINGS = "/users/{id}/followings";
    static final String USER_FOLLOWING_DETAILS = "/users/{id}/followings/{childId}";
    static final String USER_FOLLOWERS = "/users/{id}/followers";
    static final String USER_FOLLOWERS_DETAILS = "/users/{id}/followers/{childId}";
    static final String USER_FAVORITES = "/users/{id}/favorites";
    static final String USER_FAVORITE_DETAILS = "/users/{id}/favorites/{childId}";

    static final String TRACKS  = "/tracks";
    static final String TRACK_COMMENTS = "/tracks/{id}/comments";
    static final String TRACK_FAVORITERS = "/tracks/{id}/favoriters";
    static final String TRACK_PLAYS = "/tracks/{id}/plays";
    static final String TRACK_PERMISSIONS = "/tracks/{id}/permissions";

    static final String PLAYLISTS = "/playlists";
    static final String PLAYLIST_DETAILS = "/playlists/{id}";
    static final String PLAYLIST_TRACKS = "/playlists/{id}/tracks";

    static final String MY_DETAILS = "/me";
    static final String MY_CONNECTIONS = "/me/connections";
    static final String MY_ACTIVITIES = "/me/activities/tracks";
    static final String MY_EXCLUSIVE_TRACKS = "/me/activities/tracks/exclusive";
    static final String MY_NEWS = "/me/activities/all/own";
    static final String MY_TRACKS = "/me/tracks";
    static final String MY_PLAYLISTS = "/me/playlists";
    static final String MY_FAVORITES = "/me/favorites";
    static final String MY_FAVORITE = "/me/favorites/{id}";
    static final String MY_FOLLOWERS = "/me/followers";
    static final String MY_FOLLOWER = "/me/followers/{id}";
    static final String MY_FOLLOWINGS = "/me/followings";
    static final String MY_FOLLOWING = "/me/followings/{id}";
    static final String MY_CONFIRMATION = "/me/email-confirmations";
    static final String MY_FRIENDS = "/me/connections/friends";
    static final String MY_DEVICES = "/me/devices";

    static final String SUGGESTED_USERS = "/users/suggested";

    static final String RESOLVE = "/resolve";

    static final String SEND_PASSWORD  = "/passwords/reset-instructions";
    static final String CONNECT = "/connect";
    static final String FACEBOOK_CONNECT = "/connect/via/facebook";
}
