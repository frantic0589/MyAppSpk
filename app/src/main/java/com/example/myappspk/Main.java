package com.example.myappspk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myappspk.adapter.DocAdapter;
import com.example.myappspk.pojo.Companies;
import com.example.myappspk.pojo.Doc;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main extends AppCompatActivity {

    private EditText editTextInput;
    private ListView listViewCompany;
    private LinearLayout layoutBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }

        editTextInput = findViewById(R.id.editTextSearch);
        listViewCompany = findViewById(R.id.lisrViewCompany);
        layoutBody = findViewById(R.id.layoutBody);

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
                        if (company.getTotal() != 0){
                            List<Doc> companyList = company.getDocs();
                            DocAdapter docAdapter = new DocAdapter(getApplicationContext(), companyList);
                            layoutBody.setVisibility(View.INVISIBLE);
                            listViewCompany.setVisibility(View.VISIBLE);
                            listViewCompany.setAdapter(docAdapter);
                        } else {

                            Toast.makeText(Main.this, "Компаний не найдено, попробуйте еще раз!", Toast.LENGTH_LONG).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Companies> call, Throwable t) {
                        Toast.makeText(Main.this, "Произошла ошибка при получении запроса!", Toast.LENGTH_SHORT).show();
                        t.printStackTrace();
                    }
                });

    }
}
