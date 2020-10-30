package com.example.mostafa.swip.Api;

import com.example.mostafa.swip.model.Item;
import com.example.mostafa.swip.model.Total;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apiservice {
    @GET("books/v1/volumes")
    Call<List<Item>>getdate(@Query("q")String q);
}
