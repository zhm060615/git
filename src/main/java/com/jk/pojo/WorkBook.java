package com.jk.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class WorkBook implements Serializable {
    private static final long serialVersionUID = 6540942183138358878L;
    private BigDecimal id;

    private String code;

    private String describe;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}