package com.planett.learnt.java.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button addFrd;

    @FXML
    private TabPane navigatorTab_pane;

    @FXML
    private Tab toHome;

    @FXML
    private TextField searchFrd;


    @FXML
    private ListView<?> showFriendList;

    @FXML
    private Tab toActivity;

    @FXML
    private Tab toCalendar;

    @FXML
    private ListView<?> showTeamList;


    @FXML
    private Tab toChat;

    @FXML
    private Button addTeam;

    @FXML
    private BorderPane chatHomePane;

    @FXML
    private Pane showPane;

    @FXML
    private Label showInformation_label;


    // 创建班组页面
    @FXML
    private CreateTeamController createTeamController;
    @FXML
    private ChatPageController chatPageController;


    @FXML
    void toHome(ActionEvent event) {

    }

    @FXML
    void toChatScence(ActionEvent event) {

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public Button getAddFrd() {
        return addFrd;
    }

    public void setAddFrd(Button addFrd) {
        this.addFrd = addFrd;
    }

    public TabPane getNavigatorTab_pane() {
        return navigatorTab_pane;
    }

    public void setNavigatorTab_pane(TabPane navigatorTab_pane) {
        this.navigatorTab_pane = navigatorTab_pane;
    }

    public Tab getToHome() {
        return toHome;
    }

    public void setToHome(Tab toHome) {
        this.toHome = toHome;
    }

    public TextField getSearchFrd() {
        return searchFrd;
    }

    public void setSearchFrd(TextField searchFrd) {
        this.searchFrd = searchFrd;
    }

    public ListView<?> getShowFriendList() {
        return showFriendList;
    }

    public void setShowFriendList(ListView<?> showFriendList) {
        this.showFriendList = showFriendList;
    }

    public Tab getToActivity() {
        return toActivity;
    }

    public void setToActivity(Tab toActivity) {
        this.toActivity = toActivity;
    }

    public Tab getToCalendar() {
        return toCalendar;
    }

    public void setToCalendar(Tab toCalendar) {
        this.toCalendar = toCalendar;
    }

    public ListView<?> getShowTeamList() {
        return showTeamList;
    }

    public void setShowTeamList(ListView<?> showTeamList) {
        this.showTeamList = showTeamList;
    }

    public Tab getToChat() {
        return toChat;
    }

    public void setToChat(Tab toChat) {
        this.toChat = toChat;
    }

    public Button getAddTeam() {
        return addTeam;
    }

    public void setAddTeam(Button addTeam) {
        this.addTeam = addTeam;
    }

    public BorderPane getChatHomePane() {
        return chatHomePane;
    }

    public void setChatHomePane(BorderPane chatHomePane) {
        this.chatHomePane = chatHomePane;
    }

    public CreateTeamController getCreateTeamController() {
        return createTeamController;
    }

    public void setCreateTeamController(CreateTeamController createTeamController) {
        this.createTeamController = createTeamController;
    }

    public ChatPageController getChatPageController() {
        return chatPageController;
    }

    public void setChatPageController(ChatPageController chatPageController) {
        this.chatPageController = chatPageController;
    }




    public Pane getShowPane() {
        return showPane;
    }

    public void setShowPane(Pane showPane) {
        this.showPane = showPane;
    }


    public Label getShowInformation_label() {
        return showInformation_label;
    }

    public void setShowInformation_label(Label showInformation_label) {
        this.showInformation_label = showInformation_label;
    }
}
