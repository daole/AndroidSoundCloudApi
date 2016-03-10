package com.dreamdigitizers.androidsoundcloudapi.core;

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

import java.util.List;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
import retrofit.http.Query;
import rx.Observable;

public interface IApi {
    String API_URL__CONNECT = "https://soundcloud.com/connect"
            + "?client_id=%s"
            + "&redirect_uri=%s"
            + "&response_type=%s"
            + "&scope=%s"
            + "&display=%s"
            + "&state=%s";

    String API_URL__LOGOUT = "https://soundcloud.com/connect/logout?return_to=";

    String API_URL__BASE = "https://api.soundcloud.com";

    //-----------------Token-----------------//
    @POST("/oauth2/token")
    Call<Token> token(
            @Field("client_id") String pClientId,
            @Field("client_secret") String pClientSecret,
            @Field("redirect_uri") String pRedirectUri,
            @Field("grant_type") String pGrantType,
            @Field("code") String pCode);

    @POST("/oauth2/token")
    Observable<Token> tokenRx(
            @Field("client_id") String pClientId,
            @Field("client_secret") String pClientSecret,
            @Field("redirect_uri") String pRedirectUri,
            @Field("grant_type") String pGrantType,
            @Field("code") String pCode);

    //-----------------User-----------------//
    @GET("/users")
    Call<List<User>> users(@Query("q") String pQ);

    @GET("/users")
    Observable<List<User>> usersRx(@Query("q") String pQ);

    @GET("/users/{id}")
    Call<User> user(@Path("id") int pId);

    @GET("/users/{id}")
    Observable<User> userRx(@Path("id") int pId);

    @GET("/users/{id}/tracks")
    Call<List<Track>> userTracks(@Path("id") int pId);

    @GET("/users/{id}/tracks")
    Observable<List<Track>> userTracksRx(@Path("id") int pId);

    @GET("/users/{id}/playlists")
    Call<List<Playlist>> userPlaylists(@Path("id") int pId);

    @GET("/users/{id}/playlists")
    Call<Playlists> userPlaylists(@Path("id") int pId, @Query("linked_partitioning") int pLinkedPartitioning, @Query("limit") int pLimit, @Query("offset") int pOffset);

    @GET("/users/{id}/playlists")
    Observable<List<Playlist>> userPlaylistsRx(@Path("id") int pId);

    @GET("/users/{id}/playlists")
    Observable<Playlists> userPlaylistsRx(@Path("id") int pId, @Query("linked_partitioning") int pLinkedPartitioning, @Query("limit") int pLimit, @Query("offset") int pOffset);

    @GET("/users/{id}/comments")
    Call<List<Comment>> userComments(@Path("id") int pId);

    @GET("/users/{id}/comments")
    Observable<List<Comment>> userCommentsRx(@Path("id") int pId);

    @GET("/users/{id}/groups")
    Call<List<Group>> userGroups(@Path("id") int pId);

    @GET("/users/{id}/groups")
    Observable<List<Group>> userGroupsRx(@Path("id") int pId);

    @GET("/users/{id}/web-profiles")
    Call<List<WebProfile>> userWebProfiles(@Path("id") int pId);

    @GET("/users/{id}/web-profiles")
    Observable<List<WebProfile>> userWebProfilesRx(@Path("id") int pId);

    @GET("/users/{id}/followings")
    Call<List<User>> userFollowings(@Path("id") int pId);

    @GET("/users/{id}/followings")
    Observable<List<User>> userFollowingsRx(@Path("id") int pId);

    @GET("/users/{id}/followers")
    Call<List<User>> userFollowers(@Path("id") int pId);

    @GET("/users/{id}/followers")
    Observable<List<User>> userFollowersRx(@Path("id") int pId);

    @GET("/users/{id}/favorites")
    Call<List<Track>> userFavorites(@Path("id") int pId);

    @GET("/users/{id}/favorites")
    Call<Tracks> userFavorites(@Path("id") int pId, @Query("linked_partitioning") int pLinkedPartitioning, @Query("page_size") int pLimit, @Query("cursor") String pOffset);

    @GET("/users/{id}/favorites")
    Observable<List<Track>> userFavoritesRx(@Path("id") int pId);

    @GET("/users/{id}/favorites")
    Observable<Tracks> userFavoritesRx(@Path("id") int pId, @Query("linked_partitioning") int pLinkedPartitioning, @Query("page_size") int pLimit, @Query("cursor") String pOffset);

    //-----------------Track-----------------//
    @GET("/tracks")
    Call<List<Track>> tracks();

    @GET("/tracks")
    Call<List<Track>> tracks(@Query("q") String pQ);

