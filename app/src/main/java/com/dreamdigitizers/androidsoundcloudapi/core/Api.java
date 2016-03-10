package com.dreamdigitizers.androidsoundcloudapi.core;

import android.text.TextUtils;
import android.util.Log;

import com.dreamdigitizers.androidsoundcloudapi.models.App;
import com.dreamdigitizers.androidsoundcloudapi.models.Playlists;
import com.dreamdigitizers.androidsoundcloudapi.models.Tracks;
import com.dreamdigitizers.androidsoundcloudapi.models.Comment;
import com.dreamdigitizers.androidsoundcloudapi.models.Group;
import com.dreamdigitizers.androidsoundcloudapi.models.Me;
import com.dreamdigitizers.androidsoundcloudapi.models.Playlist;
import com.dreamdigitizers.androidsoundcloudapi.models.Token;
import com.dreamdigitizers.androidsoundcloudapi.models.Track;
import com.dreamdigitizers.androidsoundcloudapi.models.User;
import com.dreamdigitizers.androidsoundcloudapi.models.WebProfile;
import com.dreamdigitizers.androidsoundcloudapi.models.parameters.ParameterAddTrackToPlaylist;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;

class Api implements IApi {
    private static final String TAG = Api.class.getSimpleName();

    private static final String ERROR_MESSAGE__NOT_YET_INITIALIZED = "Api.initialize() has not yet called.";

    private static Api instance;

    private IApi mApi;

    public static void initialize(final String pClientId) {
        Api.initialize(pClientId, null);
    }

    public static void initialize(final String pClientId, final String pOauthToken) {
        if (Api.instance == null) {
            Api.instance = new Api(pClientId, pOauthToken);
        }
    }

    public static void dispose() {
        if (Api.instance != null) {
            Api.instance = null;
        }
    }

    public static Api getInstance() {
        if(Api.instance == null) {
            throw new IllegalStateException(Api.ERROR_MESSAGE__NOT_YET_INITIALIZED);
        }
        return Api.instance;
    }

    public static String getConnectionString(
            String pClientId,
            String pRedirectUri,
            String pResponseType,
            String pScope,
            String pDisplay,
            String pState,
            boolean pIsLogout) {
        String url = String.format(
                IApi.API_URL__CONNECT,
                pClientId,
                pRedirectUri,
                pResponseType,
                pScope,
                pDisplay,
                pState);
        if (pIsLogout) {
            try {
                url = IApi.API_URL__LOGOUT + URLEncoder.encode(url, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return url;
    }

    private Api(final String pClientId, final String pOauthToken) {
        OkHttpClient okHttpClient = new OkHttpClient();

        okHttpClient.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain pChain) throws IOException {
                Request request = pChain.request();
                HttpUrl.Builder builder = request.httpUrl().newBuilder();
                builder.addQueryParameter("client_id", pClientId);
                if (!TextUtils.isEmpty(pOauthToken)) {
                    builder.addQueryParameter("oauth_token", pOauthToken);
                }
                HttpUrl httpUrl = builder.build();
                Log.d(Api.TAG, httpUrl.url().toString());
                request = request.newBuilder().url(httpUrl).build();
                Response response = pChain.proceed(request);
                String bodyString = response.body().string();
                response = response.newBuilder()
                        .body(ResponseBody.create(response.body().contentType(), bodyString))
                        .build();
                Log.d(Api.TAG, bodyString);
                return response;
            }
        });

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(IApi.API_URL__BASE)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        this.mApi = retrofit.create(IApi.class);
    }

    @Override
    public Call<Token> token(
            String pClientId,
            String pClientSecret,
            String pRedirectUri,
            String pGrantType,
            String pCode) {
        return this.mApi.token(
                pClientId,
                pClientSecret,
                pRedirectUri,
                pGrantType,
                pCode);
    }

    @Override
    public Observable<Token> tokenRx(
            String pClientId,
            String pClientSecret,
            String pRedirectUri,
            String pGrantType,
            String pCode) {
        return this.mApi.tokenRx(
                pClientId,
                pClientSecret,
                pRedirectUri,
                pGrantType,
                pCode);
    }

    @Override
    public Call<List<User>> users(String pQ) {
        return this.mApi.users(pQ);
    }

    @Override
    public Observable<List<User>> usersRx(String pQ) {
        return this.mApi.usersRx(pQ);
    }

    @Override
    public Call<User> user(int pId) {
        return this.mApi.user(pId);
    }

