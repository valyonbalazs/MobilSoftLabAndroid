package com.valyonb.mobilsoftlabandroid.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;

import com.orm.SugarRecord;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/**
 * Created by valyonbalazs on 20/04/16.
 */
public class Movie extends SugarRecord {

    private MovieFragmentType movieFragmentType;
    private String externalMovieId;
    private String movieTitle;
    private String movieShortDescription;
    private Bitmap posterImage;
    private int movieRating;
    private String imdbUrl;
    private String trailerUrl;


    public Movie() {

    }

    public Movie(MovieFragmentType type, String id, String title, String shortDes, Bitmap longDes, int rating, String imdb, String trailer) {
        this.movieFragmentType = type;
        this.externalMovieId = id;
        this.movieTitle = title;
        this.movieShortDescription = shortDes;
        this.posterImage = longDes;
        this.movieRating = rating;
        this.imdbUrl = imdb;
        this.trailerUrl = trailer;
    }

    public MovieFragmentType getMovieFragmentType() {
        return movieFragmentType;
    }

    public void setMovieFragmentType(MovieFragmentType movieFragmentType) {
        this.movieFragmentType = movieFragmentType;
    }

    public String getExternalMovieId() {
        return externalMovieId;
    }

    public void setExternalMovieId(String externalMovieId) {
        this.externalMovieId = externalMovieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieShortDescription() {
        return movieShortDescription;
    }

    public void setMovieShortDescription(String movieShortDescription) {
        this.movieShortDescription = movieShortDescription;
    }

    public Bitmap getPosterImage() {
        return posterImage;
    }

    public void setPosterImage(Bitmap posterImage) {
        this.posterImage = posterImage;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    public String getImdbUrl() {
        return imdbUrl;
    }

    public void setImdbUrl(String imdbUrl) {
        this.imdbUrl = imdbUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }


}
