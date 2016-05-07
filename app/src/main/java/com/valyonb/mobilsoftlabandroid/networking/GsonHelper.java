package com.valyonb.mobilsoftlabandroid.networking;

/**
 * Created by valyonbalazs on 06/05/16.
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Máté on 01/05/2016.
 */
public class GsonHelper {
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    private static Gson gson;

    static {
        gson = new GsonBuilder().setDateFormat(DATE_FORMAT).create();
    }

    public static Gson getGson() {
        return gson;
    }
}
