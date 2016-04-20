package com.valyonb.mobilsoftlabandroid.model;

/**
 * Created by valyonbalazs on 20/04/16.
 */
public class MovieModel implements IMovieModel {

    private String externalMovieId;
    private String movieTitle;
    private String movieShortDescription;
    private String movieLongDescription;
    private int movieRating;
    private String imdbUrl;
    private String trailerUrl;

    public String getExternalMovieId() {
        return externalMovieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieShortDescription() {
        return movieShortDescription;
    }

    public String getMovieLongDescription() {
        return movieLongDescription;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public String getImdbUrl() {
        return imdbUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public MovieModel() {

    }

    public MovieModel(String id, String title, String shortDes, String longDes, int rating, String imdb, String trailer) {
        this.externalMovieId = id;
        this.movieTitle = title;
        this.movieShortDescription = shortDes;
        this.movieLongDescription = longDes;
        this.movieRating = rating;
        this.imdbUrl = imdb;
        this.trailerUrl = trailer;
    }
}