    @GET("/tracks")
    Call<List<Track>> tracks(
            @Query("q") String pQ,
            @Query("tags") String pTags,
            @Query("filter") String pFilter,
            @Query("license") String pLicense,
            @Query("bpm[from]") String pBpmFrom,
            @Query("bpm[to]") String pBpmTo,
            @Query("duration[from]") String pDurationFrom,
            @Query("duration[to]") String pDurationTo,
            @Query("created_at[from]") String pCreatedAtFrom,
            @Query("created_at[to]") String pCreatedAtTo,
            @Query("ids") String pIds,
            @Query("genres") String pGenres,
            @Query("types") String pTypes);

    @GET("/tracks")
    Call<Tracks> tracks(@Query("linked_partitioning") int pLinkedPartitioning, @Query("limit") int pLimit, @Query("offset") int pOffset);

    @GET("/tracks")
    Call<Tracks> tracks(@Query("linked_partitioning") int pLinkedPartitioning, @Query("limit") int pLimit, @Query("offset") int pOffset, @Query("q") String pQ);

    @GET("/tracks")
    Call<Tracks> tracks(
            @Query("linked_partitioning") int pLinkedPartitioning,
            @Query("limit") int pLimit,
            @Query("offset") int pOffset,
            @Query("q") String pQ,
            @Query("tags") String pTags,
            @Query("filter") String pFilter,
            @Query("license") String pLicense,
            @Query("bpm[from]") String pBpmFrom,
            @Query("bpm[to]") String pBpmTo,
            @Query("duration[from]") String pDurationFrom,
            @Query("duration[to]") String pDurationTo,
            @Query("created_at[from]") String pCreatedAtFrom,
            @Query("created_at[to]") String pCreatedAtTo,
            @Query("ids") String pIds,
            @Query("genres") String pGenres,
            @Query("types") String pTypes);

    @GET("/tracks")
    Observable<List<Track>> tracksRx();

    @GET("/tracks")
    Observable<List<Track>> tracksRx(@Query("q") String pQ);

    @GET("/tracks")
    Observable<List<Track>> tracksRx(
            @Query("q") String pQ,
            @Query("tags") String pTags,
            @Query("filter") String pFilter,
            @Query("license") String pLicense,
            @Query("bpm[from]") String pBpmFrom,
            @Query("bpm[to]") String pBpmTo,
            @Query("duration[from]") String pDurationFrom,
            @Query("duration[to]") String pDurationTo,
            @Query("created_at[from]") String pCreatedAtFrom,
            @Query("created_at[to]") String pCreatedAtTo,
            @Query("ids") String pIds,
            @Query("genres") String pGenres,
            @Query("types") String pTypes);

    @GET("/tracks")
    Observable<Tracks> tracksRx(@Query("linked_partitioning") int pLinkedPartitioning, @Query("limit") int pLimit, @Query("offset") int pOffset);

    @GET("/tracks")
    Observable<Tracks> tracksRx(@Query("linked_partitioning") int pLinkedPartitioning, @Query("limit") int pLimit, @Query("offset") int pOffset, @Query("q") String pQ);

    @GET("/tracks")
    Observable<Tracks> tracksRx(
            @Query("linked_partitioning") int pLinkedPartitioning,
            @Query("limit") int pLimit,
            @Query("offset") int pOffset,
            @Query("q") String pQ,
            @Query("tags") String pTags,
            @Query("filter") String pFilter,
            @Query("license") String pLicense,
            @Query("bpm[from]") String pBpmFrom,
            @Query("bpm[to]") String pBpmTo,
            @Query("duration[from]") String pDurationFrom,
            @Query("duration[to]") String pDurationTo,
            @Query("created_at[from]") String pCreatedAtFrom,
            @Query("created_at[to]") String pCreatedAtTo,
            @Query("ids") String pIds,
            @Query("genres") String pGenres,
            @Query("types") String pTypes);

    @GET("/tracks/{id}")
    Call<Track> track(@Path("id") int pId);

    @GET("/tracks/{id}")
    Observable<Track> trackRx(@Path("id") int pId);

    @GET("/tracks/{id}/comments")
    Call<List<Comment>> trackComments(@Path("id") int pId);

    @GET("/tracks/{id}/comments")
    Observable<List<Comment>> trackCommentsRx(@Path("id") int pId);

    @GET("/tracks/{id}/favoriters")
    Call<List<User>> trackFavoriters(@Path("id") int pId);

    @GET("/tracks/{id}/favoriters")
    Observable<List<User>> trackFavoritersRx(@Path("id") int pId);

    //-----------------Playlist-----------------//
    @GET("/playlists")
    Call<List<Playlist>> playlists(@Query("q") String pQ, @Query("representation") String pRepresentation);

