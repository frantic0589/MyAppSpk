package com.example.myappspk.Controller;

import com.example.myappspk.Interface.GetCompany;
import com.example.myappspk.Interface.GetMetrics;
import com.example.myappspk.Interface.SearchCompany;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {

    private static NetworkService mInstance;

    public static final String BASE_URL = "https://api-gw.esphere.ru";
    private Retrofit mRetrofit;

    private NetworkService() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static NetworkService getInstance() {
        if (mInstance == null) {
            mInstance = new NetworkService();
        }
        return mInstance;
    }

    public SearchCompany getSearchCompany()
    {
        return mRetrofit.create(SearchCompany.class);
    }

    public GetCompany getCompany()
    {
        return mRetrofit.create(GetCompany.class);
    }

    public GetMetrics getMetrics() {return mRetrofit.create(GetMetrics.class);}

}
