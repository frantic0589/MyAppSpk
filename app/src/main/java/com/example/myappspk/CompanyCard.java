
package com.example.myappspk;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompanyCard {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("chiefs")
    @Expose
    private List<Chief> chiefs = null;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("coreActivity")
    @Expose
    private String coreActivity;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("docs")
    @Expose
    private List<Object> docs = null;
    @SerializedName("from")
    @Expose
    private Integer from;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("industry")
    @Expose
    private Industry industry;
    @SerializedName("inn")
    @Expose
    private String inn;
    @SerializedName("kladr")
    @Expose
    private String kladr;
    @SerializedName("kpp")
    @Expose
    private String kpp;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("ogrn")
    @Expose
    private String ogrn;
    @SerializedName("ogrnDate")
    @Expose
    private String ogrnDate;
    @SerializedName("opfCode")
    @Expose
    private String opfCode;
    @SerializedName("opfName")
    @Expose
    private String opfName;
    @SerializedName("regDate")
    @Expose
    private String regDate;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("regionCode")
    @Expose
    private String regionCode;
    @SerializedName("settlement")
    @Expose
    private String settlement;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("statusCode")
    @Expose
    private String statusCode;
    @SerializedName("statusName")
    @Expose
    private String statusName;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("subIndustry")
    @Expose
    private SubIndustry subIndustry;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("zipCode")
    @Expose
    private String zipCode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Chief> getChiefs() {
        return chiefs;
    }

    public void setChiefs(List<Chief> chiefs) {
        this.chiefs = chiefs;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoreActivity() {
        return coreActivity;
    }

    public void setCoreActivity(String coreActivity) {
        this.coreActivity = coreActivity;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public List<Object> getDocs() {
        return docs;
    }

    public void setDocs(List<Object> docs) {
        this.docs = docs;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKladr() {
        return kladr;
    }

    public void setKladr(String kladr) {
        this.kladr = kladr;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getOgrnDate() {
        return ogrnDate;
    }

    public void setOgrnDate(String ogrnDate) {
        this.ogrnDate = ogrnDate;
    }

    public String getOpfCode() {
        return opfCode;
    }

    public void setOpfCode(String opfCode) {
        this.opfCode = opfCode;
    }

    public String getOpfName() {
        return opfName;
    }

    public void setOpfName(String opfName) {
        this.opfName = opfName;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public SubIndustry getSubIndustry() {
        return subIndustry;
    }

    public void setSubIndustry(SubIndustry subIndustry) {
        this.subIndustry = subIndustry;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

}
