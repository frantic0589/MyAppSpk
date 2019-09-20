package com.example.myappspk.Interface;

import com.example.myappspk.Model.ModelFinRes.Finres;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetFinres {
    @GET("/spk-finans/api/v1/finres/{inn}")
    Call<Finres> getPostWithID(@Path("inn") String inn);
}
