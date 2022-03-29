package com.planett.learnt.java.main;

import com.planett.learnt.java.controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 加载fxml文件
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/com/planett/learnt/res/fxml/login_fx.fxml"));
        Parent root = fxmlLoader.load();

        // 获取Controller实例
        LoginController loginController = fxmlLoader.getController();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/com/planett/learnt/res/css/login.css").toExternalForm());
        primaryStage.setTitle("Learn Together");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();


    }


}
