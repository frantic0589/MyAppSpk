package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class СвУчетНО {
        @SerializedName("кодНО")
        @Expose
        public String кодНО;
        @SerializedName("наимНО")
        @Expose
        public String наимНО;
        @SerializedName("датаПостУч")
        @Expose
        public String датаПостУч;
        @SerializedName("грнДата")
        @Expose
        public ГрнДата ГрнДатаObject;
    }
