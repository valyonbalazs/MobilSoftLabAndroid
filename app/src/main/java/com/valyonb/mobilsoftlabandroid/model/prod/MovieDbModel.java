package com.valyonb.mobilsoftlabandroid.model.prod;

import com.valyonb.mobilsoftlabandroid.model.Movie;

import java.util.List;

/**
 * Created by valyonbalazs on 06/05/16.
 */
public class MovieDbModel {

    public MovieDbModel() {

    }

    public List<Movie> fetchPeople() {
        List<Movie> values = Movie.listAll(Movie.class);
        return values;
    }

    public void insertMovie(Movie toInsert) {
        toInsert.save();
    }
}
