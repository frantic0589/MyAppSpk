package com.example.myappspk.Model.ModelCompany;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class АдресРФ {
        @SerializedName("регион")
        @Expose
        public Регион РегионObject;
        @SerializedName("город")
        @Expose
        public Город ГородObject;
        @SerializedName("улица")
        @Expose
        public Улица УлицаObject;
        @SerializedName("индекс")
        @Expose
        public String индекс;
        @SerializedName("кодРегион")
        @Expose
        public String кодРегион;
        @SerializedName("кодАдрКладр")
        @Expose
        public String кодАдрКладр;
        @SerializedName("дом")
        @Expose
        public String дом;
        @SerializedName("кварт")
        @Expose
        public String кварт;
        @SerializedName("грнДата")
        @Expose
        public ГрнДата ГрнДатаObject;
    }
