package com.valyonb.mobilsoftlabandroid.presenter;

import com.valyonb.mobilsoftlabandroid.interactor.TopMoviesInteractor;
import com.valyonb.mobilsoftlabandroid.model.MovieModel;
import com.valyonb.mobilsoftlabandroid.view.TopMoviesScreen;

import java.util.List;

/**
 * Created by valyonbalazs on 21/04/16.
 */
public class TopMoviesPresenter extends Presenter<TopMoviesScreen> {

    private TopMoviesInteractor topMoviesInteractor;

    private static TopMoviesPresenter instance = null;

    private TopMoviesPresenter() {

        topMoviesInteractor = new TopMoviesInteractor();
    }

    public static TopMoviesPresenter getInstance() {
        if(instance == null) {
            instance = new TopMoviesPresenter();
        }
        return instance;
    }

    public List<MovieModel> loadMovies() {
        return topMoviesInteractor.getMovieList();
    }

    @Override
    public void attachScreen(TopMoviesScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
