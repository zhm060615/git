package com.jk.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ItemDesc implements Serializable {
    private static final long serialVersionUID = -6878041335860305414L;
    private BigDecimal itemId;

    private Date created;

    private Date updated;

    private String itemDesc;

    public BigDecimal getItemId() {
        return itemId;
    }

    public void setItemId(BigDecimal itemId) {
        this.itemId = itemId;
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

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }
}