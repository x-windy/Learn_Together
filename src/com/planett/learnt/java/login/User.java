package com.planett.learnt.java.login;

public class User {
    private String uid;
    private String userName;
    private String userPassword;
    private String phoneNumber;

    public User(){}

    User(String uid,String userName,String userPassword){
        this.uid = uid;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    User(String uid,String userName,String userPassword,String phoneNumber) {
        this(uid,userName,userPassword);
        this.phoneNumber = phoneNumber;
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
