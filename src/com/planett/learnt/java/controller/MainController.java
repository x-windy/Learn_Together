package com.planett.learnt.java.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
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
    private TabPane chatTab_pane;

    @FXML
    private ListView<?> showFriendList;

    @FXML
    private Tab toActivity;

    @FXML
    private Tab toCalendar;

    @FXML
    private ListView<?> showTeamList;

    @FXML
    private TextArea inputMessage_text;

    @FXML
    private Button send_btn;

    @FXML
    private Tab toChat;

    @FXML
    private Button addTeam;

    @FXML
    private VBox showChatMain_vbox;

    @FXML
    private Pane showPane;

    // 创建班组页面
    @FXML
    private createTeamController createTeamController;

    @FXML
    void toHome(ActionEvent event) {

    }

    @FXML
    void toChatScence(ActionEvent event) {

    }


    public ListView<?> getShowTeamList() {
        return showTeamList;
    }

    public void setShowTeamList(ListView<?> showTeamList) {
        this.showTeamList = showTeamList;
    }

    public Button getAddTeam() {
        return addTeam;
    }

    public void setAddTeam(Button addTeam) {
        this.addTeam = addTeam;
    }

    public TabPane getChatTab_pane() {
        return chatTab_pane;
    }

    public void setChatTab_pane(TabPane chatTab_pane) {
        this.chatTab_pane = chatTab_pane;
    }

    public Button getAddFrd() {
        return addFrd;
    }

    public void setAddFrd(Button addFrd) {
        this.addFrd = addFrd;
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

    public TextArea getInputMessage_text() {
        return inputMessage_text;
    }

    public void setInputMessage_text(TextArea inputMessage_text) {
        this.inputMessage_text = inputMessage_text;
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

    public Button getSend_btn() {
        return send_btn;
    }

    public void setSend_btn(Button send_btn) {
        this.send_btn = send_btn;
    }

    public TextField getSearchFrd() {
        return searchFrd;
    }

    public void setSearchFrd(TextField searchFrd) {
        this.searchFrd = searchFrd;
    }

    public Tab getToChat() {
        return toChat;
    }

    public void setToChat(Tab toChat) {
        this.toChat = toChat;
    }

    public ListView<?> getShowFriendList() {
        return showFriendList;
    }

    public void setShowFriendList(ListView<?> showFriendList) {
        this.showFriendList = showFriendList;
    }

    public com.planett.learnt.java.controller.createTeamController getCreateTeamController() {
        return createTeamController;
    }

    public void setCreateTeamController(com.planett.learnt.java.controller.createTeamController createTeamController) {
        this.createTeamController = createTeamController;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public VBox getShowChatMain_vbox() {
        return showChatMain_vbox;
    }

    public void setShowChatMain_vbox(VBox showChatMain_vbox) {
        this.showChatMain_vbox = showChatMain_vbox;
    }

    public Pane getShowPane() {
        return showPane;
    }

    public void setShowPane(Pane showPane) {
        this.showPane = showPane;
    }
}
