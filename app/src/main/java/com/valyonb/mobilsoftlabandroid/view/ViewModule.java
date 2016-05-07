package com.valyonb.mobilsoftlabandroid.view;

import javax.inject.Singleton;
import android.content.Context;

import com.valyonb.mobilsoftlabandroid.presenter.HomePresenter;

import dagger.Module;
import dagger.Provides;
/**
 * Created by valyonbalazs on 07/05/16.
 */

@Module
public class ViewModule {
    private Context context;

    public ViewModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public HomePresenter provideHomePresenter() {
        return new HomePresenter();
    }
}
