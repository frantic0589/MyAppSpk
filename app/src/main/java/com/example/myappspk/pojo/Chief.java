
package com.example.myappspk.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chief {

    @SerializedName("inn")
    @Expose
    private String inn;
    @SerializedName("name")
    @Expose
    private String name;

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
