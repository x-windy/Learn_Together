package com.planett.learnt.java.main;

import java.sql.Date;

public class User {
    private String uid;
    private String userName;
    private String userPassword;
    private String phoneNumber;
    private Date createDate;
    public User(){}

    User(String uid,String userName,String userPassword){
        this.uid = uid;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    User(String uid,String userName,String userPassword,String phoneNumber,Date createDate) {
        this(uid,userName,userPassword);
        this.phoneNumber = phoneNumber;
        this.createDate = createDate;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
