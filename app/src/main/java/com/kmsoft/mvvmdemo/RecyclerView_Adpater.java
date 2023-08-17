package com.kmsoft.mvvmdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerView_Adpater extends RecyclerView.Adapter<RecyclerView_Adpater.ViewHolder> {
    MainActivity mainActivity;
    List<Modal> list;
    public RecyclerView_Adpater(MainActivity mainActivity, List<Modal> list) {
        this.mainActivity = mainActivity;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView_Adpater.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.recyclerview_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView_Adpater.ViewHolder holder, int position) {
        holder.name.setText(list.get(position).getName());
        System.out.println(""+list.get(position).getName());
        holder.id1.setText(list.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,id1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            id1 = itemView.findViewById(R.id.id1);
        }
    }
}
