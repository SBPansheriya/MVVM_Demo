//package com.kmsoft.mvvmdemo;
//
//import android.content.Context;
//
//import androidx.lifecycle.MutableLiveData;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//public class Repository {
//
//    Context context;
//    RecyclerView recyclerView;
//    public Repository(Context applicationContext,RecyclerView recyclerView) {
//        context=applicationContext;
//        this.recyclerView=recyclerView;
//    }
//
//    public MutableLiveData<List<Modal>> getTasks() {
//        Api_Interface service = Api_Instance.getRetrofitInstance().create(Api_Interface.class);
//        Call<List<Modal>> call = service.getData();
//
//        final MutableLiveData<List<Modal>> newsData = new MutableLiveData<>();
//        call.enqueue(new Callback<List<Modal>>() {
//            @Override
//            public void onResponse(Call<List<Modal>> call, Response<List<Modal>> response) {
//                newsData.setValue(response.body());
//            }
//
//            @Override
//            public void onFailure(Call<List<Modal>> call, Throwable t) {
//                System.out.println("onFailure");
//                newsData.setValue(null);
//            }
//        });
//        return newsData;
//    }
//}
