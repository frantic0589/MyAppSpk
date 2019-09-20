package com.example.myappspk.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myappspk.Controller.NetworkService;
import com.example.myappspk.Model.ModelFinRes.Finres;
import com.example.myappspk.R;
import com.jjoe64.graphview.GraphView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FinanceActivity extends AppCompatActivity {
    private String inn;
    private GraphView graphView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);
        graphView = findViewById(R.id.graph);
        Intent intentEgr = getIntent();
        if (intentEgr.hasExtra("inn")){
            inn = intentEgr.getStringExtra("inn");
        }
        NetworkService.getInstance()
                .getFinres()
                .getPostWithID(inn)
                .enqueue(new Callback<Finres>() {
                    @Override
                    public void onResponse(Call<Finres> call, Response<Finres> response) {
                        Finres finres = response.body();
                    }

                    @Override
                    public void onFailure(Call<Finres> call, Throwable t) {

                    }
                });
    }
}
