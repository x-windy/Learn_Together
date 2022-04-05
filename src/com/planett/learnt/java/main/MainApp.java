package com.planett.learnt.java.main;

import com.planett.learnt.java.Model.FrdData;
import com.planett.learnt.java.Model.TeamData;
import com.planett.learnt.java.Model.UserData;
import com.planett.learnt.java.Util.JdbcUtil;
import com.planett.learnt.java.controller.ChatPageController;
import com.planett.learnt.java.controller.MainController;
import com.planett.learnt.java.controller.CreateJoinTeamController;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;

public class MainApp extends Application {
    Stage stage=new Stage();
    FriendListItem friendListItem = new FriendListItem();

    MainController mainController;
    CreateJoinTeamController createJoinTeamController;
    CreateJoinTeamController joinTeamController;
    ChatPageController chatPageController;

    ObservableList observableList_friendList;
    ObservableList observableList_teamList;
    FXMLLoader fxmlLoader;
    FrdData frdData;
    @Override
    public void start(Stage primaryStage) throws Exception {


        // 加载fxml文件
        fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/com/planett/learnt/View/fxml/mainScene.fxml"));

        Parent root = fxmlLoader.load();

        // 获取controller
        mainController = fxmlLoader.getController();
        createJoinTeamController = mainController.getCreateTeamController();
        joinTeamController = mainController.getJoinTeamController();
        chatPageController = mainController.getChatPageController();

        mainController.getShowFriendList().setPlaceholder(new Label("没有好友"));
        mainController.getShowTeamList().setPlaceholder(new Label("班组为空"));

        // listView好友/班组列表可观察数据
        observableList_friendList = FXCollections.observableArrayList();
        observableList_teamList = FXCollections.observableArrayList();

        // 设置listView的observable
        mainController.getShowFriendList().setItems(observableList_friendList);
        mainController.getShowTeamList().setItems(observableList_teamList);

        // 初始化窗口
        initMain();

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
            try {
                addTeam();
            } catch (IOException e) {
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


    // 添加好友实现
    public void addFriend(){

        System.out.println("添加好友:" + mainController.getSearchFrd().getText() );
        try {
            if (mainController.getSearchFrd().getText()!="" && JdbcUtil.findUser(mainController.getSearchFrd().getText())){
                // 添加好友

                frdData = JdbcUtil.getFrdData(mainController.getSearchFrd().getText());
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
    public void  addTeam() throws IOException {
        System.out.println("添加班组");
//        System.out.println(  mainController.getCreateTeamController().getCreateTeamName_tf());
        mainController.getChatHomePane().setVisible(false);
        closeMainChatPage();
        // 显示创建班组页面
//        mainController.getShowPane().getChildren().add(createTeamLoader.load());
//        mainController.getShowPane().getChildren().add(createTeamController.getCreateTeam_page());
        createJoinTeamController.getCreateTeam_page().setVisible(true);
        // 添加群组按钮

        mainController.getCreateTeamController().getCreateTeam_btn().setOnAction(event -> {
            System.out.println("点击了添加群组");
            if (  createJoinTeamController.getCreateTeamName_tf().getText()!="" &&  createJoinTeamController.getInviteFriend_tf().getText()!=""){
                String teamId = UUID.randomUUID().toString().substring(0,5);
                // 创建班组实例
                TeamData teamData = new TeamData(teamId, createJoinTeamController.getCreateTeamName_tf().getText(), UserData.getCurrentAccount().getAccount());
                // 添加信息到数据库
                try {
                    JdbcUtil.createTeam(teamData.getTeamId(),teamData.getTeamName(),teamData.getTeamCreator());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                // 添加群组列表成员
                observableList_teamList.add(new TeamListItem(teamData.getTeamName()).getBorderPane());

            }else if (createJoinTeamController.getCreateTeamName_tf().getText()!="" ){
                String teamId = UUID.randomUUID().toString().substring(0,5);
                // 创建班组实例
                TeamData teamData = new TeamData(teamId, createJoinTeamController.getCreateTeamName_tf().getText(),UserData.getCurrentAccount().getAccount(), createJoinTeamController.getInviteFriend_tf().getText());
                // 添加信息到数据库
                try {
                    JdbcUtil.inviteToTeam(teamId, createJoinTeamController.getCreateTeamName_tf().getText());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                // 添加群组列表成员
                observableList_teamList.add(new Label(teamData.getTeamName()));
            }

        });


    }
    // 切换到搜索班组
    public void toJoinTeam(){
        createJoinTeamController.getToJoinTeam_btn().setOnAction(event -> {
            createJoinTeamController.getCreateTeam_page().setVisible(false);
            joinTeamController.getJoinTeam_page().setVisible(true);

        });
    }
    // 切换到创建群组
    public void toCreateTeam(){
        joinTeamController.getToSearchTeam_btn().setOnAction(event -> {
            joinTeamController.getJoinTeam_page().setVisible(false);
            createJoinTeamController.getCreateTeam_page().setVisible(true);
        });
    }

    // 选择班组进行进行聊天
    public void toChatPage() {
        System.out.println("点击");
        mainController.getShowTeamList().getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Object>() {
            @Override
            public void changed(ObservableValue<?> observable, Object oldValue, Object newValue) {
                System.out.println(newValue);
                closeMainChatPage();
                if ( !chatPageController.getShowChatMain_Page().isVisible())
                chatPageController.getShowChatMain_Page().setVisible(true);

                BorderPane borderPane = (BorderPane) newValue;
                Label teamName = (Label)borderPane.getTop();
                chatPageController.getShowChatItem().getItems().add(borderPane);
                System.out.println(teamName.getText());

            }
        });
    }

    // 关闭MainChat所有窗口
    public void closeMainChatPage(){
        if (mainController.getChatHomePane().isVisible() ){
            mainController.getChatHomePane().setVisible(false);
        }else if (createJoinTeamController.getCreateTeam_page().isVisible()){
            createJoinTeamController.getCreateTeam_page().setVisible(false);
        }else if ( joinTeamController.getJoinTeam_page().isVisible()){
            joinTeamController.getJoinTeam_page().setVisible(false);
        }
    }

    // 初始化窗口
    public void initMain(){
        UserData userData = UserData.getCurrentAccount();
        mainController.getShowInformation_label().setText(userData.getUserName());
        toCreateTeam();
        toJoinTeam();
        toChatPage();
    }

}
