package com.valyonb.mobilsoftlabandroid.model.mock;

import com.valyonb.mobilsoftlabandroid.model.prod.MovieDbModel;

import dagger.Module;
import dagger.Provides;
/**
 * Created by valyonbalazs on 06/05/16.
 */
@Module
public class MockModelModule {
    @Provides
    public MovieDbModel provideMockPeopleDbModel() {
        return new MockMovieDbModel();
    }
}
