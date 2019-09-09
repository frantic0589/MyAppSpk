package com.example.myappspk.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myappspk.Controller.NetworkService;
import com.example.myappspk.Model.Company;
import com.example.myappspk.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CompanyActivity extends AppCompatActivity {

    private String inn;
    private TextView textViewFullName;
    private TextView textViewInnKppOgrn;
    private TextView textViewActing;
    private TextView textViewtCompanyName;
    private TextView textViewDateFormed;
    private TextView textViewAddress;
//    private TextView textViewNumOfEmployees;
//    private TextView textViewNalog;
//    private TextView textViewKgn;
    private TextView textViewPosition;
    private TextView textViewFio;
    private TextView textViewInnSupervisor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
        Intent main = getIntent();
        inn = main.getStringExtra("inn");

        textViewFullName = findViewById(R.id.textViewFullName);
        textViewInnKppOgrn = findViewById(R.id.textViewInnKppOgrn);
        textViewActing = findViewById(R.id.textViewActing);
        textViewtCompanyName = findViewById(R.id.textViewCompanyName);
        textViewDateFormed = findViewById(R.id.textViewDateFormed);
        textViewAddress = findViewById(R.id.textViewAddress);
//        textViewNumOfEmployees = findViewById(R.id.textViewNumOfEmployees);
//        textViewNalog = findViewById(R.id.textViewNalog);
//        textViewKgn = findViewById(R.id.textViewKgn);
        textViewPosition = findViewById(R.id.textViewPosition);
        textViewFio = findViewById(R.id.textViewFio);
        textViewInnSupervisor = findViewById(R.id.textViewInnSupervisor);


        NetworkService.getInstance()
                .getCompany()
                .getPostWithID(inn)
                .enqueue(new Callback<Company>() {
                    @Override
                    public void onResponse(Call<Company> call, Response<Company> response) {
                        Company company = response.body();
                        textViewFullName.setText(company.getИмяПолное());
                        if (company.getКпп() != null){
                            textViewInnKppOgrn.setText(String.format("ИНН: %s, КПП: %s, ОГРН: %s", company.getИнн(), company.getКпп(), company.getОгрн()));
                        } else {
                            textViewInnKppOgrn.setText(String.format("ИНН: %s, , ОГРН: %s", company.getИнн(), company.getОгрн()));
                        }
                        textViewActing.setText(company.getСтатусНаим());
                        textViewtCompanyName.setText(company.getИмяПолное());
                        textViewDateFormed.setText(company.getДатаОгрн());
                        textViewAddress.setText(company.getСвАдрес().getАдресРФ().getИндекс() +", "+ company.getСвАдрес().getАдресРФ().getРегион().getТип() +" "+company.getСвАдрес().getАдресРФ().getРегион().getТип()
                                +", "+company.getСвАдрес().getАдресРФ().getУлица().getТип()+" "+company.getСвАдрес().getАдресРФ().getУлица().getТип()+", "+company.getСвАдрес().getАдресРФ().getДом() +", "+company.getСвАдрес().getАдресРФ().getКварт());
                        textViewPosition.setText(company.getСвДолжнФЛ().get(0).getНаимДолжн());
                        textViewFio.setText(company.getСвДолжнФЛ().get(0).getФио().getLastName() +" "+ company.getСвДолжнФЛ().get(0).getФио().getFirstName() +" "+company.getСвДолжнФЛ().get(0).getФио().getPatronymic());
                        textViewInnSupervisor.setText(company.getСвДолжнФЛ().get(0).getИнн());
                    }

                    @Override
                    public void onFailure(Call<Company> call, Throwable t) {

                    }
                });
    }
}
