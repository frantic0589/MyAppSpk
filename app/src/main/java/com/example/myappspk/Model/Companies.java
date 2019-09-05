package com.example.myappspk.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Companies {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("from")
    @Expose
    private Integer from;
    @SerializedName("docs")
    @Expose
    private List<Doc> docs = null;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public List<Doc> getDocs() {
        return docs;
    }

    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }

    public static class Doc {

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

    public static class Chief {

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

    public static class Industry {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("name")
        @Expose
        private String name;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Meta {

        @SerializedName("favorite")
        @Expose
        private Boolean favorite;
        @SerializedName("isNotifyEgr")
        @Expose
        private Boolean isNotifyEgr;
        @SerializedName("unreadChangesCnt")
        @Expose
        private Integer unreadChangesCnt;
        @SerializedName("favoriteTotalLight")
        @Expose
        private Integer favoriteTotalLight;
        @SerializedName("favoriteTfOrgLegal")
        @Expose
        private Integer favoriteTfOrgLegal;
        @SerializedName("favoriteTfFinancial")
        @Expose
        private Integer favoriteTfFinancial;
        @SerializedName("favoriteTfBusiness")
        @Expose
        private Integer favoriteTfBusiness;
        @SerializedName("favoriteTfGz")
        @Expose
        private Integer favoriteTfGz;

        public Boolean getFavorite() {
            return favorite;
        }

        public void setFavorite(Boolean favorite) {
            this.favorite = favorite;
        }

        public Boolean getIsNotifyEgr() {
            return isNotifyEgr;
        }

        public void setIsNotifyEgr(Boolean isNotifyEgr) {
            this.isNotifyEgr = isNotifyEgr;
        }

        public Integer getUnreadChangesCnt() {
            return unreadChangesCnt;
        }

        public void setUnreadChangesCnt(Integer unreadChangesCnt) {
            this.unreadChangesCnt = unreadChangesCnt;
        }

        public Integer getFavoriteTotalLight() {
            return favoriteTotalLight;
        }

        public void setFavoriteTotalLight(Integer favoriteTotalLight) {
            this.favoriteTotalLight = favoriteTotalLight;
        }

        public Integer getFavoriteTfOrgLegal() {
            return favoriteTfOrgLegal;
        }

        public void setFavoriteTfOrgLegal(Integer favoriteTfOrgLegal) {
            this.favoriteTfOrgLegal = favoriteTfOrgLegal;
        }

        public Integer getFavoriteTfFinancial() {
            return favoriteTfFinancial;
        }

        public void setFavoriteTfFinancial(Integer favoriteTfFinancial) {
            this.favoriteTfFinancial = favoriteTfFinancial;
        }

        public Integer getFavoriteTfBusiness() {
            return favoriteTfBusiness;
        }

        public void setFavoriteTfBusiness(Integer favoriteTfBusiness) {
            this.favoriteTfBusiness = favoriteTfBusiness;
        }

        public Integer getFavoriteTfGz() {
            return favoriteTfGz;
        }

        public void setFavoriteTfGz(Integer favoriteTfGz) {
            this.favoriteTfGz = favoriteTfGz;
        }

    }

    public static class SubIndustry {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("name")
        @Expose
        private String name;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
