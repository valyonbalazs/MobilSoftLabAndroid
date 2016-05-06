package com.valyonb.mobilsoftlabandroid.interactor;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.valyonb.mobilsoftlabandroid.R;
import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.model.MovieFragmentType;
import com.valyonb.mobilsoftlabandroid.networking.NetworkModule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by valyonbalazs on 20/04/16.
 */
public class HomeInteractor{

    private List<Movie> movieList;

    public HomeInteractor() {
        movieList = new ArrayList<>();

        Movie.deleteAll(Movie.class);

        // just for testing ORM layer, with different date
        Date date = new Date();
        // ImageView imageView = (ImageView) findViewById(R.id.moviePhoto);
        // Picasso.with(this).load("http://www.retro36.com/images/product/s/star-wars-empire-strikes-back-one-sheet-maxi-poster-256px-256px.jpg").into(imageView);
        Movie movie = new Movie(
                MovieFragmentType.HOME,
                "1",
                "Star Wars",
                date.toString(),
                null,
                5,
                "http://imdb.com",
                "http://youtube.com");

        movie.save();

    }

    public List<Movie> getMovieList() {

        // downloading data from API later
        // NetworkModule networkModule = new NetworkModule();
        // networkModule.downloadData("url");

        movieList = Movie.listAll(Movie.class);

        return movieList;
    }

}
