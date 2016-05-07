package com.valyonb.mobilsoftlabandroid.interactor;

import dagger.Module;
import dagger.Provides;
/**
 * Created by valyonbalazs on 06/05/16.
 */
@Module
public class InteractorModule {
    @Provides
    public HomeInteractor provideMovieDbInteractor() {
        return new HomeInteractor();
    }
}
