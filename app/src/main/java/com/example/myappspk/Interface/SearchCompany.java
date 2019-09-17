package com.example.myappspk.Interface;

import com.example.myappspk.Model.Companies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SearchCompany {

    @GET("/inf-refbook-retriever/api/v5/search?")
    Call<Companies> getPostWithID(@Query("active") boolean activeComp, @Query("query") String searchComp, @Query("size") int sizeComp);
}
