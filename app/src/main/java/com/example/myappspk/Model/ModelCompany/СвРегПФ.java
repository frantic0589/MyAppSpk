package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class СвРегПФ {
        @SerializedName("кодПФ")
        @Expose
        public String кодПФ;
        @SerializedName("наимПФ")
        @Expose
        public String наимПФ;
        @SerializedName("регНомПФ")
        @Expose
        public String регНомПФ;
        @SerializedName("датаРег")
        @Expose
        public String датаРег;
        @SerializedName("грнДата")
        @Expose
        public ГрнДата ГрнДатаObject;
    }
