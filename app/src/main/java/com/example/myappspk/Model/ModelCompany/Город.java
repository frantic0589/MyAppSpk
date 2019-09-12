package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Город {
        @SerializedName("тип")
        @Expose
        public String тип;
        @SerializedName("наименование")
        @Expose
        public String наименование;
    }
