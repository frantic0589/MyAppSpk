package com.example.myappspk.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myappspk.R;
import com.example.myappspk.pojo.Doc;

import java.util.List;

public class DocAdapter extends BaseAdapter {

    private List<Doc> docs;
    private LayoutInflater layoutInflater;

    public DocAdapter(Context context, List<Doc> docs) {
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
        Doc doc = (Doc) getItem(position);

        TextView fullName = (TextView) view.findViewById(R.id.fullName);
        TextView inn = (TextView) view.findViewById(R.id.inn);
        TextView kpp = (TextView) view.findViewById(R.id.kpp);
        TextView ogrn = (TextView) view.findViewById(R.id.ogrn);
        TextView supervisor = (TextView) view.findViewById(R.id.supervisor);
        TextView supervisorInn = (TextView) view.findViewById(R.id.innSupervisor);

        fullName.setText(doc.getFullName());
        inn.setText("ИНН: " + doc.getInn());
        kpp.setText("КПП: " + doc.getKpp());
        ogrn.setText("ОГРН: " + doc.getOgrn());
        supervisor.setText("Руководитель: " + doc.getChiefs().get(0).getName());
        supervisorInn.setText("ИНН руководителя: " + doc.getChiefs().get(0).getInn());

        return view;
    }
}
