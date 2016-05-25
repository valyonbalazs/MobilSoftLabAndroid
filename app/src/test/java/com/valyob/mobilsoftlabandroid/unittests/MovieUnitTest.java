package com.valyob.mobilsoftlabandroid.unittests;

import android.graphics.Bitmap;

import com.valyob.mobilsoftlabandroid.RobolectricDaggerTestRunner;
import com.valyonb.mobilsoftlabandroid.BuildConfig;
import com.valyonb.mobilsoftlabandroid.interactor.HomeInteractor;
import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.model.MovieFragmentType;
import com.valyonb.mobilsoftlabandroid.model.MovieModel;
import com.valyonb.mobilsoftlabandroid.networking.mock.MovieMock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

import java.util.List;

import javax.inject.Inject;
import static org.junit.Assert.*;

/**
 * Created by valyonbalazs on 07/05/16.
 */
@RunWith(RobolectricDaggerTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MovieUnitTest {

    @Inject
    public HomeInteractor homeInteractor;

    @Before
    public void setuo() {
        homeInteractor = new HomeInteractor();
    }

    @Test
    public void getterTest() {
        MovieFragmentType movieFragmentType = MovieFragmentType.TOPMOVIES;
        String externalMovieId = "1";
        String movieTitle = "Star Wars";
        String movieShortDescription = "A galaxy far far away..";
        Bitmap posterImage = null;
        int movieRating = 9;
        String imdbUrl = "http://imdb.com";
        String trailerUrl = "http://youtube.com";
        Movie m = new Movie(movieFragmentType, externalMovieId, movieTitle, movieShortDescription, posterImage, movieRating, imdbUrl, trailerUrl);

        assertEquals(m.getMovieTitle(), movieTitle);
    }

    @Test
    public void getMoviesFromNetworkTest() throws Exception {
        MovieMock.resetList();
        if (BuildConfig.FLAVOR == "mock") {
            List<MovieModel> m = homeInteractor.getMovieList();
            assertEquals(m.get(0).getMovieTitle(), MovieMock.movie1.getMovieTitle());
            assertEquals(m.get(1).getMovieTitle(), MovieMock.movie2.getMovieTitle());
        }
    }

    // további unit testek ide ha lesz rá idő

}
