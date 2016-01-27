package com.dreamdigitizers.androidsoundcloudapi.core;

import android.text.TextUtils;

import com.dreamdigitizers.androidsoundcloudapi.models.App;
import com.dreamdigitizers.androidsoundcloudapi.models.Comment;
import com.dreamdigitizers.androidsoundcloudapi.models.Group;
import com.dreamdigitizers.androidsoundcloudapi.models.Me;
import com.dreamdigitizers.androidsoundcloudapi.models.Playlist;
import com.dreamdigitizers.androidsoundcloudapi.models.Token;
import com.dreamdigitizers.androidsoundcloudapi.models.Track;
import com.dreamdigitizers.androidsoundcloudapi.models.User;
import com.dreamdigitizers.androidsoundcloudapi.models.WebProfile;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;

class Api implements IApi {
    private static final String ERROR_MESSAGE__NOT_YET_INITIALIZED = "Api.initialize() has not yet called.";

    private static Api instance;

    private IApi mApis;

    public static void initialize(final String pClientId) {
        Api.initialize(pClientId, null);
    }

    public static void initialize(final String pClientId, final String pOauthToken) {
        if (Api.instance == null) {
            Api.instance = new Api(pClientId, pOauthToken);
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
            String pState) {
        return String.format(
                IApi.API_URL__CONNECT,
                pClientId,
                pRedirectUri,
                pResponseType,
                pScope,
                pDisplay,
                pState);
    }

    private Api(final String pClientId, final String pOauthToken) {
        OkHttpClient okHttpClient = new OkHttpClient();

        okHttpClient.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain pChain) throws IOException {
                Request request = pChain.request();
                HttpUrl.Builder builder = request.httpUrl().newBuilder();
                builder.addQueryParameter("client_id", pClientId);
                if(!TextUtils.isEmpty(pOauthToken)) {
                    builder.addQueryParameter("oauth_token", pOauthToken);
                }
                HttpUrl httpUrl = builder.build();
                request = request.newBuilder().url(httpUrl).build();
                return pChain.proceed(request);
            }
        });

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL__BASE)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        this.mApis = retrofit.create(IApi.class);
    }

    @Override
    public Call<Token> token(
            String pClientId,
            String pClientSecret,
            String pRedirectUri,
            String pGrantType,
            String pCode) {
        return this.mApis.token(
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
        return this.mApis.tokenRx(
                pClientId,
                pClientSecret,
                pRedirectUri,
                pGrantType,
                pCode);
    }

    @Override
    public Call<List<User>> users(String pQ) {
        return this.mApis.users(pQ);
    }

    @Override
    public Observable<List<User>> usersRx(String pQ) {
        return this.mApis.usersRx(pQ);
    }

    @Override
    public Call<User> user(int pId) {
        return this.mApis.user(pId);
    }

    @Override
    public Observable<User> userRx(int pId) {
        return this.mApis.userRx(pId);
    }

    @Override
    public Call<List<Track>> userTracks(int pId) {
        return this.mApis.userTracks(pId);
    }

    @Override
    public Observable<List<Track>> userTracksRx(int pId) {
        return this.mApis.userTracksRx(pId);
    }

    @Override
    public Call<List<Playlist>> userPlaylists(int pId) {
        return this.mApis.userPlaylists(pId);
    }

    @Override
    public Observable<List<Playlist>> userPlaylistsRx(int pId) {
        return this.mApis.userPlaylistsRx(pId);
    }

    @Override
    public Call<List<Comment>> userComments(int pId) {
        return this.mApis.userComments(pId);
    }

    @Override
    public Observable<List<Comment>> userCommentsRx(int pId) {
        return this.mApis.userCommentsRx(pId);
    }

    @Override
    public Call<List<Group>> userGroups(int pId) {
        return this.mApis.userGroups(pId);
    }

    @Override
    public Observable<List<Group>> userGroupsRx(int pId) {
        return this.mApis.userGroupsRx(pId);
    }

    @Override
    public Call<List<WebProfile>> userWebProfiles(int pId) {
        return this.mApis.userWebProfiles(pId);
    }

    @Override
    public Observable<List<WebProfile>> userWebProfilesRx(int pId) {
        return this.mApis.userWebProfilesRx(pId);
    }

    @Override
    public Call<List<User>> userFollowings(int pId) {
        return this.mApis.userFollowings(pId);
    }

    @Override
    public Observable<List<User>> userFollowingsRx(int pId) {
        return this.mApis.userFollowingsRx(pId);
    }

    @Override
    public Call<List<User>> userFollowers(int pId) {
        return this.mApis.userFollowers(pId);
    }

    @Override
    public Observable<List<User>> userFollowersRx(int pId) {
        return this.mApis.userFollowersRx(pId);
    }

    @Override
    public Call<List<Track>> userFavorites(int pId) {
        return this.mApis.userFavorites(pId);
    }

    @Override
    public Observable<List<Track>> userFavoritesRx(int pId) {
        return this.mApis.userFavoritesRx(pId);
    }

    @Override
    public Call<List<Track>> tracks() {
        return this.mApis.tracks();
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
        return this.mApis.tracks(
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
        return this.mApis.tracksRx();
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
        return this.mApis.tracksRx(
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
        return this.mApis.track(pId);
    }

    @Override
    public Observable<Track> trackRx(int pId) {
        return this.mApis.trackRx(pId);
    }

    @Override
    public Call<List<Comment>> trackComments(int pId) {
        return this.mApis.trackComments(pId);
    }

    @Override
    public Observable<List<Comment>> trackCommentsRx(int pId) {
        return this.mApis.trackCommentsRx(pId);
    }

    @Override
    public Call<List<User>> trackFavoriters(int pId) {
        return this.mApis.trackFavoriters(pId);
    }

    @Override
    public Observable<List<User>> trackFavoritersRx(int pId) {
        return this.mApis.trackFavoritersRx(pId);
    }

    @Override
    public Call<List<Playlist>> playlists(String pQ, String pRepresentation) {
        return this.mApis.playlists(pQ, pRepresentation);
    }

    @Override
    public Observable<List<Playlist>> playlistsRx(String pQ, String pRepresentation) {
        return this.mApis.playlistsRx(pQ, pRepresentation);
    }

    @Override
    public Call<Playlist> playlist(int pId) {
        return this.mApis.playlist(pId);
    }

    @Override
    public Observable<Playlist> playlistRx(int pId) {
        return this.mApis.playlistRx(pId);
    }

    @Override
    public Call<List<Group>> groups(String pQ) {
        return this.mApis.groups(pQ);
    }

    @Override
    public Observable<List<Group>> groupsRx(String pQ) {
        return this.mApis.groupsRx(pQ);
    }

    @Override
    public Call<Group> group(int pId) {
        return this.mApis.group(pId);
    }

    @Override
    public Observable<Group> groupRx(int pId) {
        return this.mApis.groupRx(pId);
    }

    @Override
    public Call<List<User>> groupModerators(int pId) {
        return this.mApis.groupModerators(pId);
    }

    @Override
    public Observable<List<User>> groupModeratorsRx(int pId) {
        return this.mApis.groupModeratorsRx(pId);
    }

    @Override
    public Call<List<User>> groupMembers(int pId) {
        return this.mApis.groupMembers(pId);
    }

    @Override
    public Observable<List<User>> groupMembersRx(int pId) {
        return this.mApis.groupMembersRx(pId);
    }

    @Override
    public Call<List<User>> groupContributors(int pId) {
        return this.mApis.groupContributors(pId);
    }

    @Override
    public Observable<List<User>> groupContributorsRx(int pId) {
        return this.mApis.groupContributorsRx(pId);
    }

    @Override
    public Call<List<User>> groupUsers(int pId) {
        return this.mApis.groupUsers(pId);
    }

    @Override
    public Observable<List<User>> groupUsersRx(int pId) {
        return this.mApis.groupUsersRx(pId);
    }

    @Override
    public Call<List<Track>> groupTracks(int pId) {
        return this.mApis.groupTracks(pId);
    }

    @Override
    public Observable<List<Track>> groupTracksRx(int pId) {
        return this.mApis.groupTracksRx(pId);
    }

    @Override
    public Call<List<Comment>> comments() {
        return this.mApis.comments();
    }

    @Override
    public Observable<List<Comment>> commentsRx() {
        return this.mApis.commentsRx();
    }

    @Override
    public Call<Comment> comment(int pId) {
        return this.mApis.comment(pId);
    }

    @Override
    public Observable<Comment> commentRx(int pId) {
        return this.mApis.commentRx(pId);
    }

    @Override
    public Call<List<App>> apps() {
        return this.mApis.apps();
    }

    @Override
    public Observable<List<App>> appsRx() {
        return this.mApis.appsRx();
    }

    @Override
    public Call<App> app(int pId) {
        return this.mApis.app(pId);
    }

    @Override
    public Observable<App> appRx(int pId) {
        return this.mApis.appRx(pId);
    }

    @Override
    public Call<Me> me(String pAccessToken) {
        return this.mApis.me(pAccessToken);
    }

    @Override
    public Observable<Me> meRx(String pAccessToken) {
        return this.mApis.meRx(pAccessToken);
    }
}
