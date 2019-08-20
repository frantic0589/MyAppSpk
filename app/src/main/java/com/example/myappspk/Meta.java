
package com.example.myappspk;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

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
