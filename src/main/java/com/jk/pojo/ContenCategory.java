package com.jk.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ContenCategory implements Serializable {
    private static final long serialVersionUID = -808698102013314688L;
    private BigDecimal id;

    private BigDecimal parentId;

    private String name;

    private BigDecimal status;

    private BigDecimal sortOrder;

    private BigDecimal isParent;

    private Date created;

    private Date updated;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getParentId() {
        return parentId;
    }

    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(BigDecimal sortOrder) {
        this.sortOrder = sortOrder;
    }

    public BigDecimal getIsParent() {
        return isParent;
    }

    public void setIsParent(BigDecimal isParent) {
        this.isParent = isParent;
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
}