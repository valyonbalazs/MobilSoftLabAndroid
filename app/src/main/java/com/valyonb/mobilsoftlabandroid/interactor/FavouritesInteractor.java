package com.valyonb.mobilsoftlabandroid.interactor;

import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.model.MovieFragmentType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valyonbalazs on 20/04/16.
 */
public class FavouritesInteractor {

    private List<Movie> movieList;

    public FavouritesInteractor() {
        movieList = new ArrayList<>();
        movieList.add(new Movie(
                MovieFragmentType.FAVOURITE,
                "1",
                "Arrow",
                "After 5 years of hell...",
                null,
                5,
                "http://imdb.com",
                "http://youtube.com"));
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
