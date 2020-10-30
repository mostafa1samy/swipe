package com.example.mostafa.swip.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apimanger {
    private  static Retrofit retrofit;
    static  Retrofit getinstance(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.googleapis.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            //build
        }
        return retrofit;

    }
    public  static Apiservice getapis(){

        return  getinstance().create(Apiservice.class);
    }
}
