package com.valyob.mobilsoftlabandroid;

import android.content.Context;

import com.valyonb.mobilsoftlabandroid.model.prod.ModelModule;
import com.valyonb.mobilsoftlabandroid.model.prod.MovieDbModel;
import com.valyonb.mobilsoftlabandroid.presenter.HomePresenter;
import com.valyonb.mobilsoftlabandroid.presenter.MainPresenter;
import com.valyonb.mobilsoftlabandroid.view.ViewModule;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by valyonbalazs on 07/05/16.
 */

@Module
public class TestModule {


    private final ViewModule viewModule;
    private final ModelModule modelModule;

    public TestModule(Context context) {

        this.viewModule = new ViewModule(context);
        this.modelModule = new ModelModule();
    }

    @Provides
    public Context provideContext() {
        return viewModule.provideContext();
    }

    @Provides
    public MovieDbModel provideLoginPresenter() {
        return modelModule.provideMovieDbModel();
    }

    @Provides
    public HomePresenter provideMainPresenter() {
        return viewModule.provideHomePresenter();
    }
}
