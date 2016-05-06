package com.valyonb.mobilsoftlabandroid.presenter;

import com.valyonb.mobilsoftlabandroid.view.MainActivity;

/**
 * Created by valyonbalazs on 20/04/16.
 */
public class MainPresenter extends Presenter<MainActivity> {

    private static MainPresenter instance = null;

    public MainPresenter() {

    }

    // Singleton
    public static MainPresenter getInstance() {
        if (instance == null) {
            instance = new MainPresenter();
        }
        return instance;
    }

}
