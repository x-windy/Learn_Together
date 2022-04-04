package com.planett.learnt.java.Model;

import java.util.ArrayList;

public class TeamData {
    private String teamId;
    private String teamName;
    private String teamInformation;
    private ArrayList<UserData> teamMember;
    public TeamData(){
    }
    public TeamData(String teamId,String teamName){
        this.teamId = teamId;
        this.teamName = teamName;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamInformation() {
        return teamInformation;
    }

    public void setTeamInformation(String teamInformation) {
        this.teamInformation = teamInformation;
    }

    public ArrayList<UserData> getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(ArrayList<UserData> teamMember) {
        this.teamMember = teamMember;
    }
}
