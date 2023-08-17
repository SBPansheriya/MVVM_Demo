package com.kmsoft.mvvmdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api_Instance {

    public static final String BASE_URL = "http://43.240.11.169:4000/";
    private static Api_Instance instance;
    private static Api_Interface apiInterface;

    public Api_Instance() {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            apiInterface = retrofit.create(Api_Interface.class);
        }
    public static Api_Instance getInt(){
        if(null==instance){
            instance=new Api_Instance();
        }
        return instance;
    }

    public Call<List<Modal>> getData(){
       return apiInterface.getData();
    }
}

