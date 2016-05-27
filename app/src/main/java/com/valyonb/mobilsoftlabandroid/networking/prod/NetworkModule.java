package com.valyonb.mobilsoftlabandroid.networking.prod;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.util.Log;

import com.valyonb.mobilsoftlabandroid.networking.GsonHelper;
import com.valyonb.mobilsoftlabandroid.networking.MovieApi;
import com.valyonb.mobilsoftlabandroid.networking.Network;
import com.valyonb.mobilsoftlabandroid.networking.NetworkConfig;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by valyonbalazs on 21/04/16.
 */
@Module
public class NetworkModule extends AsyncTask<String, Void, Bitmap> implements Network {

    private Bitmap getResizedBitmap(Bitmap bm, int newHeight, int newWidth) {
        int width = bm.getWidth();
        int height = bm.getHeight();
        float scaleWidth = ((float) newWidth) / width;
        float scaleHeight = ((float) newHeight) / height;
        // CREATE A MATRIX FOR THE MANIPULATION
        Matrix matrix = new Matrix();
        // RESIZE THE BIT MAP
        matrix.postScale(scaleWidth, scaleHeight);

        // "RECREATE" THE NEW BITMAP
        Bitmap resizedBitmap = Bitmap.createBitmap(bm, 0, 0, width, height,
                matrix, false);

        return resizedBitmap;
    }

    @Override
    public Bitmap doInBackground(String... params) {
        String src = params[0];
        try {
            URL url = new URL(src);
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            Bitmap bmp = BitmapFactory.decodeStream(in);
            return bmp;

        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }

    }

    @Override
    public void downloadData(String url) {

    }

    @Provides
    @Singleton
    public OkHttpClient.Builder provideOkHttpClientBuilder() {
        OkHttpClient.Builder clientBuilder = null;
        try {
            clientBuilder = UnsafeClientFactory.getUnsafeClient();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (clientBuilder == null) {
            throw new RuntimeException("HttpClient cannot be initialized!");
        }

        return clientBuilder;
    }

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(OkHttpClient.Builder builder) {
        return builder.build();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder().baseUrl(NetworkConfig.SERVICE_ENDPOINT).client(client)
                .addConverterFactory(GsonConverterFactory.create(GsonHelper.getGson())).build();
    }

    @Provides
    @Singleton
    public MovieApi provideDefaultApi(Retrofit retrofit) {
        return retrofit.create(MovieApi.class);
    }
}
