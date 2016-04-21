package com.valyonb.mobilsoftlabandroid.interactor;

import android.graphics.Movie;

import com.valyonb.mobilsoftlabandroid.model.MovieModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by valyonbalazs on 20/04/16.
 */
public class FavouritesInteractor {

    private List<MovieModel> movieList;

    public FavouritesInteractor() {
        movieList = new ArrayList<>();
        movieList.add(new MovieModel(
                "1",
                "Arrow",
                "After 5 years of hell...",
                "long time ago in a galaxy far far away..",
                5,
                "http://imdb.com",
                "http://youtube.com"));
    }

    public List<MovieModel> getMovieList() {
        return movieList;
    }
}
