package com.jk.pojo;

import java.util.Date;

public class Mails {
    private Integer id;

    private String sender;

    private String recipients;

    private String carbonCopy;

    private String secretMan;

    private String mailOptions;

    private Date transmissionTime;

    private Short issuccess;

    private String admins;

    private String ipAddress;

    private String attachmentname;

    //业务字段
    //邮件正文--文本
    private String mailContent;
    //发件人密码
    private String senderPsw;

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    public String getSenderPsw() {
        return senderPsw;
    }

    public void setSenderPsw(String senderPsw) {
        this.senderPsw = senderPsw;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients == null ? null : recipients.trim();
    }

    public String getCarbonCopy() {
        return carbonCopy;
    }

    public void setCarbonCopy(String carbonCopy) {
        this.carbonCopy = carbonCopy == null ? null : carbonCopy.trim();
    }

    public String getSecretMan() {
        return secretMan;
    }

    public void setSecretMan(String secretMan) {
        this.secretMan = secretMan == null ? null : secretMan.trim();
    }

    public String getMailOptions() {
        return mailOptions;
    }

    public void setMailOptions(String mailOptions) {
        this.mailOptions = mailOptions == null ? null : mailOptions.trim();
    }

    public Date getTransmissionTime() {
        return transmissionTime;
    }

    public void setTransmissionTime(Date transmissionTime) {
        this.transmissionTime = transmissionTime;
    }

    public Short getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(Short issuccess) {
        this.issuccess = issuccess;
    }

    public String getAdmins() {
        return admins;
    }

    public void setAdmins(String admins) {
        this.admins = admins == null ? null : admins.trim();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getAttachmentname() {
        return attachmentname;
    }

    public void setAttachmentname(String attachmentname) {
        this.attachmentname = attachmentname;
    }
}