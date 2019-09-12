package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class ОснВидДеятельности {
        @SerializedName("код")
        @Expose
        public String код;
        @SerializedName("наим")
        @Expose
        public String наим;
        @SerializedName("версия")
        @Expose
        public String версия;
        @SerializedName("грн")
        @Expose
        public Грн ГрнObject;
    }
