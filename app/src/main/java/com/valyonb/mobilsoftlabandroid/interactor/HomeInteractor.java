package com.valyonb.mobilsoftlabandroid.interactor;

import com.valyonb.mobilsoftlabandroid.model.MovieModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valyonbalazs on 20/04/16.
 */
public class HomeInteractor {

    private List<MovieModel> movieList;

    public HomeInteractor() {
        movieList = new ArrayList<>();
        movieList.add(new MovieModel(
                "1",
                "Star Wars",
                "long time ago..",
                "long time ago in a galaxy far far away..",
                5,
                "http://imdb.com",
                "http://youtube.com"));
    }

    public List<MovieModel> getMovieList() {
        return movieList;
    }

}