    @Override
    public Observable<User> userRx(int pId) {
        return this.mApi.userRx(pId);
    }

    @Override
    public Call<List<Track>> userTracks(int pId) {
        return this.mApi.userTracks(pId);
    }

    @Override
    public Observable<List<Track>> userTracksRx(int pId) {
        return this.mApi.userTracksRx(pId);
    }

    @Override
    public Call<List<Playlist>> userPlaylists(int pId) {
        return this.mApi.userPlaylists(pId);
    }

    @Override
    public Call<Playlists> userPlaylists(int pId, int pLinkedPartitioning, int pLimit, int pOffset) {
        return this.mApi.userPlaylists(pId, pLinkedPartitioning, pLimit, pOffset);
    }

    @Override
    public Observable<List<Playlist>> userPlaylistsRx(int pId) {
        return this.mApi.userPlaylistsRx(pId);
    }

    @Override
    public Observable<Playlists> userPlaylistsRx(int pId, int pLinkedPartitioning, int pLimit, int pOffset) {
        return this.mApi.userPlaylistsRx(pId, pLinkedPartitioning, pLimit, pOffset);
    }

    @Override
    public Call<List<Comment>> userComments(int pId) {
        return this.mApi.userComments(pId);
    }

    @Override
    public Observable<List<Comment>> userCommentsRx(int pId) {
        return this.mApi.userCommentsRx(pId);
    }

    @Override
    public Call<List<Group>> userGroups(int pId) {
        return this.mApi.userGroups(pId);
    }

    @Override
    public Observable<List<Group>> userGroupsRx(int pId) {
        return this.mApi.userGroupsRx(pId);
    }

    @Override
    public Call<List<WebProfile>> userWebProfiles(int pId) {
        return this.mApi.userWebProfiles(pId);
    }

    @Override
    public Observable<List<WebProfile>> userWebProfilesRx(int pId) {
        return this.mApi.userWebProfilesRx(pId);
    }

    @Override
    public Call<List<User>> userFollowings(int pId) {
        return this.mApi.userFollowings(pId);
    }

    @Override
    public Observable<List<User>> userFollowingsRx(int pId) {
        return this.mApi.userFollowingsRx(pId);
    }

    @Override
    public Call<List<User>> userFollowers(int pId) {
        return this.mApi.userFollowers(pId);
    }

    @Override
    public Observable<List<User>> userFollowersRx(int pId) {
        return this.mApi.userFollowersRx(pId);
    }

    @Override
    public Call<List<Track>> userFavorites(int pId) {
        return this.mApi.userFavorites(pId);
    }

    @Override
    public Call<Tracks> userFavorites(int pId, int pLinkedPartitioning, int pLimit, String pOffset) {
        return this.mApi.userFavorites(pId, pLinkedPartitioning, pLimit, pOffset);
    }

    @Override
    public Observable<List<Track>> userFavoritesRx(int pId) {
        return this.mApi.userFavoritesRx(pId);
    }

    @Override
    public Observable<Tracks> userFavoritesRx(int pId, int pLinkedPartitioning, int pLimit, String pOffset) {
        return this.mApi.userFavoritesRx(pId, pLinkedPartitioning, pLimit, pOffset);
    }

    @Override
    public Call<List<Track>> tracks() {
        return this.mApi.tracks();
    }

    @Override
    public Call<List<Track>> tracks(String pQ) {
        return this.mApi.tracks(pQ);
    }

    @Override
    public Call<List<Track>> tracks(
            String pQ,
            String pTags,
            String pFilter,
            String pLicense,
            String pBpmFrom,
            String pBpmTo,
            String pDurationFrom,
            String pDurationTo,
            String pCreatedAtFrom,
            String pCreatedAtTo,
            String pIds,
            String pGenres,
            String pTypes) {
        return this.mApi.tracks(
                pQ,
                pTags,
                pFilter,
                pLicense,
                pBpmFrom,
                pBpmTo,
                pDurationFrom,
                pDurationTo,
                pCreatedAtFrom,
                pCreatedAtTo,
                pIds,
                pGenres,
                pTypes);
    }

    @Override
    public Call<Tracks> tracks(int pLinkedPartitioning, int pLimit, int pOffset) {
        return this.mApi.tracks(pLinkedPartitioning, pLimit, pOffset);
    }

    @Override
    public Call<Tracks> tracks(int pLinkedPartitioning, int pLimit, int pOffset, String pQ) {
        return this.mApi.tracks(pLinkedPartitioning, pLimit, pOffset, pQ);
    }

