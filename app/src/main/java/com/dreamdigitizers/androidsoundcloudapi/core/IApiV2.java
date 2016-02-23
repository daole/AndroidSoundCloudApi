package com.dreamdigitizers.androidsoundcloudapi.core;

import com.dreamdigitizers.androidsoundcloudapi.models.v2.Charts;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface IApiV2 {
    String API_URL__BASE = "https://api-v2.soundcloud.com";

    @GET("/charts")
    Call<Charts> charts(@Query("kind") String pKind, @Query("genre") String pGenre);

    @GET("/charts")
    Call<Charts> charts(
            @Query("linked_partitioning") int pLinkedPartitioning,
            @Query("limit") int pLimit,
            @Query("offset") int pOffset,
            @Query("kind") String pKind,
            @Query("genre") String pGenre);

    @GET("/charts")
    Observable<Charts> chartsRx(@Query("kind") String pKind, @Query("genre") String pGenre);

    @GET("/charts")
    Observable<Charts> chartsRx(
            @Query("linked_partitioning") int pLinkedPartitioning,
            @Query("limit") int pLimit,
            @Query("offset") int pOffset,
            @Query("kind") String pKind,
            @Query("genre") String pGenre);

    /*
    @GET("/users/{id}/likes")
    Call<List<Track>> userFavorites(@Path("id") int pId);

    @GET("/users/{id}/likes")
    Call<Collection> userFavorites(@Path("id") int pId, @Query("linked_partitioning") int pLinkedPartitioning, @Query("limit") int pLimit, @Query("offset") String pOffset);

    @GET("/users/{id}/likes")
    Observable<List<Track>> userFavoritesRx(@Path("id") int pId);

    @GET("/users/{id}/likes")
    Observable<Collection> userFavoritesRx(@Path("id") int pId, @Query("linked_partitioning") int pLinkedPartitioning, @Query("limit") int pLimit, @Query("offset") String pOffset);
    */
}
