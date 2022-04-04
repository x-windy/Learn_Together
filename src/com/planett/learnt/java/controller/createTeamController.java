package com.planett.learnt.java.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class createTeamController {
    @FXML
    private ListView<?> showFrdList_ct;

    @FXML
    private TextField createTeamName_tf;

    @FXML
    private TextField inviteFriend_tf;

    @FXML
    private AnchorPane createTeam_page;

    @FXML
    private Button cancelCreateTeam_btn;

    @FXML
    private Button createTeam_btn;

    public ListView<?> getShowFrdList_ct() {
        return showFrdList_ct;
    }

    public void setShowFrdList_ct(ListView<?> showFrdList_ct) {
        this.showFrdList_ct = showFrdList_ct;
    }

    public TextField getCreateTeamName_tf() {
        return createTeamName_tf;
    }

    public void setCreateTeamName_tf(TextField createTeamName_tf) {
        this.createTeamName_tf = createTeamName_tf;
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
}
