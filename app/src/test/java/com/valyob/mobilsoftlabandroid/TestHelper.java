package com.valyob.mobilsoftlabandroid;

import com.valyonb.mobilsoftlabandroid.android.MobilSoftLabApplication;
import com.valyonb.mobilsoftlabandroid.android.MobilSoftLabApplicationComponent;

import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowLog;
/**
 * Created by valyonbalazs on 07/05/16.
 */
public class TestHelper {

    public static void setTestInjector() {
        MobilSoftLabApplication application = (MobilSoftLabApplication)RuntimeEnvironment.application;
        MobilSoftLabApplicationComponent injector = null;
        // MobilSoftLabApplicationComponent injector = DaggerTestComponent.builder().testModule(new TestModule(application.getApplicationContext())).build();
        application.setInjector(injector);
    }
}
