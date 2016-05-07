package com.valyonb.mobilsoftlabandroid.android;

import com.valyonb.mobilsoftlabandroid.interactor.InteractorModule;
import com.valyonb.mobilsoftlabandroid.model.prod.ModelModule;
import com.valyonb.mobilsoftlabandroid.networking.NetworkModule;
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
public class MobilSoftLabApplicationComponent {
}
