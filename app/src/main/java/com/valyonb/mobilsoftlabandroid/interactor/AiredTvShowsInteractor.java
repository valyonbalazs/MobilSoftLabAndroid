package com.valyonb.mobilsoftlabandroid.interactor;

import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.model.MovieFragmentType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valyonbalazs on 21/04/16.
 */
public class AiredTvShowsInteractor {

    private List<Movie> movieList;

    public AiredTvShowsInteractor() {
        movieList = new ArrayList<>();
        movieList.add(new Movie(
                MovieFragmentType.AIREDTVSHOW,
                "1",
                "Deadpool",
                "Cancer patient mercenary...",
                null,
                5,
                "http://imdb.com",
                "http://youtube.com"));
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
