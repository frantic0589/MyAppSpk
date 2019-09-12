package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class ГрнДата {
        @SerializedName("грн")
        @Expose
        public String грн;
        @SerializedName("дата")
        @Expose
        public String дата;
}
