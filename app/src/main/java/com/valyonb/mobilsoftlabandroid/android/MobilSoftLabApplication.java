package com.valyonb.mobilsoftlabandroid.android;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.valyonb.mobilsoftlabandroid.BuildConfig;
import com.valyonb.mobilsoftlabandroid.R;
import com.valyonb.mobilsoftlabandroid.view.ViewModule;

/**
 * Created by valyonbalazs on 06/05/16.
 */
public class MobilSoftLabApplication extends Application {

    public static MobilSoftLabApplicationComponent injector;

    private Tracker mTracker;

    synchronized public Tracker getDefaultTracker() {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            mTracker = analytics.newTracker(R.xml.global_tracker);
        }
        return mTracker;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerMockMobilSoftLabApplicationComponent.builder().viewModule(new ViewModule(this)).build();

//        if (BuildConfig.FLAVOR.equals("mock")) {
//               injector = DaggerMockMobilSoftLabApplicationComponent.builder().viewModule(new ViewModule(this)).build();
//        } else {
//              injector = DaggerMobilsoftLabApplicationComponent.builder().viewModule(new ViewModule(this)).build();
//        }
    }

    public void setInjector(MobilSoftLabApplicationComponent appComponent) {
        injector = appComponent;
        injector.inject(this);
    }
}
