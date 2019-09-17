package com.example.myappspk.Interface;

import com.example.myappspk.Model.ModelMetrics.Metrics;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetMetrics {
    @GET("/spk-metrics-retriever/api/v1/get?")
    Call<Metrics> getPostWithID(@Query("inn") String inn, @Query("ogrn") String ogrn, @Query("X-eSphereAuth-Api-Key") String apiKey);
}
