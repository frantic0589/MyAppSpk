package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

import lombok.Data;

@Data

public class Company {
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("source")
    @Expose
    public String source;
    @SerializedName("update")
    @Expose
    public String update;
    @SerializedName("тип")
    @Expose
    public String тип;
    @SerializedName("датаВып")
    @Expose
    public String датаВып;
    @SerializedName("датаОгрн")
    @Expose
    public String датаОгрн;
    @SerializedName("огрн")
    @Expose
    public String огрн;
    @SerializedName("инн")
    @Expose
    public String инн;
    @SerializedName("статусНаим")
    @Expose
    public String статусНаим;
    @SerializedName("статусКод")
    @Expose
    public String статусКод;
    @SerializedName("имяПолное")
    @Expose
    public String имяПолное;
    @SerializedName("имяКраткое")
    @Expose
    public String имяКраткое;
    @SerializedName("свУчетНО")
    @Expose
    public СвУчетНО СвУчетНОObject;
    @SerializedName("свРегОрг")
    @Expose
    public СвРегОрг СвРегОргObject;
    @SerializedName("свРегПФ")
    @Expose
    public СвРегПФ СвРегПФObject;
    @SerializedName("свРегФСС")
    @Expose
    public СвРегФСС СвРегФССObject;
    @SerializedName("оснВидДеятельности")
    @Expose
    public ОснВидДеятельности ОснВидДеятельностиObject;
    @SerializedName("допВидДеятельности")
    @Expose
    public ArrayList<Object> допВидДеятельности = new ArrayList<Object>();
    @SerializedName("свЗап")
    @Expose
    public ArrayList<Object> свЗап = new ArrayList<Object>();
    @SerializedName("кпп")
    @Expose
    public String кпп;
    @SerializedName("спрОПФ")
    @Expose
    public String спрОПФ;
    @SerializedName("кодОПФ")
    @Expose
    public String кодОПФ;
    @SerializedName("наимГрнДата")
    @Expose
    public НаимГрнДата НаимГрнДатаObject;
    @SerializedName("полнНаимОПФ")
    @Expose
    public String полнНаимОПФ;
    @SerializedName("свАдрес")
    @Expose
    public СвАдрес СвАдресObject;
    @SerializedName("свОбрЮЛ")
    @Expose
    public СвОбрЮЛ СвОбрЮЛObject;
    @SerializedName("свУстКап")
    @Expose
    public СвУстКап СвУстКапObject;
    @SerializedName("учрФЛ")
    @Expose
    public ArrayList<Object> учрФЛ = new ArrayList<Object>();
    @SerializedName("свДолжнФЛ")
    @Expose
    public ArrayList<свДолжнФЛ> свДолжнФЛ = new ArrayList<свДолжнФЛ>();
    @SerializedName("свУпрОрг")
    @Expose
    public CвУпрОрг CвУпрОрг;

    public String getAddress(){
        StringBuilder builder = new StringBuilder();
        if (СвАдресObject.АдресРФObject.индекс != null) {
            builder.append(СвАдресObject.АдресРФObject.индекс + ", ");
        }
        if (СвАдресObject.АдресРФObject.РегионObject.тип != null){
            builder.append(СвАдресObject.АдресРФObject.РегионObject.тип + " ");
            if (СвАдресObject.АдресРФObject.РегионObject.наименование != null){
                builder.append(СвАдресObject.АдресРФObject.РегионObject.наименование + ", ");
            }
        }
        if (СвАдресObject.АдресРФObject.ГородObject.тип != null){
            builder.append(СвАдресObject.АдресРФObject.ГородObject.тип +" ");
            if (СвАдресObject.АдресРФObject.ГородObject.наименование != null){
                builder.append(СвАдресObject.АдресРФObject.ГородObject.наименование + ", ");
            }
        }
        if (СвАдресObject.АдресРФObject.УлицаObject.тип != null){
            builder.append(СвАдресObject.АдресРФObject.УлицаObject.тип+ " ");
            if (СвАдресObject.АдресРФObject.УлицаObject.наименование != null){
                builder.append(СвАдресObject.АдресРФObject.УлицаObject.наименование + ", ");
            }
        }
        if (СвАдресObject.АдресРФObject.дом != null){
            builder.append(СвАдресObject.АдресРФObject.дом + ", ");
        }
        if (СвАдресObject.АдресРФObject.кварт != null){
            builder.append(СвАдресObject.АдресРФObject.кварт);
        }
        return builder.toString();
    }

    public String getInnKppOgrn(){
        if (кпп != null){
            return String.format("ИНН: %s, КПП: %s, ОГРН: %s", инн, кпп, огрн);
        } else {
            return String.format("ИНН: %s, ОГРНИП: %s", инн, огрн);
        }
    }

    public String getInfoAboutSupervisor(){
        if (свДолжнФЛ != null) {
            com.example.myappspk.Model.ModelCompany.свДолжнФЛ supervisor = свДолжнФЛ.get(0);
            return String.format("%s\n%s %s %s", supervisor.наимДолжн, supervisor.фио.lastName, supervisor.фио.firstName, supervisor.фио.patronymic);
        } else {
            return String.format("Управляющая организация\n%s\nИНН %s ОГРН %s", CвУпрОрг.наимЮЛПолн, CвУпрОрг.инн, CвУпрОрг.грнДата.грн );
        }
    }
}


