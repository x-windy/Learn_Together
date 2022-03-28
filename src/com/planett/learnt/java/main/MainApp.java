package com.planett.learnt.java.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/planett/learnt/resources/login_fx.fxml"));
        primaryStage.setTitle("Learn Together");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();


    }


}
