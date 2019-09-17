package com.example.myappspk.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myappspk.Adapter.DocAdapter;
import com.example.myappspk.Controller.NetworkService;
import com.example.myappspk.Model.Companies;
import com.example.myappspk.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StartActivity extends AppCompatActivity {

    private EditText editTextInput;
    private ListView listViewCompany;
    private ViewFlipper viewFlipper;
    private List<Companies.Doc> companyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }

        editTextInput = findViewById(R.id.editTextSearch);
        listViewCompany = findViewById(R.id.listViewCompany);
        viewFlipper = findViewById(R.id.viewFlipper);

        listViewCompany.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intentCompany = new Intent(getApplicationContext(), CompanyActivity.class);
                intentCompany.putExtra("inn", companyList.get(i).getInn());
                startActivity(intentCompany);
            }
        });

    }


    public void search(View view)
    {
        String searchText = editTextInput.getText().toString();

        NetworkService.getInstance()
                .getSearchCompany()
                .getPostWithID(true, searchText, 10)
                .enqueue(new Callback<Companies>() {
                    @Override
                    public void onResponse(Call<Companies> call, Response<Companies> response) {


                        Companies company = response.body();
                        try {
                            if (company.getTotal() != 0){
                                companyList = company.getDocs();
                                DocAdapter docAdapter = new DocAdapter(getApplicationContext(), companyList);
                                viewFlipper.setVisibility(View.GONE);
                                listViewCompany.setVisibility(View.VISIBLE);
                                listViewCompany.setAdapter(docAdapter);
                            } else {

                                Toast.makeText(StartActivity.this, "Компаний не найдено, попробуйте еще раз!", Toast.LENGTH_LONG).show();

                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onFailure(Call<Companies> call, Throwable t) {
                        Toast.makeText(StartActivity.this, "Произошла ошибка при получении запроса!", Toast.LENGTH_SHORT).show();
                        t.printStackTrace();
                    }
                });

    }
}
