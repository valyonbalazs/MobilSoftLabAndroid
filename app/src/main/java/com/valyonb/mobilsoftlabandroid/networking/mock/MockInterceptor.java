package com.valyonb.mobilsoftlabandroid.networking.mock;

import android.net.Uri;
import android.util.Log;

import com.valyonb.mobilsoftlabandroid.networking.NetworkConfig;

import java.io.IOException;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import static com.valyonb.mobilsoftlabandroid.networking.mock.MockHelper.makeResponse;

/**
 * Created by valyonbalazs on 06/05/16.
 */
public class MockInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        return process(chain.request());
    }

    public Response process(Request request) {

        Uri uri = Uri.parse(request.url().toString());

        Log.d("Test Http Client", "URL call: " + uri.toString());
        Headers headers = request.headers();

        if (uri.getPath().startsWith(NetworkConfig.ENDPOINT_PREFIX + "topmovies")) {
            return MovieMock.process(request);
        } else if (uri.getPath().startsWith(NetworkConfig.ENDPOINT_PREFIX + "newmovies")) {
            return MovieMock.process(request);
        } else {
            return makeResponse(request, headers, 404, "Unknown");
        }
    }
}
