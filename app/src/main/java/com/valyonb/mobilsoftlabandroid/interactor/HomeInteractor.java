package com.valyonb.mobilsoftlabandroid.interactor;

import com.valyonb.mobilsoftlabandroid.android.MobilSoftLabApplication;
import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.model.MovieFragmentType;
import com.valyonb.mobilsoftlabandroid.model.MovieModel;
import com.valyonb.mobilsoftlabandroid.model.prod.MovieDbModel;
import com.valyonb.mobilsoftlabandroid.networking.MovieApi;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by valyonbalazs on 20/04/16.
 */
public class HomeInteractor{

    @Inject
    MovieDbModel movieDbModel;

    @Inject
    MovieApi movieApi;

    public HomeInteractor() {
        MobilSoftLabApplication.injector.inject(this);
    }

    public void addMovie(Movie m) {

        movieDbModel.insertMovie(m);
    }

    public List<MovieModel> getMovieList() throws Exception {

        Response<List<MovieModel>> response = null;

        Call<List<MovieModel>> call = movieApi.newMoviesGet();
        try {
            response = call.execute();
        } catch (Exception e) {
            throw new Exception("Network error on execute with get!");
        }
        if (response.code() != 200) {
            throw new Exception("Network error with get!");
        }

        return response.body();

        // movieList = Movie.listAll(Movie.class);
        // return movieList;
    }

    // private List<Movie> movieList;
    /*public HomeInteractor() {
        movieList = new ArrayList<>();

        Movie.deleteAll(Movie.class);

        // just for testing ORM layer, with different date
        Date date = new Date();

        for(int i  = 0; i < 10; i++) {
            Movie movie = new Movie(
                    MovieFragmentType.HOME,
                    String.valueOf(i),
                    "Star Wars",
                    "In a galaxy far far away..",
                    null,
                    5,
                    "http://imdb.com",
                    "http://youtube.com");

            movie.save();
        }

    }*/
}
