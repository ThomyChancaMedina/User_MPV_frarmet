package com.example.thomychanca.finalthomy.domain.service;

import com.example.thomychanca.finalthomy.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by thomychanca on 11/03/2017.
 */

public class ServiceManager {
    public static WebService createWebService(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BuildConfig.API_ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final WebService mInterfaceServer=retrofit.create(WebService.class);
        return mInterfaceServer;
    }
}
