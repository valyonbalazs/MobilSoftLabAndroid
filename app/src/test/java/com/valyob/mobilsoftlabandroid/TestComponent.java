package com.valyob.mobilsoftlabandroid;

import com.valyonb.mobilsoftlabandroid.android.MobilSoftLabApplicationComponent;
import com.valyonb.mobilsoftlabandroid.interactor.InteractorModule;
import com.valyonb.mobilsoftlabandroid.networking.mock.MockNetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by valyonbalazs on 07/05/16.
 */
@Singleton
@Component(modules = {MockNetworkModule.class, TestModule.class, InteractorModule.class})
public interface TestComponent extends MobilSoftLabApplicationComponent {
}
