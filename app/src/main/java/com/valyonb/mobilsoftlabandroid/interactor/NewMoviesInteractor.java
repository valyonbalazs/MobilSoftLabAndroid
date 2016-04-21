package com.valyonb.mobilsoftlabandroid.interactor;

import com.valyonb.mobilsoftlabandroid.model.MovieModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valyonbalazs on 21/04/16.
 */
public class NewMoviesInteractor {

    private List<MovieModel> movieList;

    public NewMoviesInteractor() {
        movieList = new ArrayList<>();
        movieList.add(new MovieModel(
                "1",
                "Lord of the Rings",
                "In middle earth..",
                "long time ago in a galaxy far far away..",
                5,
                "http://imdb.com",
                "http://youtube.com"));
    }

    public List<MovieModel> getMovieList() {
        return movieList;
    }
}
