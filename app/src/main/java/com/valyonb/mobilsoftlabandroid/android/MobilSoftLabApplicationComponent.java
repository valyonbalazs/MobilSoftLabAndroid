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
import dagger.Module;

@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class, NetworkModule.class})
public interface MobilSoftLabApplicationComponent {

    void inject(MainActivity mainActivity);

    void inject(HomePresenter homePresenter);

    void inject(HomeInteractor interactor);

    void inject(MobilSoftLabApplication app);
}
