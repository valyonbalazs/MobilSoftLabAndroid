package com.valyonb.mobilsoftlabandroid.presenter;

import com.valyonb.mobilsoftlabandroid.interactor.AiredTvShowsInteractor;
import com.valyonb.mobilsoftlabandroid.interactor.HomeInteractor;
import com.valyonb.mobilsoftlabandroid.model.MovieModel;
import com.valyonb.mobilsoftlabandroid.view.AiredTvShowsScreen;
import com.valyonb.mobilsoftlabandroid.view.HomeScreen;

import java.util.List;

/**
 * Created by valyonbalazs on 21/04/16.
 */
public class AiredTvShowsPresenter extends Presenter<AiredTvShowsScreen> {

    private AiredTvShowsInteractor airedTvShowsInteractor;

    private static AiredTvShowsPresenter instance = null;

    private AiredTvShowsPresenter() {
        airedTvShowsInteractor = new AiredTvShowsInteractor();
    }

    public static AiredTvShowsPresenter getInstance() {
        if(instance == null) {
            instance = new AiredTvShowsPresenter();
        }
        return instance;
    }

    public List<MovieModel> loadMovies() {
        // screen.showMovies(homeInteractor.getMovieList());
        return airedTvShowsInteractor.getMovieList();
    }

    @Override
    public void attachScreen(AiredTvShowsScreen screen) {
        super.attachScreen(screen);
        // EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen() {
        // EventBus.getDefault().unregister(this);
        super.detachScreen();
    }
}
