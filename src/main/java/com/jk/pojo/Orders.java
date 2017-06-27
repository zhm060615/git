package com.jk.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Orders implements Serializable {
    private static final long serialVersionUID = -3618809025395161893L;
    private String orderId;

    private String payment;

    private BigDecimal paymentType;

    private String postFee;

    private BigDecimal status;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String create;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String update;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date paymentTime;

    private String paymentt;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date consignTime;

    private String consign;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    private String end;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date closeTime;

    private String close;

    private String shippingName;

    private String shippingCode;

    private BigDecimal userId;

    private String buyerMessage;

    private String buyerNick;

    private BigDecimal buyerRate;

    private User user;

    private OrderItem orderItem;

    private OrderShipping orderShipping;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public OrderShipping getOrderShipping() {
        return orderShipping;
    }

    public void setOrderShipping(OrderShipping orderShipping) {
        this.orderShipping = orderShipping;
    }

    private WorkBook workBook;

    public WorkBook getWorkBooks() {
        return workBooks;
    }

    public void setWorkBooks(WorkBook workBooks) {
        this.workBooks = workBooks;
    }

    private WorkBook workBooks;

    public WorkBook getWorkBook() {
        return workBook;
    }

    public void setWorkBook(WorkBook workBook) {
        this.workBook = workBook;
    }

    //业务字段
    public String getCreate() {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (this.createTime!=null){
            return sm.format(this.createTime);
        }
        return "";
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getUpdate() {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(this.updateTime!=null){
            return sm.format(this.updateTime);
        }
        return "";
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getPaymentt() {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(this.paymentTime!=null){
            return sm.format(this.paymentTime);
        }
        return "";
    }

    public void setPaymentt(String paymentt) {
        this.paymentt = paymentt;
    }

    public String getConsign() {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(this.consignTime!=null){
            return sm.format(this.consignTime);
        }
        return "";
    }

    public void setConsign(String consign) {
        this.consign = consign;
    }

    public String getEnd() {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(this.endTime!=null){
            return sm.format(this.endTime);
        }
        return "";
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getClose() {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(this.closeTime!=null){
            return sm.format(this.closeTime);
        }
        return "";
    }

    public void setClose(String close) {
        this.close = close;
    }

    //========================================================
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public BigDecimal getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(BigDecimal paymentType) {
        this.paymentType = paymentType;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee == null ? null : postFee.trim();
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    public BigDecimal getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(BigDecimal buyerRate) {
        this.buyerRate = buyerRate;
    }
}