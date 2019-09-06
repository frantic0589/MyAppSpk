package com.example.myappspk.Interface;

import com.example.myappspk.Model.Company;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetCompany {
    @GET("api/v5/get?")
    Call<Company> getPostWithID(@Query("inn") String inn);
}