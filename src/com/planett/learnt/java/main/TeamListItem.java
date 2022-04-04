package com.planett.learnt.java.main;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

public class TeamListItem {
    private Image image;
    private Label friendName_label;
    private BorderPane borderPane;
    public TeamListItem(){
    }
    TeamListItem(String userName){
        borderPane = new BorderPane();
        friendName_label = new Label(userName);
        borderPane.setTop(friendName_label);
        borderPane.setPrefSize(100,20);
    }

    public BorderPane getBorderPane(){
        return borderPane;
    }
}
