package com.valyonb.mobilsoftlabandroid.model.prod;

import dagger.Module;
import dagger.Provides;
/**
 * Created by valyonbalazs on 06/05/16.
 */
@Module
public class ModelModule {
    @Provides
    public MovieDbModel provideMovieDbModel() {
        return new MovieDbModel();
    }
}
