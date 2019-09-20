package com.example.myappspk.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myappspk.Adapter.CompanyAdapter;
import com.example.myappspk.Controller.NetworkService;
import com.example.myappspk.Model.Companies;
import com.example.myappspk.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StartActivity extends AppCompatActivity {

    private EditText editTextInput;
    private ViewFlipper viewFlipper;
    private RecyclerView recyclerViewItemCompany;
    private CompanyAdapter companyAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }

        editTextInput = findViewById(R.id.editTextSearch);
        viewFlipper = findViewById(R.id.viewFlipper);
        recyclerViewItemCompany = findViewById(R.id.recyclerViewItemCompany);


    }
    @Override
    protected void onStart(){
        super.onStart();
        if (companyAdapter != null){
            companyAdapter.notifyDataSetChanged();
        }
    }

    public void search(View view)
    {
        String searchText = editTextInput.getText().toString();

        NetworkService.getInstance()
                .getSearchCompany()
                .getPostWithID(true, searchText, 100)
                .enqueue(new Callback<Companies>() {
                    @Override
                    public void onResponse(Call<Companies> call, Response<Companies> response) {


                        Companies company = response.body();
                        try {
                            if (company.getTotal() != 0){
                                companyAdapter = new CompanyAdapter(company);
                                viewFlipper.setVisibility(View.GONE);
                                recyclerViewItemCompany.setVisibility(View.VISIBLE);
                                recyclerViewItemCompany.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                                recyclerViewItemCompany.setAdapter(companyAdapter);

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

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                Intent intent = new Intent(getApplicationContext(), CompanyActivity.class);

                intent.putExtra("inn", companyAdapter.getDocList().get(viewHolder.getAdapterPosition()).getInn());
                intent.putExtra("ogrn", companyAdapter.getDocList().get(viewHolder.getAdapterPosition()).getOgrn());
                startActivity(intent);
            }
        });
        itemTouchHelper.attachToRecyclerView(recyclerViewItemCompany);
    }
}
