package com.planett.learnt.java.controller;

import com.planett.learnt.java.Model.TeamData;
import com.planett.learnt.java.Model.UserData;
import com.planett.learnt.java.Util.JdbcUtil;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.UUID;

public class CreateTeamController implements Initializable {

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
    private Button joinTeam_btn;

    @FXML
    private TextField createTeamName_tf;

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

    public Button getJoinTeam_btn() {
        return joinTeam_btn;
    }

    public void setJoinTeam_btn(Button joinTeam_btn) {
        this.joinTeam_btn = joinTeam_btn;
    }

    public TextField getCreateTeamName_tf() {
        return createTeamName_tf;
    }

    public void setCreateTeamName_tf(TextField createTeamName_tf) {
        this.createTeamName_tf = createTeamName_tf;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
