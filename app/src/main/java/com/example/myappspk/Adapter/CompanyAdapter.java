package com.example.myappspk.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myappspk.Model.Companies;
import com.example.myappspk.R;

import java.util.List;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.CompanyViewHolder> {

    public List<Companies.Doc> getDocList() {
        return docList;
    }

    List<Companies.Doc> docList;

    public CompanyAdapter(Companies companies) {
        this.docList = companies.getDocs();
    }

    @NonNull
    @Override
    public CompanyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_company, parent, false);
        return new CompanyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyViewHolder holder, int position) {
        Companies.Doc doc = docList.get(position);
        holder.textViewItemCompanyName.setText(doc.getShortName());
        if (doc.getKpp() != null){
            holder.textViewItemInnKppOgrn.setText(String.format("ИНН: %s, КПП: %s, ОГРН: %s", doc.getInn(), doc.getKpp(), doc.getOgrn()));
        } else {
            holder.textViewItemInnKppOgrn.setText(String.format("ИНН: %s, ОГРН: %s", doc.getInn(), doc.getOgrn()));
        }
        holder.textViewItemActive.setText(doc.getStatusName());
        if (doc.getChiefs() != null){
            holder.textViewItemSupervisor.setText(doc.getChiefs().get(0).getName());
            holder.textViewItemInnSupervisor.setText(" ИНН: " + doc.getChiefs().get(0).getInn());
        }
        holder.textViewItemServicesSector.setText(doc.getIndustry().getName());
    }

    @Override
    public int getItemCount() {
        return docList.size();
    }

    class CompanyViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewItemCompanyName;
        private TextView textViewItemInnKppOgrn;
        private TextView textViewItemActive;
        private TextView textViewItemSupervisor;
        private TextView textViewItemInnSupervisor;
        private TextView textViewItemServicesSector;

        public CompanyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewItemCompanyName = itemView.findViewById(R.id.textViewItemCardCompanyName);
            textViewItemInnKppOgrn = itemView.findViewById(R.id.textViewItemCardInnKppOgrn);
            textViewItemActive = itemView.findViewById(R.id.textViewItemCardActive);
            textViewItemSupervisor = itemView.findViewById(R.id.textViewItemCardSupervisor);
            textViewItemInnSupervisor = itemView.findViewById(R.id.textViewItemCardInnSupervisor);
            textViewItemServicesSector = itemView.findViewById(R.id.textViewServicesSector);
        }
    }
}
