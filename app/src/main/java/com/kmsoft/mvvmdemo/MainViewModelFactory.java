//package com.kmsoft.mvvmdemo;
//
//import android.content.Context;
//import androidx.lifecycle.ViewModel;
//import androidx.lifecycle.ViewModelProvider;
//import androidx.recyclerview.widget.RecyclerView;
//
//public class MainViewModelFactory extends ViewModelProvider.NewInstanceFactory {
//
//    RecyclerView recyclerView;
//    Context context;
//
//    public MainViewModelFactory(Context context, RecyclerView recyclerView) {
//        this.recyclerView=recyclerView;
//        this.context=context;
//    }
//
//    @Override
//    public <T extends ViewModel> T create(Class<T> modelClass) {
//        //noinspection unchecked
//        return (T) new View_Modal(context,recyclerView);
//    }
//}
