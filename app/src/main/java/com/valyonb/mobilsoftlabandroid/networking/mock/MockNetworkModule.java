package com.valyonb.mobilsoftlabandroid.networking.mock;

import com.valyonb.mobilsoftlabandroid.networking.GsonHelper;
import com.valyonb.mobilsoftlabandroid.networking.MovieApi;
import com.valyonb.mobilsoftlabandroid.networking.NetworkConfig;
import com.valyonb.mobilsoftlabandroid.networking.prod.NetworkModule;
import com.valyonb.mobilsoftlabandroid.networking.prod.UnsafeClientFactory;

import java.io.IOException;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
/**
 * Created by valyonbalazs on 07/05/16.
 */
@Module
public class MockNetworkModule {

    private NetworkModule networkModule = new NetworkModule();

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
