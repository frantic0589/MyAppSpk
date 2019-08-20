package com.example.myappspk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    private EditText searchParameter;
    private TextView responceText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);

        searchParameter = (EditText) findViewById(R.id.editText);
        responceText = (TextView) findViewById(R.id.textView);
    }

    public void search(View view)
    {
        //String searchText = searchParameter.getText().toString();

        NetworkService.getInstance()
                .getSearchCompany()
                //.getPostWithID()
                .getPostWithID(true, "3849010290", 1)
                .enqueue(new Callback<CompanyCard>() {
                    @Override
                    public void onResponse(Call<CompanyCard> call, Response<CompanyCard> response) {


                        CompanyCard company = response.body();
                        
                        responceText.append(company.getFullName() + "\n");
                        responceText.append(company.getInn() + "\n");
                        responceText.append(company.getKpp() + "\n");
                    }

                    @Override
                    public void onFailure(Call<CompanyCard> call, Throwable t) {
                        responceText.append("Произошла ошибка при получении запроса!");
                        t.printStackTrace();
                    }
                });
    }
}
