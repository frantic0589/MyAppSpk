
package com.example.myappspk.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Doc {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("ogrn")
    @Expose
    private String ogrn;
    @SerializedName("inn")
    @Expose
    private String inn;
    @SerializedName("kpp")
    @Expose
    private String kpp;
    @SerializedName("statusName")
    @Expose
    private String statusName;
    @SerializedName("statusCode")
    @Expose
    private String statusCode;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("chiefs")
    @Expose
    private List<Chief> chiefs = null;
    @SerializedName("coreActivity")
    @Expose
    private String coreActivity;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("ogrnDate")
    @Expose
    private String ogrnDate;
    @SerializedName("regDate")
    @Expose
    private String regDate;
    @SerializedName("industry")
    @Expose
    private Industry industry;
    @SerializedName("subIndustry")
    @Expose
    private SubIndustry subIndustry;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public List<Chief> getChiefs() {
        return chiefs;
    }

    public void setChiefs(List<Chief> chiefs) {
        this.chiefs = chiefs;
    }

    public String getCoreActivity() {
        return coreActivity;
    }

    public void setCoreActivity(String coreActivity) {
        this.coreActivity = coreActivity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOgrnDate() {
        return ogrnDate;
    }

    public void setOgrnDate(String ogrnDate) {
        this.ogrnDate = ogrnDate;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public SubIndustry getSubIndustry() {
        return subIndustry;
    }

    public void setSubIndustry(SubIndustry subIndustry) {
        this.subIndustry = subIndustry;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
