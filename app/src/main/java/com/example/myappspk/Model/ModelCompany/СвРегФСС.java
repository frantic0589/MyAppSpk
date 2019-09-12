package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class СвРегФСС {
        @SerializedName("кодФСС")
        @Expose
        public String кодФСС;
        @SerializedName("наимФСС")
        @Expose
        public String наимФСС;
        @SerializedName("регНомФСС")
        @Expose
        public String регНомФСС;
        @SerializedName("датаРег")
        @Expose
        public String датаРег;
        @SerializedName("грнДата")
        @Expose
        public ГрнДата ГрнДатаObject;
    }
