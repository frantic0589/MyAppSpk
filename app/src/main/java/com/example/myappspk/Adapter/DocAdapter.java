package com.example.myappspk.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myappspk.Model.Companies;
import com.example.myappspk.R;

import java.util.List;

public class DocAdapter extends BaseAdapter {

    private List<Companies.Doc> docs;
    private LayoutInflater layoutInflater;

    public DocAdapter(Context context, List<Companies.Doc> docs) {
        this.docs = docs;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount(){
        return docs.size();
    }

    @Override
    public Object getItem(int position){
        return docs.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View view = convertView;

        if(view == null){
            view = layoutInflater.inflate(R.layout.company_item_layout, parent, false);
        }
        Companies.Doc doc = (Companies.Doc) getItem(position);

        TextView fullName = view.findViewById(R.id.fullName);
        TextView inn = view.findViewById(R.id.inn);
        TextView kpp = view.findViewById(R.id.kpp);
        TextView ogrn = view.findViewById(R.id.ogrn);
        TextView supervisor =  view.findViewById(R.id.supervisor);
        TextView supervisorInn = view.findViewById(R.id.innSupervisor);
        TextView industry = view.findViewById(R.id.industry);

        fullName.setText(doc.getShortName());
        inn.setText("ИНН: " + doc.getInn());
        if (doc.getKpp() != null){
            kpp.setText("КПП: " + doc.getKpp());
        }
        ogrn.setText("ОГРН: " + doc.getOgrn());
        if (doc.getChiefs() != null) {
            supervisor.setText(doc.getChiefs().get(0).getName());
            supervisorInn.setText("ИНН: " + doc.getChiefs().get(0).getInn().trim());
        }
        industry.setText(doc.getCoreActivity());

        return view;
    }
}
