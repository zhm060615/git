package com.jk.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ItemCat implements Serializable {
    private static final long serialVersionUID = -3493854843248797113L;
    private BigDecimal id;

    private BigDecimal parentId;

    private String name;

    private BigDecimal status;

    private BigDecimal sortOrder;

    private BigDecimal isParent;

    private Date created;

    private Date updated;

    private String createTime;

    private String updateTime;

    private String state = "closed";// open,closed

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreateTime() {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (this.created!=null){
            return sm.format(this.created);
        }
        return "";
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (this.updated!=null){
            return sm.format(this.updated);
        }
        return "";
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

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
        if(Integer.valueOf(this.isParent.toString())==0){
            state = "open";
        }
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