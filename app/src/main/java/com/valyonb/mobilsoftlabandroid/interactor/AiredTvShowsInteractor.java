package com.valyonb.mobilsoftlabandroid.interactor;

import com.valyonb.mobilsoftlabandroid.model.MovieModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valyonbalazs on 21/04/16.
 */
public class AiredTvShowsInteractor {

    private List<MovieModel> movieList;

    public AiredTvShowsInteractor() {
        movieList = new ArrayList<>();
        movieList.add(new MovieModel(
                "1",
                "Deadpool",
                "Cancer patient mercenary...",
                "long time ago in a galaxy far far away..",
                5,
                "http://imdb.com",
                "http://youtube.com"));
    }

    public List<MovieModel> getMovieList() {
        return movieList;
    }
}
