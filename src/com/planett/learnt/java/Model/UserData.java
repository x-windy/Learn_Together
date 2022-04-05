package com.planett.learnt.java.Model;

import java.sql.Date;
import java.util.ArrayList;
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

    // 当前登录的账号
    private static UserData currentAccount = new UserData();

    // 列表ID
    private String frdDataListID;
    // 保存好友数据
    private ArrayList<FrdData> frdDataList;

    public UserData(){
        // 初始化好友表
        frdDataList = new ArrayList<FrdData>();
    }


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


    // 获取当前登录的账号
    public static UserData getCurrentAccount(){
        return currentAccount;
    }

    public String getFrdDataListID() {
        return frdDataListID;
    }

    public void setFrdDataListID(String frdDataListID) {
        this.frdDataListID = frdDataListID;
    }

    public ArrayList<FrdData> getFrdDataList() {
        return frdDataList;
    }

    public void setFrdDataList(ArrayList<FrdData> frdDataList) {
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
