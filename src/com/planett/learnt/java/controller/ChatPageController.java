package com.planett.learnt.java.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class ChatPageController {
    @FXML
    private TabPane chatTab_pane;

    @FXML
    private VBox showChatMain_vbox;

    @FXML
    private TextArea inputMessage_text;

    @FXML
    private Button send_btn;

}
