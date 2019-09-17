package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
class CвУпрОрг {
    @SerializedName("огрн")
    @Expose
    public String огрн;
    @SerializedName("инн")
    @Expose
    public String инн;
    @SerializedName("наимЮЛПолн")
    @Expose
    public String наимЮЛПолн;
    @SerializedName("грнДата")
    @Expose
    public ГрнДата грнДата;
}
