package com.munjie.vue.myblog.entity;

/**
 * @Auther: munjie
 * @Date: 7/24/2020 00:46
 * @Description:
 */
public class User {

    private String cId;
    private String cUsername;

    private String cPwd;

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername;
    }

    public String getcPwd() {
        return cPwd;
    }

    public void setcPwd(String cPwd) {
        this.cPwd = cPwd;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }
}