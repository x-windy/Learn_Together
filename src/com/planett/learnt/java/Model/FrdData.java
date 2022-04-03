package com.planett.learnt.java.Model;

public class FrdData {
    private String headPicture;
    private String account;
    private String userName;
    private String accountStatus;
    private String onlineStatus;
    public FrdData(){}
    public FrdData(String account,String userName,String accountStatus,String onlineStatus){
        this.account = account;
        this.userName = userName;
        this.accountStatus = accountStatus;
        this.onlineStatus = onlineStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
}
