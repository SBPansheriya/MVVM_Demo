package com.kmsoft.mvvmdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api_Interface {

    @GET("get")
    public Call<List<Modal>> getData();

    @FormUrlEncoded
    @POST("insert")
    public Call<Modal> insertData(@Field("name") String name);
}
