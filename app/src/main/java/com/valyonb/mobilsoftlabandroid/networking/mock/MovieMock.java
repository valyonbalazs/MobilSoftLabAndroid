package com.valyonb.mobilsoftlabandroid.networking.mock;

import android.net.Uri;

import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.model.MovieFragmentType;
import com.valyonb.mobilsoftlabandroid.networking.GsonHelper;
import com.valyonb.mobilsoftlabandroid.networking.NetworkConfig;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by valyonbalazs on 06/05/16.
 */
public class MovieMock {

    static List<Movie> movieList = new ArrayList<>();
    static boolean isInitialised = false;

    public static Movie movie1 = new Movie(
            MovieFragmentType.HOME,
            "1",
            "Star Wars",
            "In a galaxy far far away..",
            null,
            5,
            "http://imdb.com",
            "http://youtube.com");
    public static Movie movie2 = new Movie(
            MovieFragmentType.HOME,
            "2",
            "Deadpool",
            "A merc with a mouth",
            null,
            5,
            "http://imdb.com",
            "http://youtube.com");

    public static Response process(Request request) {
        Uri uri = Uri.parse(request.url().toString());

        String responseString;
        int responseCode;
        Headers headers = request.headers();

        if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "topmovies") && request.method().equals("GET")) {
            if (!isInitialised) {
                movieList.add(movie1);
                movieList.add(movie2);
                isInitialised = true;
            }
            responseString = GsonHelper.getGson().toJson(movieList);
            responseCode = 200;
        } else if (uri.getPath().startsWith(NetworkConfig.ENDPOINT_PREFIX + "newmovies") && request.method().equals("GET")) {
            if (!isInitialised) {
                movieList.add(movie1);
                movieList.add(movie2);
                isInitialised = true;
            }
            responseString = GsonHelper.getGson().toJson(movieList);
            responseCode = 200;
        } else {
            responseString = "ERROR";
            responseCode = 503;
        }

        return MockHelper.makeResponse(request, headers, responseCode, responseString);
    }

    public static void resetList() {
        movieList.clear();
        isInitialised = false;
    }
}
