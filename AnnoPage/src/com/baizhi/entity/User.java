package com.baizhi.entity;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private String mobile;
    private Date birthday;


    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", mobile=" + mobile
                + ", birthday=" + birthday + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


}
