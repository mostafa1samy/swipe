package com.example.mostafa.swip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.mostafa.swip.Api.Apimanger;
import com.example.mostafa.swip.model.Item;
import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Activity extends AppCompatActivity {
    SlidrInterface slidrInterface;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    Adpter adpter;
    List<Item>items;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView=findViewById(R.id.rec);
        items=new ArrayList<>();

        layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        Apimanger.getapis().getdate("cars").enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                if (response.code()==200)

                     items=response.body();
                Log.e("mo",items.toString());

            }

            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {

            }
        });
        adpter=new Adpter(this,items);
        recyclerView.setAdapter(adpter);
        recyclerView.setLayoutManager(layoutManager);


        slidrInterface= Slidr.attach(this);
    }

    public void lock(View view) {
        slidrInterface.lock();
    }

    public void unlock(View view) {
        slidrInterface.unlock();
    }
}
