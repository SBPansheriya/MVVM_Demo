package com.kmsoft.mvvmdemo;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView_Adpater adapter;
    List<Modal> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        setupViewModel();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);


    }

    private void setupViewModel() {
//        MainViewModelFactory factory = new MainViewModelFactory(this,recyclerView);

        View_Modal viewModel =  new ViewModelProvider(this).get(View_Modal.class);
//        viewModel.loadHeroes();

        viewModel.namelist.observe(this,  new Observer<List<Modal>>(){
            @Override
            public void onChanged(List<Modal> list) {
                System.out.println(""+list);
                adapter = new RecyclerView_Adpater(MainActivity.this,list);
                recyclerView.setAdapter(adapter);
            }
        });
    }

    private void generateDataList( List<Modal> list) {

    }

}