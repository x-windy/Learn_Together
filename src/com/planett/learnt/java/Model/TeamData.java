package com.planett.learnt.java.Model;

import java.util.ArrayList;

public class TeamData {
    private String teamId;
    private String teamName;
    private String teamInformation;
    private String teamCreator;
    private ArrayList<String> teamMember;
    public TeamData(){
        teamMember = new ArrayList<String>();
    }
    public TeamData(String teamId,String teamName,String teamCreator){
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamCreator = teamCreator;
    }
    public TeamData(String teamId,String teamName,String teamCreator,String teamMember){
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamCreator = teamCreator;
        this.teamMember.add(teamMember);
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

    public ArrayList<String> getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(ArrayList<String> teamMember) {
        this.teamMember = teamMember;
    }

    public String getTeamCreator() {
        return teamCreator;
    }

    public void setTeamCreator(String teamCreator) {
        this.teamCreator = teamCreator;
    }
}
