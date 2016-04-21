package com.valyonb.mobilsoftlabandroid.presenter;

import com.valyonb.mobilsoftlabandroid.interactor.HomeInteractor;
import com.valyonb.mobilsoftlabandroid.interactor.NewMoviesInteractor;
import com.valyonb.mobilsoftlabandroid.model.MovieModel;
import com.valyonb.mobilsoftlabandroid.view.HomeScreen;
import com.valyonb.mobilsoftlabandroid.view.NewMoviesScreen;

import java.util.List;

/**
 * Created by valyonbalazs on 21/04/16.
 */
public class NewMoviesPresenter extends Presenter<NewMoviesScreen> {

    private NewMoviesInteractor newMoviesInteractor;

    private static NewMoviesPresenter instance = null;

    private NewMoviesPresenter() {
        newMoviesInteractor = new NewMoviesInteractor();
    }

    public static NewMoviesPresenter getInstance() {
        if(instance == null) {
            instance = new NewMoviesPresenter();
        }
        return instance;
    }

    public List<MovieModel> loadMovies() {
        // screen.showMovies(homeInteractor.getMovieList());
        return newMoviesInteractor.getMovieList();
    }

    @Override
    public void attachScreen(NewMoviesScreen screen) {
        super.attachScreen(screen);
        // EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen() {
        // EventBus.getDefault().unregister(this);
        super.detachScreen();
    }
}
