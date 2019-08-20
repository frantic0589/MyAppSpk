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
        String searchText = searchParameter.getText().toString();

        NetworkService.getInstance()
                .getSearchCompany()
                .getPostWithID(true, searchText, 10)
                .enqueue(new Callback<Companies>() {
                    @Override
                    public void onResponse(Call<Companies> call, Response<Companies> response) {


                        Companies company = response.body();
                        
                        responceText.append(company.getDocs() + "\n");
                        responceText.append(company.getTotal() + "\n");

                    }

                    @Override
                    public void onFailure(Call<Companies> call, Throwable t) {
                        responceText.append("Произошла ошибка при получении запроса!");
                        t.printStackTrace();
                    }
                });
    }
}
