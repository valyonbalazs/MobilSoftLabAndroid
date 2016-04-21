package com.valyonb.mobilsoftlabandroid.interactor;

import com.valyonb.mobilsoftlabandroid.model.MovieModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valyonbalazs on 21/04/16.
 */
public class TopMoviesInteractor {

    private List<MovieModel> movieList;

    public TopMoviesInteractor() {
        movieList = new ArrayList<>();
        movieList.add(new MovieModel(
                "2",
                "Top gun",
                "Pilot of the US..",
                "long time ago in a galaxy far far away..",
                5,
                "http://imdb.com",
                "http://youtube.com"));
    }

    public List<MovieModel> getMovieList() {
        return movieList;
    }
}
