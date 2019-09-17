package com.example.myappspk.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myappspk.Controller.NetworkService;
import com.example.myappspk.Model.CompanyInfoCategory;
import com.example.myappspk.Model.ModelCompany.Company;
import com.example.myappspk.R;

import iammert.com.expandablelib.ExpandCollapseListener;
import iammert.com.expandablelib.ExpandableLayout;
import iammert.com.expandablelib.Section;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CompanyActivity extends AppCompatActivity {

    private TextView textViewCompanyName;
    private TextView textViewInnKppOgrn;
    private TextView textViewAction;
    private String inn;
    private ExpandableLayout expandableLayout;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
        Intent main = getIntent();
        inn = main.getStringExtra("inn");
        textViewCompanyName = findViewById(R.id.textViewLayoutCompanyFullName);
        textViewInnKppOgrn = findViewById(R.id.textViewLayoutCompanyInnKppOgrn);
        textViewAction = findViewById(R.id.textViewlayoutCompanyActing);
        expandableLayout = findViewById(R.id.expandableCompanyInfo);

        expandableLayout.setRenderer(new ExpandableLayout.Renderer<CompanyInfoCategory, Company>() {
            @Override
            public void renderParent(View view, CompanyInfoCategory model, boolean isExpanded, int parentPosition) {
                ((TextView) view.findViewById(R.id.textViewParent)).setText(model.getCategory());
                view.findViewById(R.id.imageParent).setBackgroundResource(isExpanded?R.drawable.ic_keyboard_arrow_up_black_24dp:R.drawable.ic_keyboard_arrow_down_black_24dp);
            }

            @Override
            public void renderChild(View view, Company model, int parentPosition, int childPosition) {
                ((TextView)view.findViewById(R.id.layoutCompInfoName)).setText(model.имяПолное);
                ((TextView)view.findViewById(R.id.textViewDateOfCreate)).setText(model.датаОгрн);
                ((TextView)view.findViewById(R.id.layoutCompanyInfoAddress)).setText(model.getAddress());

            }
        });


        NetworkService.getInstance()
                .getCompany()
                .getPostWithID(inn)
                .enqueue(new Callback<Company>() {
                    @Override
                    public void onResponse(Call<Company> call, Response<Company> response) {
                        Company company = response.body();
                        textViewCompanyName.setText(company.имяКраткое);
                        textViewInnKppOgrn.setText(company.getInnKppOgrn());
                        textViewAction.setText(company.статусНаим);
                        Section<CompanyInfoCategory, Company> section = new Section<>();
                        section.expanded = false;
                        CompanyInfoCategory infoCategory = new CompanyInfoCategory("информация о компании");
                        section.parent = infoCategory;
                        section.children.add(company);
                        expandableLayout.addSection(section);
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
}
