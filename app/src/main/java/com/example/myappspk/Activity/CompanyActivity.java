package com.example.myappspk.Activity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
    private LinearLayout linearLayout;
    private LinearLayout linearLayoutHeader;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
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
        linearLayout = findViewById(R.id.linearLayoutCompanyInfo);
        linearLayoutHeader = findViewById(R.id.linearLayoutHeader);
        linearLayout.setVisibility(View.GONE);



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

                        textViewAddress.setText(getAddrees(company.getСвАдрес()));
                        textViewPosition.setText(company.getСвДолжнФЛ().get(0).getНаимДолжн());
                        textViewFio.setText(company.getСвДолжнФЛ().get(0).getФио().getLastName() +" "+ company.getСвДолжнФЛ().get(0).getФио().getFirstName() +" "+company.getСвДолжнФЛ().get(0).getФио().getPatronymic());
                        textViewInnSupervisor.setText(company.getСвДолжнФЛ().get(0).getИнн());
                    }

                    @Override
                    public void onFailure(Call<Company> call, Throwable t) {
                        Toast toast = Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG);
                    }
                });
        linearLayoutHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (linearLayout.getVisibility() == View.GONE){
                    expand();
                }else{
                    collapse();
                }
            }
        });
    }

    private void expand(){
        linearLayout.setVisibility(View.VISIBLE);

        final int widthSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        final int heightSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);

        linearLayout.measure(widthSpec, heightSpec);

        ValueAnimator animator = slideAnimator(0, linearLayout.getMeasuredHeight());
        animator.start();
    }
    private void collapse(){
        int finalHeight = linearLayout.getHeight();
        ValueAnimator animator = slideAnimator(finalHeight, 0);
        animator.start();
    }

    private ValueAnimator slideAnimator(int start, int end) {
        ValueAnimator animator = ValueAnimator.ofInt(start, end);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int value = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.height = value;
                linearLayout.setLayoutParams(layoutParams);
            }
        });
    return animator;
    }
    private String getAddrees(Company.СвАдрес address){
        StringBuilder builder = new StringBuilder();
        if (address.getАдресРФ().getИндекс() != null) {
            builder.append(address.getАдресРФ().getИндекс() + ", ");
        } else if ((address.getАдресРФ().getРегион().getТип() != null) && (address.getАдресРФ().getРегион().getНаименование() != null)){
            builder.append(address.getАдресРФ().getРегион().getТип() +" "+ address.getАдресРФ().getРегион().getНаименование() +", ");
        }else if ((address.getАдресРФ().getГород().getТип() != null) && (address.getАдресРФ().getГород().getНаименование() != null)){
            builder.append(address.getАдресРФ().getГород().getТип() +" "+ address.getАдресРФ().getГород().getНаименование()+ ", ");
        }else if ((address.getАдресРФ().getУлица().getТип() != null) && (address.getАдресРФ().getУлица().getНаименование() != null)){
            builder.append(address.getАдресРФ().getУлица().getТип()+ " " +address.getАдресРФ().getУлица().getНаименование()+ ", ");
        }else if ((address.getАдресРФ().getДом() != null)){
            builder.append(address.getАдресРФ().getДом() + ", ");
        }else if ((address.getАдресРФ().getКварт() != null)){
            builder.append(address.getАдресРФ().getКварт());
        }
        return builder.toString();
    }
}
