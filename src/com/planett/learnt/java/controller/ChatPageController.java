package com.planett.learnt.java.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatPageController implements Initializable {
    @FXML
    private TabPane chatTab_pane;

    @FXML
    private AnchorPane showChatMain_Page;

    @FXML
    private TextArea inputMessage_text;

    @FXML
    private Button send_btn;


    @FXML
    private ToolBar showChatItem;

    // 按+给TabPane添加tab
    private Tab newTabButton(TabPane tabPane) {
        Tab addTab = new Tab("+");
        tabPane.getSelectionModel().selectedItemProperty().addListener((observable, oldTab, newTab) -> {
            if(newTab == addTab) {
                tabPane.getTabs().add(tabPane.getTabs().size() - 1, new Tab("New Tab")); // Adding new tab before the "button" tab
                tabPane.getSelectionModel().select(tabPane.getTabs().size() - 2); // Selecting the tab before the button, which is the newly created one
            }
        });
        return addTab;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        chatTab_pane.getTabs().add(newTabButton(chatTab_pane));
    }

    public TabPane getChatTab_pane() {
        return chatTab_pane;
    }

    public void setChatTab_pane(TabPane chatTab_pane) {
        this.chatTab_pane = chatTab_pane;
    }


    public TextArea getInputMessage_text() {
        return inputMessage_text;
    }

    public void setInputMessage_text(TextArea inputMessage_text) {
        this.inputMessage_text = inputMessage_text;
    }

    public Button getSend_btn() {
        return send_btn;
    }

    public void setSend_btn(Button send_btn) {
        this.send_btn = send_btn;
    }

    public AnchorPane getShowChatMain_Page() {
        return showChatMain_Page;
    }

    public void setShowChatMain_Page(AnchorPane showChatMain_Page) {
        this.showChatMain_Page = showChatMain_Page;
    }

    public ToolBar getShowChatItem() {
        return showChatItem;
    }

    public void setShowChatItem(ToolBar showChatItem) {
        this.showChatItem = showChatItem;
    }
}
