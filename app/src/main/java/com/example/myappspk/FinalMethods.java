package com.example.myappspk;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FinalMethods {

    @GET("/inf-refbook-retriever/api/v5/search?")
    public Call<Companies> getPostWithID(@Query("active") boolean activeComp, @Query("query") String searchComp, @Query("size") int sizeComp);

    //@GET("/inf-refbook-retriever/api/v5/search?active=true&query=3849010290&size=10")
    //public Call<CompanyCard> getPostWithID();
}
