
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

}
