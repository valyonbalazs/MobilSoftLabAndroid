package com.valyonb.mobilsoftlabandroid;

import com.valyonb.mobilsoftlabandroid.R;
import com.valyonb.mobilsoftlabandroid.view.MainActivity;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by valyonbalazs on 26/05/16.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class HelloWorldEspressoTest {

    @Rule
    public ActivityRule<MainActivity> mActivityRule = new ActivityRule(MainActivity.class);

    @Test
    public void btnTest() {
        onView(withId(R.id.imdbButton)).perform(click());
    }
}
