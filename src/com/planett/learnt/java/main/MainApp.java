package com.planett.learnt.java.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    Stage stage=new Stage();
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 加载fxml文件
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/com/planett/learnt/res/fxml/mainScene.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root,1280,800);
        primaryStage.setTitle("Learn Together");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public void showWindow() throws Exception {
        start(stage);
    }

}
