package com.valyonb.mobilsoftlabandroid.interactor;

import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.model.MovieFragmentType;
import com.valyonb.mobilsoftlabandroid.model.prod.MovieDbModel;
import com.valyonb.mobilsoftlabandroid.networking.MovieApi;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by valyonbalazs on 20/04/16.
 */
public class HomeInteractor{

    @Inject
    MovieDbModel movieDbModel;

    @Inject
    MovieApi movieApi;

    public HomeInteractor() {

    }

    public void addMovie(Movie m) {
        movieDbModel.insertMovie(m);
    }

    private List<Movie> movieList;

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

    public List<Movie> getMovieList() {

        // downloading data from API later
        // NetworkModule networkModule = new NetworkModule();
        // networkModule.downloadData("url");

        movieList = Movie.listAll(Movie.class);

        return movieList;
    }

}
