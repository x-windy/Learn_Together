package com.planett.learnt.java.controller;

import com.planett.learnt.java.main.FriendListItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {
    @FXML
    private ListView<?> showFriendList;

    @FXML
    private TabPane chatTab_pane;

    @FXML
    private Button addFrd;

    @FXML
    private Tab toActivity;

    @FXML
    private Tab toCalendar;

    @FXML
    private TextArea inputMessage_text;

    @FXML
    private TabPane navigatorTab_pane;

    @FXML
    private Button addFrd1;

    @FXML
    private Tab toHome;

    @FXML
    private Button send_btn;

    @FXML
    private TextField searchFrd;

    @FXML
    private Tab toChat;


    @FXML
    void toHome(ActionEvent event) {

    }

    @FXML
    void toChatScence(ActionEvent event) {

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

    public Button getAddFrd1() {
        return addFrd1;
    }

    public void setAddFrd1(Button addFrd1) {
        this.addFrd1 = addFrd1;
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
}
