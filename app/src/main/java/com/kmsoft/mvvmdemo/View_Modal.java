package com.kmsoft.mvvmdemo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class View_Modal extends ViewModel {

//    Repository repository;
//
//    public View_Modal(Context context, RecyclerView recyclerView) {
//        repository = new Repository(context,recyclerView);
//    }
//
//    public MutableLiveData<List<Modal>> getTasks() {
//        return repository.getTasks();
//    }
    Api_Interface api;
    MutableLiveData<List<Modal>> namelist = new MutableLiveData<>();

//    public View_Modal() {
//        loadHeroes();
//    }
//
//
//    public LiveData<List<Modal>> getName() {
//        return namelist;
//    }

    private void loadHeroes() {

//        api = Api_Instance.getRetrofitInstance().create(Api_Interface.class);

        Api_Instance.getInt().getData().enqueue(new Callback<List<Modal>>() {
            @Override
            public void onResponse(Call<List<Modal>> call, Response<List<Modal>> response) {
                namelist.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Modal>> call, Throwable t) {

            }
        });
//        Call<List<Modal>> call = api.getData();

//        call.enqueue(new Callback<List<Modal>>() {
//            @Override
//            public void onResponse(Call<List<Modal>> call, Response<List<Modal>> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<List<Modal>> call, Throwable t) {
//
//            }
//        });
    }
}

