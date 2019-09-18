package com.example.myappspk.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myappspk.Controller.NetworkService;
import com.example.myappspk.Model.CompanyInfoCategory;
import com.example.myappspk.Model.ModelCompany.Company;
import com.example.myappspk.Model.ModelMetrics.Metrics;
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
    private String ogrn;
    private final String API_KEY = "38fdbacf-2ed8-410b-a7af-160758ddc549";
    private ExpandableLayout expandableLayout;

    private ImageView imageViewTrafficCompany;
    private TextView textViewTrifficCompany;
    private TextView textViewTraffiсDataCompany;

    private ImageView imageViewTrafficFinances;
    private TextView textViewTrafficFinances;
    private TextView textViewTrafficDataFinances;

    private ImageView imageViewTrafficRisks;
    private TextView textViewTrafficRisks;
    private TextView textViewTrafficDataRisks;

    private ImageView imageViewTrafficCсontract;
    private TextView textViewTrafficContract;
    private TextView textViewTrafficDataContract;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
        Intent main = getIntent();
        inn = main.getStringExtra("inn");
        ogrn = main.getStringExtra("ogrn");
        textViewCompanyName = findViewById(R.id.textViewLayoutCompanyFullName);
        textViewInnKppOgrn = findViewById(R.id.textViewLayoutCompanyInnKppOgrn);
        textViewAction = findViewById(R.id.textViewlayoutCompanyActing);
        expandableLayout = findViewById(R.id.expandableCompanyInfo);

        imageViewTrafficCompany = findViewById(R.id.traffic_light_company);
        textViewTrifficCompany = findViewById(R.id.textViewCompany);
        textViewTraffiсDataCompany = findViewById(R.id.textViewDataCompany);

        imageViewTrafficFinances = findViewById(R.id.traffic_light_finances);
        textViewTrafficFinances = findViewById(R.id.textViewFinances);
        textViewTrafficDataFinances = findViewById(R.id.textViewDataFinances);

        imageViewTrafficRisks = findViewById(R.id.traffic_light_risk);
        textViewTrafficRisks = findViewById(R.id.textViewRisk);
        textViewTrafficDataRisks = findViewById(R.id.textViewDataRisk);

        imageViewTrafficCсontract = findViewById(R.id.traffic_light_сontract);
        textViewTrafficContract = findViewById(R.id.textViewContract);
        textViewTrafficDataContract = findViewById(R.id.textViewDataContract);

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
                .getMetrics()
                .getPostWithID(inn, ogrn, API_KEY)
                .enqueue(new Callback<Metrics>() {
                    @Override
                    public void onResponse(Call<Metrics> call, Response<Metrics> response) {
                        Metrics metrics = response.body();
                        textViewTrifficCompany.setText(metrics.getSections().getCOMPANY().getTitle());
                        switch (metrics.getSections().getCOMPANY().getValue()) {
                            case (-1):
                                imageViewTrafficCompany.setImageResource(R.drawable.ic_grey_traffic_light);
                                textViewTraffiсDataCompany.setText(R.string.not_data_traffic);
                                textViewTraffiсDataCompany.setTextColor(getColor(R.color.text_grey));
                                break;
                            case (0):
                                imageViewTrafficCompany.setImageResource(R.drawable.ic_red_traffic_light);
                                textViewTraffiсDataCompany.setText(R.string.negative_factors_traffic);
                                textViewTraffiсDataCompany.setTextColor(getColor(R.color.text_red));
                                break;
                            case (1):
                                imageViewTrafficCompany.setImageResource(R.drawable.ic_orange_traffic_light);
                                textViewTraffiсDataCompany.setText(R.string.attention_traffic);
                                textViewTraffiсDataCompany.setTextColor(getColor(R.color.text_orange));
                                break;
                            case (2):
                                imageViewTrafficCompany.setImageResource(R.drawable.ic_green_traffic_light);
                                textViewTraffiсDataCompany.setText(R.string.all_good_traffic);
                                textViewTraffiсDataCompany.setTextColor(getColor(R.color.text_green));
                                break;
                        }
                        textViewTrafficFinances.setText(metrics.getSections().getFINANCE().getTitle());
                        switch (metrics.getSections().getFINANCE().getValue()) {
                            case (-1):
                                imageViewTrafficFinances.setImageResource(R.drawable.ic_grey_traffic_light);
                                textViewTrafficDataFinances.setText(R.string.not_data_traffic);
                                textViewTrafficDataFinances.setTextColor(getColor(R.color.text_grey));
                                break;
                            case (0):
                                imageViewTrafficFinances.setImageResource(R.drawable.ic_red_traffic_light);
                                textViewTrafficDataFinances.setText(R.string.negative_factors_traffic);
                                textViewTrafficDataFinances.setTextColor(getColor(R.color.text_red));
                                break;
                            case (1):
                                imageViewTrafficFinances.setImageResource(R.drawable.ic_orange_traffic_light);
                                textViewTrafficDataFinances.setText(R.string.attention_traffic);
                                textViewTrafficDataFinances.setTextColor(getColor(R.color.text_orange));
                                break;
                            case (2):
                                imageViewTrafficFinances.setImageResource(R.drawable.ic_green_traffic_light);
                                textViewTrafficDataFinances.setText(R.string.all_good_traffic);
                                textViewTrafficDataFinances.setTextColor(getColor(R.color.text_green));
                                break;
                        }
                        textViewTrafficRisks.setText(metrics.getSections().getBUSINESSRISKS().getTitle());
                        switch (metrics.getSections().getBUSINESSRISKS().getValue()) {
                            case (-1):
                                imageViewTrafficRisks.setImageResource(R.drawable.ic_grey_traffic_light);
                                textViewTrafficDataRisks.setText(R.string.not_data_traffic);
                                textViewTrafficDataRisks.setTextColor(getColor(R.color.text_grey));
                                break;
                            case (0):
                                imageViewTrafficRisks.setImageResource(R.drawable.ic_red_traffic_light);
                                textViewTrafficDataRisks.setText(R.string.negative_factors_traffic);
                                textViewTrafficDataRisks.setTextColor(getColor(R.color.text_red));
                                break;
                            case (1):
                                imageViewTrafficRisks.setImageResource(R.drawable.ic_orange_traffic_light);
                                textViewTrafficDataRisks.setText(R.string.attention_traffic);
                                textViewTrafficDataRisks.setTextColor(getColor(R.color.text_orange));
                                break;
                            case (2):
                                imageViewTrafficRisks.setImageResource(R.drawable.ic_green_traffic_light);
                                textViewTrafficDataRisks.setText(R.string.all_good_traffic);
                                textViewTrafficDataRisks.setTextColor(getColor(R.color.text_green));
                                break;
                        }
                        textViewTrafficContract.setText(metrics.getSections().getGZ().getTitle());
                        switch (metrics.getSections().getGZ().getValue()) {
                            case (-1):
                                imageViewTrafficCсontract.setImageResource(R.drawable.ic_grey_traffic_light);
                                textViewTrafficDataContract.setText(R.string.not_data_traffic);
                                textViewTrafficDataContract.setTextColor(getColor(R.color.text_grey));
                                break;
                            case (0):
                                imageViewTrafficCсontract.setImageResource(R.drawable.ic_red_traffic_light);
                                textViewTrafficDataContract.setText(R.string.negative_factors_traffic);
                                textViewTrafficDataContract.setTextColor(getColor(R.color.text_red));
                                break;
                            case (1):
                                imageViewTrafficCсontract.setImageResource(R.drawable.ic_orange_traffic_light);
                                textViewTrafficDataContract.setText(R.string.attention_traffic);
                                textViewTrafficDataContract.setTextColor(getColor(R.color.text_orange));
                                break;
                            case (2):
                                imageViewTrafficCсontract.setImageResource(R.drawable.ic_green_traffic_light);
                                textViewTrafficDataContract.setText(R.string.all_good_traffic);
                                textViewTrafficDataContract.setTextColor(getColor(R.color.text_green));
                                break;
                        }
                    }

                    @Override
                    public void onFailure(Call<Metrics> call, Throwable t) {

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
