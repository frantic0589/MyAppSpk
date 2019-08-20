
package com.example.myappspk;

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

}