    @GET("/playlists")
    Observable<List<Playlist>> playlistsRx(@Query("q") String pQ, @Query("representation") String pRepresentation);

    @FormUrlEncoded
    @POST("/playlists")
    Call<Playlist> playlists(
            @Field("playlist[title]") String pTitle,
            @Field("playlist[sharing]") String pSharing,
            @Field("playlist[_resource_id]") String pResourceId,
            @Field("playlist[_resource_type]") String pResourceType);

    @FormUrlEncoded
    @POST("/playlists")
    Observable<Playlist> playlistsRx(
            @Field("playlist[title]") String pTitle,
            @Field("playlist[sharing]") String pSharing,
            @Field("playlist[_resource_id]") String pResourceId,
            @Field("playlist[_resource_type]") String pResourceType);

    @GET("/playlists/{id}")
    Call<Playlist> playlist(@Path("id") int pId);

    @GET("/playlists/{id}")
    Observable<Playlist> playlistRx(@Path("id") int pId);

    @PUT("/playlists/{id}")
    Call<Playlist> playlist(@Path("id") int pId, @Body ParameterAddTrackToPlaylist pParameter);

    @PUT("/playlists/{id}")
    Observable<Playlist> playlistRx(@Path("id") int pId, @Body ParameterAddTrackToPlaylist pParameter);

    @DELETE("/playlists/{id}")
    Call<Void> deletePlaylist(@Path("id") int pId);

    @DELETE("/playlists/{id}")
    Observable<Void> deletePlaylistRx(@Path("id") int pId);

    //-----------------Group-----------------//
    @GET("/groups")
    Call<List<Group>> groups(@Query("q") String pQ);

    @GET("/groups")
    Observable<List<Group>> groupsRx(@Query("q") String pQ);

    @GET("/groups/{id}")
    Call<Group> group(@Path("id") int pId);

    @GET("/groups/{id}")
    Observable<Group> groupRx(@Path("id") int pId);

    @GET("/groups/{id}/moderators")
    Call<List<User>> groupModerators(@Path("id") int pId);

    @GET("/groups/{id}/moderators")
    Observable<List<User>> groupModeratorsRx(@Path("id") int pId);

    @GET("/groups/{id}/members")
    Call<List<User>> groupMembers(@Path("id") int pId);

    @GET("/groups/{id}/members")
    Observable<List<User>> groupMembersRx(@Path("id") int pId);

    @GET("/groups/{id}/contributors")
    Call<List<User>> groupContributors(@Path("id") int pId);

    @GET("/groups/{id}/contributors")
    Observable<List<User>> groupContributorsRx(@Path("id") int pId);

    @GET("/groups/{id}/users")
    Call<List<User>> groupUsers(@Path("id") int pId);

    @GET("/groups/{id}/users")
    Observable<List<User>> groupUsersRx(@Path("id") int pId);

    @GET("/groups/{id}/tracks")
    Call<List<Track>> groupTracks(@Path("id") int pId);

    @GET("/groups/{id}/tracks")
    Observable<List<Track>> groupTracksRx(@Path("id") int pId);

    //-----------------Comment-----------------//
    @GET("/comments")
    Call<List<Comment>> comments();

    @GET("/comments")
    Observable<List<Comment>> commentsRx();

    @GET("/comments/{id}")
    Call<Comment> comment(@Path("id") int pId);

    @GET("/comments/{id}")
    Observable<Comment> commentRx(@Path("id") int pId);

    //-----------------App-----------------//
    @GET("/apps")
    Call<List<App>> apps();

    @GET("/apps")
    Observable<List<App>> appsRx();

    @GET("/apps/{id}")
    Call<App> app(@Path("id") int pId);

    @GET("/apps/{id}")
    Observable<App> appRx(@Path("id") int pId);

    //-----------------Me-----------------//
    @GET("/me")
    Call<Me> me(@Query("oauth_token") String pAccessToken);

    @GET("/me")
    Observable<Me> meRx(@Query("oauth_token") String pAccessToken);

    @PUT("/me/favorites/{id}")
    Call<Void> favorite(@Path("id") int pId);

    @PUT("/me/favorites/{id}")
    Observable<Void> favoriteRx(@Path("id") int pId);

    @DELETE("/me/favorites/{id}")
    Call<Void> unfavorite(@Path("id") int pId);

    @DELETE("/me/favorites/{id}")
    Observable<Void> unfavoriteRx(@Path("id") int pId);

    @GET("e1/me/track_likes/ids")
    Call<List<Integer>> trackLikes();

    @GET("e1/me/track_likes/ids")
    Observable<List<Integer>> trackLikesRx();
}
