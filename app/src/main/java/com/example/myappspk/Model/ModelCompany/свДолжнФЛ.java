package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class свДолжнФЛ{
        @SerializedName("фио")
        @Expose
        public Фио фио;
        @SerializedName("инн")
        @Expose
        public String инн;
        @SerializedName("видДолжн")
        @Expose
        public String видДолжн;
        @SerializedName("наимВидДолжн")
        @Expose
        public String наимВидДолжн;
        @SerializedName("наимДолжн")
        @Expose
        public String наимДолжн;
        @SerializedName("грнДата")
        @Expose
        public ГрнДата грнДата;
    }
