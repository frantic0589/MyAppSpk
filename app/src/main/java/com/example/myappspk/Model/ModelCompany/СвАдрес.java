package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class СвАдрес {
        @SerializedName("адресРФ")
        @Expose
        public АдресРФ АдресРФObject;
    }
