package com.valyonb.mobilsoftlabandroid.interactor;

import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.model.MovieFragmentType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valyonbalazs on 21/04/16.
 */
public class TopMoviesInteractor {

    private List<Movie> movieList;

    public TopMoviesInteractor() {
        movieList = new ArrayList<>();
        movieList.add(new Movie(
                MovieFragmentType.TOPMOVIES,
                "2",
                "Top gun",
                "Pilot of the US..",
                null,
                5,
                "http://imdb.com",
                "http://youtube.com"));
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
