package com.planett.learnt.java.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateJoinTeamController implements Initializable {
    @FXML
    private TextField searchTeam_tf;

    @FXML
    private Button toSearchTeam_btn;
    
    @FXML
    private ListView<?> showFrdList_ct;

    @FXML
    private TextField inviteFriend_tf;

    @FXML
    private AnchorPane createTeam_page;

    @FXML
    private Button cancelCreateTeam_btn;

    @FXML
    private Button createTeam_btn;

    @FXML
    private Button toJoinTeam_btn;


    @FXML
    private TextField createTeamName_tf;

    @FXML
    private AnchorPane joinTeam_page;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }




    public TextField getSearchTeam_tf() {
        return searchTeam_tf;
    }

    public void setSearchTeam_tf(TextField searchTeam_tf) {
        this.searchTeam_tf = searchTeam_tf;
    }

    public Button getToSearchTeam_btn() {
        return toSearchTeam_btn;
    }

    public void setToSearchTeam_btn(Button toSearchTeam_btn) {
        this.toSearchTeam_btn = toSearchTeam_btn;
    }

    public ListView<?> getShowFrdList_ct() {
        return showFrdList_ct;
    }

    public void setShowFrdList_ct(ListView<?> showFrdList_ct) {
        this.showFrdList_ct = showFrdList_ct;
    }

    public TextField getInviteFriend_tf() {
        return inviteFriend_tf;
    }

    public void setInviteFriend_tf(TextField inviteFriend_tf) {
        this.inviteFriend_tf = inviteFriend_tf;
    }

    public AnchorPane getCreateTeam_page() {
        return createTeam_page;
    }

    public void setCreateTeam_page(AnchorPane createTeam_page) {
        this.createTeam_page = createTeam_page;
    }

    public Button getCancelCreateTeam_btn() {
        return cancelCreateTeam_btn;
    }

    public void setCancelCreateTeam_btn(Button cancelCreateTeam_btn) {
        this.cancelCreateTeam_btn = cancelCreateTeam_btn;
    }

    public Button getCreateTeam_btn() {
        return createTeam_btn;
    }

    public void setCreateTeam_btn(Button createTeam_btn) {
        this.createTeam_btn = createTeam_btn;
    }

    public Button getToJoinTeam_btn() {
        return toJoinTeam_btn;
    }

    public void setToJoinTeam_btn(Button toJoinTeam_btn) {
        this.toJoinTeam_btn = toJoinTeam_btn;
    }

    public TextField getCreateTeamName_tf() {
        return createTeamName_tf;
    }

    public void setCreateTeamName_tf(TextField createTeamName_tf) {
        this.createTeamName_tf = createTeamName_tf;
    }

    public AnchorPane getJoinTeam_page() {
        return joinTeam_page;
    }

    public void setJoinTeam_page(AnchorPane joinTeam_page) {
        this.joinTeam_page = joinTeam_page;
    }
}
