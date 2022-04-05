package com.planett.learnt.java.main;

import com.planett.learnt.java.controller.LoginController;
import com.planett.learnt.java.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class LoginApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // 加载fxml文件
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/com/planett/learnt/View/fxml/loginScene.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);
        primaryStage.setTitle("Learn Together Login");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();


        // 获取Controller实例
        LoginController loginController = fxmlLoader.getController();
//        fxmlLoader.setLocation(getClass().getResource("/com/planett/learnt/View/fxml/mainScene.fxml"));
//
//        MainController mainController = fxmlLoader.getController();
//

    }


}