    @Override
    public Call<Tracks> tracks(
            int pLinkedPartitioning,
            int pLimit,
            int pOffset,
            String pQ,
            String pTags,
            String pFilter,
            String pLicense,
            String pBpmFrom,
            String pBpmTo,
            String pDurationFrom,
            String pDurationTo,
            String pCreatedAtFrom,
            String pCreatedAtTo,
            String pIds,
            String pGenres,
            String pTypes) {
        return this.mApi.tracks(
                pLinkedPartitioning,
                pLimit,
                pOffset,
                pQ,
                pTags,
                pFilter,
                pLicense,
                pBpmFrom,
                pBpmTo,
                pDurationFrom,
                pDurationTo,
                pCreatedAtFrom,
                pCreatedAtTo,
                pIds,
                pGenres,
                pTypes);
    }

    @Override
    public Observable<List<Track>> tracksRx() {
        return this.mApi.tracksRx();
    }

    @Override
    public Observable<List<Track>> tracksRx(String pQ) {
        return this.mApi.tracksRx(pQ);
    }

    @Override
    public Observable<List<Track>> tracksRx(
            String pQ,
            String pTags,
            String pFilter,
            String pLicense,
            String pBpmFrom,
            String pBpmTo,
            String pDurationFrom,
            String pDurationTo,
            String pCreatedAtFrom,
            String pCreatedAtTo,
            String pIds,
            String pGenres,
            String pTypes) {
        return this.mApi.tracksRx(
                pQ,
                pTags,
                pFilter,
                pLicense,
                pBpmFrom,
                pBpmTo,
                pDurationFrom,
                pDurationTo,
                pCreatedAtFrom,
                pCreatedAtTo,
                pIds,
                pGenres,
                pTypes);
    }

    @Override
    public Observable<Tracks> tracksRx(int pLinkedPartitioning, int pLimit, int pOffset) {
        return this.mApi.tracksRx(pLinkedPartitioning, pLimit, pOffset);
    }

    @Override
    public Observable<Tracks> tracksRx(int pLinkedPartitioning, int pLimit, int pOffset, String pQ) {
        return this.mApi.tracksRx(pLinkedPartitioning, pLimit, pOffset, pQ);
    }

    @Override
    public Observable<Tracks> tracksRx(
            int pLinkedPartitioning,
            int pLimit,
            int pOffset,
            String pQ,
            String pTags,
            String pFilter,
            String pLicense,
            String pBpmFrom,
            String pBpmTo,
            String pDurationFrom,
            String pDurationTo,
            String pCreatedAtFrom,
            String pCreatedAtTo,
            String pIds,
            String pGenres,
            String pTypes) {
        return this.mApi.tracksRx(
                pLinkedPartitioning,
                pLimit,
                pOffset,
                pQ,
                pTags,
                pFilter,
                pLicense,
                pBpmFrom,
                pBpmTo,
                pDurationFrom,
                pDurationTo,
                pCreatedAtFrom,
                pCreatedAtTo,
                pIds,
                pGenres,
                pTypes);
    }

    @Override
    public Call<Track> track(int pId) {
        return this.mApi.track(pId);
    }

    @Override
    public Observable<Track> trackRx(int pId) {
        return this.mApi.trackRx(pId);
    }

    @Override
    public Call<List<Comment>> trackComments(int pId) {
        return this.mApi.trackComments(pId);
    }

    @Override
    public Observable<List<Comment>> trackCommentsRx(int pId) {
        return this.mApi.trackCommentsRx(pId);
    }

    @Override
    public Call<List<User>> trackFavoriters(int pId) {
        return this.mApi.trackFavoriters(pId);
    }

    @Override
    public Observable<List<User>> trackFavoritersRx(int pId) {
        return this.mApi.trackFavoritersRx(pId);
    }

    @Override
    public Call<List<Playlist>> playlists(String pQ, String pRepresentation) {
        return this.mApi.playlists(pQ, pRepresentation);
    }

    @Override
    public Observable<List<Playlist>> playlistsRx(String pQ, String pRepresentation) {
        return this.mApi.playlistsRx(pQ, pRepresentation);
    }

    @Override
    public Call<Playlist> playlists(String pTitle, String pSharing, String pResourceId, String pResourceType) {
        return this.mApi.playlists(pTitle, pSharing, pResourceId, pResourceType);
    }

    @Override
    public Observable<Playlist> playlistsRx(String pTitle, String pSharing, String pResourceId, String pResourceType) {
        return this.mApi.playlistsRx(pTitle, pSharing, pResourceId, pResourceType);
    }

