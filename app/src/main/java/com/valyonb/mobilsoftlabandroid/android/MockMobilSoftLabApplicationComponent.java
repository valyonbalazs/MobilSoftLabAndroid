package com.valyonb.mobilsoftlabandroid.android;

import com.valyonb.mobilsoftlabandroid.interactor.HomeInteractor;
import com.valyonb.mobilsoftlabandroid.interactor.InteractorModule;
import com.valyonb.mobilsoftlabandroid.model.mock.MockModelModule;
import com.valyonb.mobilsoftlabandroid.networking.mock.MockNetworkModule;
import com.valyonb.mobilsoftlabandroid.presenter.HomePresenter;
import com.valyonb.mobilsoftlabandroid.view.MainActivity;
import com.valyonb.mobilsoftlabandroid.view.ViewModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by valyonbalazs on 07/05/16.
 */
@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, MockModelModule.class, MockNetworkModule.class})
public interface MockMobilSoftLabApplicationComponent extends MobilSoftLabApplicationComponent {

}
