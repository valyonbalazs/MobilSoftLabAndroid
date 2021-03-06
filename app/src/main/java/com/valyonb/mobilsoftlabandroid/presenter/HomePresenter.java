package com.valyonb.mobilsoftlabandroid.presenter;

import com.valyonb.mobilsoftlabandroid.interactor.HomeInteractor;
import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.model.MovieModel;
import com.valyonb.mobilsoftlabandroid.view.HomeScreen;

import javax.inject.Inject;

import java.util.List;

/**
 * Created by valyonbalazs on 20/04/16.
 */
public class HomePresenter extends Presenter<HomeScreen> {

    @Inject
    public HomeInteractor homeInteractor;

    public static HomePresenter instance = null;

    public HomePresenter() {
        homeInteractor = new HomeInteractor();
    }

    public static HomePresenter getInstance() {
        if(instance == null) {
            instance = new HomePresenter();
        }
        return instance;
    }

    public List<MovieModel> loadMovies() throws Exception {
        // screen.showMovies(homeInteractor.getMovieList());
            return homeInteractor.getMovieList();

    }

    @Override
    public void attachScreen(HomeScreen screen) {
        super.attachScreen(screen);
        // EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen() {
        // EventBus.getDefault().unregister(this);
        super.detachScreen();
    }
}
