package com.valyonb.mobilsoftlabandroid.networking.mock;

import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by valyonbalazs on 06/05/16.
 */
public class MockHttpServer {

    public static Response call(Request request) {
        MockInterceptor mockInterceptor = new MockInterceptor();
        return mockInterceptor.process(request);
    }
}
