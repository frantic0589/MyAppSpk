package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public    class СвОбрЮЛ {
    @SerializedName("кодСпОррЮЛ")
    @Expose
    public String кодСпОррЮЛ;
    @SerializedName("наимСпОбрЮЛ")
    @Expose
    public String наимСпОбрЮЛ;
    @SerializedName("грнДата")
    @Expose
    public ГрнДата ГрнДатаObject;
}
