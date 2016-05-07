package com.valyonb.mobilsoftlabandroid.android;

import android.app.Application;

import com.valyonb.mobilsoftlabandroid.BuildConfig;
import com.valyonb.mobilsoftlabandroid.view.ViewModule;

/**
 * Created by valyonbalazs on 06/05/16.
 */
public class MobilSoftLabApplication extends Application {

    public static SugarAppApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.FLAVOR.equals("mock")) {
            injector = DaggerMockSugarAppApplicationComponent.builder().viewModule(new ViewModule(this)).build();
        } else {
            injector = DaggerSugarAppApplicationComponent.builder().viewModule(new ViewModule(this)).build();
        }
    }

    public void setInjector(SugarAppApplicationComponent appComponent) {
        injector = appComponent;
        injector.inject(this);
    }
}
