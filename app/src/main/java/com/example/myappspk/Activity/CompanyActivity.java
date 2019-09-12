package com.example.myappspk.Activity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myappspk.Controller.NetworkService;
import com.example.myappspk.Model.Company;
import com.example.myappspk.Model.CompanyInfoCategory;
import com.example.myappspk.R;

import iammert.com.expandablelib.ExpandCollapseListener;
import iammert.com.expandablelib.ExpandableLayout;
import iammert.com.expandablelib.Section;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CompanyActivity extends AppCompatActivity {

    private String inn;
//    private TextView textViewFullName;
//    private TextView textViewInnKppOgrn;
//    private TextView textViewActing;
//    private TextView textViewtCompanyName;
//    private TextView textViewDateFormed;
//    private TextView textViewAddress;
//    private TextView textViewNumOfEmployees;
//    private TextView textViewNalog;
//    private TextView textViewKgn;
//    private TextView textViewPosition;
//    private TextView textViewFio;
//    private TextView textViewInnSupervisor;
//    private LinearLayout linearLayout;
//    private LinearLayout linearLayoutHeader;
    private ExpandableLayout expandableLayout;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
        Intent main = getIntent();
        inn = main.getStringExtra("inn");

        expandableLayout = findViewById(R.id.expandableCompanyInfo);
        expandableLayout.setRenderer(new ExpandableLayout.Renderer<CompanyInfoCategory, Company>() {
            @Override
            public void renderParent(View view, CompanyInfoCategory model, boolean isExpanded, int parentPosition) {
                ((TextView) view.findViewById(R.id.textViewParent)).setText(model.getCategory());
                view.findViewById(R.id.imageParent).setBackgroundResource(isExpanded?R.drawable.ic_keyboard_arrow_up_black_24dp:R.drawable.ic_keyboard_arrow_down_black_24dp);
            }

            @Override
            public void renderChild(View view, Company model, int parentPosition, int childPosition) {
                ((TextView)view.findViewById(R.id.textViewCompanyInfo)).setText(model.имяПолное + model.инн);
            }
        });


        NetworkService.getInstance()
                .getCompany()
                .getPostWithID(inn)
                .enqueue(new Callback<Company>() {
                    @Override
                    public void onResponse(Call<Company> call, Response<Company> response) {
                        Company company = response.body();

                        Section<CompanyInfoCategory, Company> section = new Section<>();
                        section.expanded = false;
                        CompanyInfoCategory infoCategory = new CompanyInfoCategory("информация о компании");
                        section.parent = infoCategory;
                        section.children.add(company);
                        expandableLayout.addSection(section);
//                        textViewFullName.setText(company.getИмяПолное());
//                        if (company.getКпп() != null){
//                            textViewInnKppOgrn.setText(String.format("ИНН: %s, КПП: %s, ОГРН: %s", company.getИнн(), company.getКпп(), company.getОгрн()));
//                        } else {
//                            textViewInnKppOgrn.setText(String.format("ИНН: %s, , ОГРН: %s", company.getИнн(), company.getОгрн()));
//                        }
//                        textViewActing.setText(company.getСтатусНаим());
//                        textViewtCompanyName.setText(company.getИмяПолное());
//                        textViewDateFormed.setText(company.getДатаОгрн());
//
//                        textViewAddress.setText(getAddrees(company.getСвАдрес()));
//                        textViewPosition.setText(company.getСвДолжнФЛ().get(0).getНаимДолжн());
//                        textViewFio.setText(company.getСвДолжнФЛ().get(0).getФио().getLastName() +" "+ company.getСвДолжнФЛ().get(0).getФио().getFirstName() +" "+company.getСвДолжнФЛ().get(0).getФио().getPatronymic());
//                        textViewInnSupervisor.setText(company.getСвДолжнФЛ().get(0).getИнн());
                    }

                    @Override
                    public void onFailure(Call<Company> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG);
                    }
                });
        
        expandableLayout.setCollapseListener(new ExpandCollapseListener.CollapseListener<CompanyInfoCategory>() {
            @Override
            public void onCollapsed(int parentIndex, CompanyInfoCategory parent, View view) {
                view.findViewById(R.id.imageParent).setBackgroundResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
            }
        });
        expandableLayout.setExpandListener(new ExpandCollapseListener.ExpandListener<CompanyInfoCategory>() {
            @Override
            public void onExpanded(int parentIndex, CompanyInfoCategory parent, View view) {
                view.findViewById(R.id.imageParent).setBackgroundResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
            }
        });
    }
//    private String getAddrees(Company.СвАдрес address){
//        StringBuilder builder = new StringBuilder();
//        if (address.getАдресРФ().getИндекс() != null) {
//            builder.append(address.getАдресРФ().getИндекс() + ", ");
//        }
//        if (address.getАдресРФ().getРегион() != null){
//            builder.append(address.getАдресРФ().getРегион().getТип() +" "+ address.getАдресРФ().getРегион().getНаименование() +", ");
//        }
//        if (address.getАдресРФ().getГород() != null){
//            builder.append(address.getАдресРФ().getГород().getТип() +" "+ address.getАдресРФ().getГород().getНаименование()+ ", ");
//        }
//        if (address.getАдресРФ().getУлица() != null){
//            builder.append(address.getАдресРФ().getУлица().getТип()+ " " +address.getАдресРФ().getУлица().getНаименование()+ ", ");
//        }
//        if (address.getАдресРФ().getДом() != null){
//            builder.append(address.getАдресРФ().getДом() + ", ");
//        }
//        if (address.getАдресРФ().getКварт() != null){
//            builder.append(address.getАдресРФ().getКварт());
//        }
//        return builder.toString();
//    }
}
