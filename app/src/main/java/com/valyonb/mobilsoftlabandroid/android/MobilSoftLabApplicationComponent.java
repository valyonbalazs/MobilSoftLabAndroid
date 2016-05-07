package com.valyonb.mobilsoftlabandroid.android;

import com.valyonb.mobilsoftlabandroid.interactor.HomeInteractor;
import com.valyonb.mobilsoftlabandroid.interactor.InteractorModule;
import com.valyonb.mobilsoftlabandroid.model.prod.ModelModule;
import com.valyonb.mobilsoftlabandroid.networking.prod.NetworkModule;
import com.valyonb.mobilsoftlabandroid.presenter.HomePresenter;
import com.valyonb.mobilsoftlabandroid.view.MainActivity;
import com.valyonb.mobilsoftlabandroid.view.ViewModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Máté on 27/04/2016.
 */
@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class, NetworkModule.class})
/**
 * Created by valyonbalazs on 06/05/16.
 */
public interface MobilSoftLabApplicationComponent {

    void inject(MainActivity mainActivity);

    void inject(HomePresenter homePresenter);

    void inject(HomeInteractor interactor);

    void inject(MobilSoftLabApplication app);
}
