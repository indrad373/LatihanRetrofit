package com.example.user.latihanretrofit.api;

import android.util.Log;

public class NetworkServices {

    private static final String RETROFIT_HOST_URL_API = "http://169.254.81.90/backendAPI-master";
    private static final String RETROFIT_API_TYPE = "/mobile/";
    private static final String RETROFIT_BASE_URL_API = RETROFIT_HOST_URL_API + RETROFIT_API_TYPE;

    public static EmartApiServices getLinkversalApiServices() {
        Log.d("TES", "Build");

        return RetrofitClient.getClient(RETROFIT_BASE_URL_API).create(EmartApiServices.class);
    }

}
