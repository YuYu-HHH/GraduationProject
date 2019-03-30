package com.yuyu.pojo;

import java.util.Date;

public class Adminone {
    private Integer id;

    private String username;

    private String password;

    private String businesslicence;

    private Integer storeid;

    private String phone;

    private Date createTime;

    private Date updateTime;

    public Adminone(Integer id, String username, String password, String businesslicence, Integer storeid, String phone, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.businesslicence = businesslicence;
        this.storeid = storeid;
        this.phone = phone;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Adminone() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getBusinesslicence() {
        return businesslicence;
    }

    public void setBusinesslicence(String businesslicence) {
        this.businesslicence = businesslicence == null ? null : businesslicence.trim();
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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
}