package com.valyonb.mobilsoftlabandroid.presenter;

import com.valyonb.mobilsoftlabandroid.interactor.FavouritesInteractor;
import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.view.FavouritesScreen;

import java.util.List;

public class FavouritesPresenter extends Presenter<FavouritesScreen> {

    private FavouritesInteractor favouritesInteractor;

    private static FavouritesPresenter instance = null;

    private FavouritesPresenter() {
        favouritesInteractor = new FavouritesInteractor();
    }

    public static FavouritesPresenter getInstance() {
        if(instance == null) {
            instance = new FavouritesPresenter();
        }
        return instance;
    }

    public List<Movie> loadMovies() {
        // screen.showMovies(homeInteractor.getMovieList());
        return favouritesInteractor.getMovieList();
    }

    @Override
    public void attachScreen(FavouritesScreen screen) {
        super.attachScreen(screen);
        // EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen() {
        // EventBus.getDefault().unregister(this);
        super.detachScreen();
    }
}
