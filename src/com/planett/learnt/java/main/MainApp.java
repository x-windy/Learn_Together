package com.planett.learnt.java.main;

import com.planett.learnt.java.Model.FrdData;
import com.planett.learnt.java.Model.TeamData;
import com.planett.learnt.java.Model.UserData;
import com.planett.learnt.java.Util.JdbcUtil;
import com.planett.learnt.java.controller.MainController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.UUID;

public class MainApp extends Application {
    Stage stage=new Stage();
    FriendListItem friendListItem = new FriendListItem();
    MainController mainController;
    ObservableList observableList_friendList;
    ObservableList observableList_teamList;
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 加载fxml文件
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/com/planett/learnt/View/fxml/mainScene.fxml"));
        Parent root = fxmlLoader.load();

        mainController = fxmlLoader.getController();
        mainController.getShowFriendList().setPlaceholder(new Label("没有好友"));
        mainController.getShowTeamList().setPlaceholder(new Label("班组为空"));

        // listView好友列表可观察数据
        observableList_friendList = FXCollections.observableArrayList();
        observableList_teamList = FXCollections.observableArrayList();
        mainController.getShowFriendList().setItems(observableList_friendList);
        mainController.getShowTeamList().setItems(observableList_teamList);

        // 添加好友事件
        mainController.getAddFrd().setOnAction(event -> {
            // 遍历好友列表
            if (UserData.getCurrentAccount().getFrdDataList().size()>0){
                addFriend();

                // java.util.ConcurrentModificationException异常
                // 解决文章：https://www.jianshu.com/p/c5b52927a61a
//                for (FrdData i :
//                        UserData.getCurrentAccount().getFrdDataList()) {
//                    System.out.println("用户名：" + i.getUserName() + " 在线状态:" + i.getOnlineStatus());
//                    if (i.getAccount()==mainController.getSearchFrd().getText()){
//                        System.out.println("添加失败！好友已存在");
//                        break;
//                        }else {
//                        addFriend();
//                    }
//                    }
            }else {
                addFriend();
                System.out.println("添加好友");
            }

            System.out.println("jieshu");

        });


        // 添加班组
        mainController.getAddTeam().setOnAction(event -> {
            addTeam();
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


    // 添加好友实现
    public void addFriend(){

        System.out.println("添加好友:" + mainController.getSearchFrd().getText() );
        try {
            if (mainController.getSearchFrd().getText()!="" && JdbcUtil.findUser(mainController.getSearchFrd().getText())){
                // 添加好友

                FrdData frdData = JdbcUtil.getFrdData(mainController.getSearchFrd().getText());
                UserData.getCurrentAccount().getFrdDataList().add(frdData);
                System.out.println("添加成功！");
                FriendListItem friendListItem = new FriendListItem(frdData.getUserName());
                observableList_friendList.add(friendListItem.getBorderPane());
            }else {
                System.out.println("不能为空");
            }
        } catch (SQLException e) {
            System.out.println("数据库连接失败");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    // 添加班组实现
    public void  addTeam(){
        System.out.println("添加班组");
        mainController.getShowChatMain_vbox().setVisible(false);
        // 显示创建班组页面
        mainController.getShowPane().getChildren().add(mainController.getCreateTeamController().getCreateTeam_page());

        // 添加群组
        mainController.getCreateTeamController().getCreateTeam_btn().setOnAction(event -> {
            if ( mainController.getCreateTeamController().getCreateTeamName_tf().getText()!=""){
                String teamId = UUID.randomUUID().toString().replace('-',' ');
                TeamData teamData = new TeamData(teamId,mainController.getCreateTeamController().getCreateTeamName_tf().getText());
                observableList_teamList.add(new Label(teamData.getTeamName()));
            }

        });

    }

}