    @Override
    public Call<Playlist> playlist(int pId) {
        return this.mApi.playlist(pId);
    }

    @Override
    public Observable<Playlist> playlistRx(int pId) {
        return this.mApi.playlistRx(pId);
    }

    @Override
    public Call<Playlist> playlist(int pId, ParameterAddTrackToPlaylist pParameter) {
        return this.mApi.playlist(pId, pParameter);
    }

    @Override
    public Observable<Playlist> playlistRx(int pId, ParameterAddTrackToPlaylist pParameter) {
        return this.mApi.playlistRx(pId, pParameter);
    }

    @Override
    public Call<Void> deletePlaylist(int pId) {
        return this.mApi.deletePlaylist(pId);
    }

    @Override
    public Observable<Void> deletePlaylistRx(int pId) {
        return this.mApi.deletePlaylistRx(pId);
    }

    @Override
    public Call<List<Group>> groups(String pQ) {
        return this.mApi.groups(pQ);
    }

    @Override
    public Observable<List<Group>> groupsRx(String pQ) {
        return this.mApi.groupsRx(pQ);
    }

    @Override
    public Call<Group> group(int pId) {
        return this.mApi.group(pId);
    }

    @Override
    public Observable<Group> groupRx(int pId) {
        return this.mApi.groupRx(pId);
    }

    @Override
    public Call<List<User>> groupModerators(int pId) {
        return this.mApi.groupModerators(pId);
    }

    @Override
    public Observable<List<User>> groupModeratorsRx(int pId) {
        return this.mApi.groupModeratorsRx(pId);
    }

    @Override
    public Call<List<User>> groupMembers(int pId) {
        return this.mApi.groupMembers(pId);
    }

    @Override
    public Observable<List<User>> groupMembersRx(int pId) {
        return this.mApi.groupMembersRx(pId);
    }

    @Override
    public Call<List<User>> groupContributors(int pId) {
        return this.mApi.groupContributors(pId);
    }

    @Override
    public Observable<List<User>> groupContributorsRx(int pId) {
        return this.mApi.groupContributorsRx(pId);
    }

    @Override
    public Call<List<User>> groupUsers(int pId) {
        return this.mApi.groupUsers(pId);
    }

    @Override
    public Observable<List<User>> groupUsersRx(int pId) {
        return this.mApi.groupUsersRx(pId);
    }

    @Override
    public Call<List<Track>> groupTracks(int pId) {
        return this.mApi.groupTracks(pId);
    }

    @Override
    public Observable<List<Track>> groupTracksRx(int pId) {
        return this.mApi.groupTracksRx(pId);
    }

    @Override
    public Call<List<Comment>> comments() {
        return this.mApi.comments();
    }

    @Override
    public Observable<List<Comment>> commentsRx() {
        return this.mApi.commentsRx();
    }

    @Override
    public Call<Comment> comment(int pId) {
        return this.mApi.comment(pId);
    }

    @Override
    public Observable<Comment> commentRx(int pId) {
        return this.mApi.commentRx(pId);
    }

    @Override
    public Call<List<App>> apps() {
        return this.mApi.apps();
    }

    @Override
    public Observable<List<App>> appsRx() {
        return this.mApi.appsRx();
    }

    @Override
    public Call<App> app(int pId) {
        return this.mApi.app(pId);
    }

    @Override
    public Observable<App> appRx(int pId) {
        return this.mApi.appRx(pId);
    }

    @Override
    public Call<Me> me(String pAccessToken) {
        return this.mApi.me(pAccessToken);
    }

    @Override
    public Observable<Me> meRx(String pAccessToken) {
        return this.mApi.meRx(pAccessToken);
    }

    @Override
    public Call<Void> favorite(int pId) {
        return this.mApi.favorite(pId);
    }

    @Override
    public Observable<Void> favoriteRx(int pId) {
        return this.mApi.favoriteRx(pId);
    }

    @Override
    public Call<Void> unfavorite(int pId) {
        return this.mApi.unfavorite(pId);
    }

    @Override
    public Observable<Void> unfavoriteRx(int pId) {
        return this.mApi.unfavoriteRx(pId);
    }

    @Override
    public Call<List<Integer>> trackLikes() {
        return this.mApi.trackLikes();
    }

    @Override
    public Observable<List<Integer>> trackLikesRx() {
        return this.mApi.trackLikesRx();
    }
}
