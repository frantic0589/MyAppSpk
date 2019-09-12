package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class СвУстКап {
    @SerializedName("наимВидКап")
    @Expose
    public String наимВидКап;
    @SerializedName("сумКап")
    @Expose
    public float сумКап;
    @SerializedName("грнДата")
    @Expose
    public ГрнДата ГрнДатаObject;
}
