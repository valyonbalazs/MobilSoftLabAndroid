package com.valyonb.mobilsoftlabandroid.networking;

import com.valyonb.mobilsoftlabandroid.model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by valyonbalazs on 06/05/16.
 */
public interface MovieApi {


    @GET("topmovies")
    Call<List<MovieModel>> topMoviesGet();


    @GET("newmovies")
    Call<List<MovieModel>> newMoviesGet();
}
