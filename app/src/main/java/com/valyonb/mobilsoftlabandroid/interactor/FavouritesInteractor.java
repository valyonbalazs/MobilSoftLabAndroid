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

    public static List<MovieModel> ITEMS = new ArrayList<>();

    public static Map<String, MovieModel> ITEM_MAP = new HashMap<>();

    public static void addMovie(MovieModel movie) {
        ITEMS.add(movie);
    }


    public FavouritesInteractor() {
            ITEMS.add(new MovieModel(
                    "1",
                    "Star Wars",
                    "long time ago..",
                    "long time ago in a galaxy far far away..",
                    5,
                    "http://imdb.com",
                    "http://youtube.com"));
    }
}
