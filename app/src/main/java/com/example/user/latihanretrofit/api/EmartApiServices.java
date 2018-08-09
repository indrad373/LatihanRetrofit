package com.example.user.latihanretrofit.api;


import com.example.user.latihanretrofit.api.model.AuthModel;
import com.example.user.latihanretrofit.api.model.Login;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface EmartApiServices {

    @Headers("Content-Type: application/json")
    @POST("User/login")
    Call<ResponseBody> user(@Body Login login);

    @Headers("Content-Type: application/json")
    @POST("User/register")
    Call<ResponseBody> register(@Body AuthModel authModel);

}
