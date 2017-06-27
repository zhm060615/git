package com.jk.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ItemParam implements Serializable {
    private static final long serialVersionUID = -8341602817623758419L;
    private BigDecimal id;

    private BigDecimal itemCatId;

    private Date created;

    private Date updated;

    private String paramData;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getItemCatId() {
        return itemCatId;
    }

    public void setItemCatId(BigDecimal itemCatId) {
        this.itemCatId = itemCatId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}