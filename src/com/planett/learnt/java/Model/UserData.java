package com.planett.learnt.java.Model;

import java.sql.Date;
import java.util.List;

public class UserData {
    private String uid;
    private String account;
    private String userName;
    private String userPassword;
    private String phoneNumber;
    private Date createDate;
    private String accountStatus;
    private String onlineStatus;
    private static UserData currentAccount;
    // 保存好友数据
    private List<FrdData> frdDataList;

    public UserData(){}


    public UserData(String account, String userPassword){
        this.account = account;
        this.userPassword = userPassword;
    }
    public UserData(String uid, String account, String userPassword){
        this(account,userPassword);
        this.uid = uid;
    }

    public UserData(String uid, String account, String userPassword, String phoneNumber, Date createDate) {
        this(uid,account,userPassword);
        this.phoneNumber = phoneNumber;
        this.createDate = createDate;
    }

    public static UserData getCurrentAccount(){
        currentAccount = new UserData();
        return currentAccount;
    }

    public List<FrdData> getFrdDataList() {
        return frdDataList;
    }

    public void setFrdDataList(List<FrdData> frdDataList) {
        this.frdDataList = frdDataList;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAccount() {
        return account;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
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
