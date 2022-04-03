package com.planett.learnt.java.main;

import com.planett.learnt.java.Model.FrdData;
import com.planett.learnt.java.Model.UserData;
import com.planett.learnt.java.Util.JdbcUtil;
import com.planett.learnt.java.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;

public class MainApp extends Application {
    Stage stage=new Stage();
    FriendListItem friendListItem = new FriendListItem();

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 加载fxml文件
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/com/planett/learnt/View/fxml/mainScene.fxml"));
        Parent root = fxmlLoader.load();

        MainController mainController = fxmlLoader.getController();
        mainController.getAddFrd().setOnAction(event -> {
            // 添加好友
            try {
                FrdData frdData = JdbcUtil.getFrdData(mainController.getSearchFrd().getText());
                UserData.getCurrentAccount().getFrdDataList().add(frdData);

                mainController.getShowFriendList().getChildren().add(friendListItem.getBorderPane());

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        });

        Scene scene = new Scene(root,1280,800);
        primaryStage.setTitle("Learn Together");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public void showWindow() throws Exception {
        start(stage);
    }

    public void loadFxml(String res){

    }

}
