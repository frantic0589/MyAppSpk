package com.example.myappspk;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.myappspk.adapter.DocAdapter;
import com.example.myappspk.pojo.Companies;
import com.example.myappspk.pojo.Doc;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    private EditText searchParameter;
    private Context contextI = this;
    private ListView listView;
    private ScrollView scrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);

        searchParameter = findViewById(R.id.editTextSearch);
        listView = findViewById(R.id.list_view);
        scrollView = findViewById(R.id.scrollView);
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
                        List<Doc> companyList = company.getDocs();

                        DocAdapter docAdapter = new DocAdapter(contextI, companyList);
                        scrollView.setVisibility(View.INVISIBLE);
                        listView.setAdapter(docAdapter);
                    }

                    @Override
                    public void onFailure(Call<Companies> call, Throwable t) {
                        TextView errorText = new TextView(contextI);
                        errorText.setText("Произошла ошибка при получении запроса!");
                        t.printStackTrace();
                    }
                });

    }
}
