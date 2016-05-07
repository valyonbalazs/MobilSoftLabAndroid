package com.valyonb.mobilsoftlabandroid.model.mock;

import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.model.MovieFragmentType;
import com.valyonb.mobilsoftlabandroid.model.prod.MovieDbModel;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by valyonbalazs on 06/05/16.
 */
public class MockMovieDbModel extends MovieDbModel {

    LinkedList<Movie> values = new LinkedList<>();

    public MockMovieDbModel() {
        values.add(new Movie(
                MovieFragmentType.HOME,
                "1",
                "Star Wars",
                "In a galaxy far far away..",
                null,
                5,
                "http://imdb.com",
                "http://youtube.com"));
        values.add(new Movie(
                MovieFragmentType.HOME,
                "2",
                "Star Wars",
                "In a galaxy far far away..",
                null,
                5,
                "http://imdb.com",
                "http://youtube.com"));
    }

    public List<Movie> fetchMovies() {
        return values;
    }

    public void insertMovie(Movie toInsert) {
        values.add(toInsert);
    }
}
