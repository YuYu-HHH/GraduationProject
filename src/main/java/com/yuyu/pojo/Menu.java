package com.yuyu.pojo;

import java.util.Date;

public class Menu {
    private Integer id;

    private String foodname;

    private Float price;

    private Integer existence;

    private String picture;

    private String tagone;

    private String tagtwo;

    private String tagthree;

    private String tagfour;

    private String tagfive;

    private String tagesix;

    private Date createTime;

    private Date updateTime;

    public Menu(Integer id, String foodname, Float price, Integer existence, String picture, String tagone, String tagtwo, String tagthree, String tagfour, String tagfive, String tagesix, Date createTime, Date updateTime) {
        this.id = id;
        this.foodname = foodname;
        this.price = price;
        this.existence = existence;
        this.picture = picture;
        this.tagone = tagone;
        this.tagtwo = tagtwo;
        this.tagthree = tagthree;
        this.tagfour = tagfour;
        this.tagfive = tagfive;
        this.tagesix = tagesix;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Menu() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname == null ? null : foodname.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getExistence() {
        return existence;
    }

    public void setExistence(Integer existence) {
        this.existence = existence;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getTagone() {
        return tagone;
    }

    public void setTagone(String tagone) {
        this.tagone = tagone == null ? null : tagone.trim();
    }

    public String getTagtwo() {
        return tagtwo;
    }

    public void setTagtwo(String tagtwo) {
        this.tagtwo = tagtwo == null ? null : tagtwo.trim();
    }

    public String getTagthree() {
        return tagthree;
    }

    public void setTagthree(String tagthree) {
        this.tagthree = tagthree == null ? null : tagthree.trim();
    }

    public String getTagfour() {
        return tagfour;
    }

    public void setTagfour(String tagfour) {
        this.tagfour = tagfour == null ? null : tagfour.trim();
    }

    public String getTagfive() {
        return tagfive;
    }

    public void setTagfive(String tagfive) {
        this.tagfive = tagfive == null ? null : tagfive.trim();
    }

    public String getTagesix() {
        return tagesix;
    }

    public void setTagesix(String tagesix) {
        this.tagesix = tagesix == null ? null : tagesix.trim();
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