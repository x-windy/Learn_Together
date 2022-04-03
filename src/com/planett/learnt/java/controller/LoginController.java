package com.planett.learnt.java.controller;

import com.planett.learnt.java.Util.JdbcUtil;
import com.planett.learnt.java.main.MainApp;
import com.planett.learnt.java.Model.UserData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

public class LoginController {
    /* password_TextField得到了FXML文件中<TextField fx:id="password_TextField">的引用。
     * @FXML标签和FXML文件内容对应,即便不加此标签也能正确执行，但private必须用到此标签。
     */
    @FXML
    private PasswordField password_TextField;

    @FXML
    private ImageView login_background;

    @FXML
    private Image login_background_image;

    @FXML
    private Button login_Button;

    @FXML
    private TextField account_TextField;

    @FXML
    private Label message;

    @FXML
    private RadioButton autoLogon;

    @FXML
    private Button toRegisterAccount_btn;

    @FXML
    private Button toLoginAccount_btn;

    @FXML
    private RadioButton rememberPassword;

    @FXML
    private Label forgetPassword;

    private boolean isRemember = false;
    private boolean isAutoLogon = false;
    private Stage stage;
    private Scene scene;
    private Parent root;

//
//    public void switchToRegisterScene(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("/com/planett/learnt/res/fxml/registerScene.fxml"));
//        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public void switchToLoginScene(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("/com/planett/learnt/res/fxml/loginScene.fxml"));
//        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }


    // 登录
    @FXML
    void loginAction(ActionEvent event) {

        if (account_TextField.getText().isEmpty() || password_TextField.getText().isEmpty()) {
            message.setText("账号或密码不能为空！");
        } else {
            try {
                // 连接数据库，检查账号是否正确
                // “!”验证失败测试主界面
                if (!JdbcUtil.validate(account_TextField.getText(), password_TextField.getText())) {
                    message.setText("登录成功！");
                    // 创建一个user实例
                    // User user = new User(account_TextField.getText(),password_TextField.getText());
                    // getCurrentAccount
                    UserData currentAccount = UserData.getCurrentAccount();
                    currentAccount.setAccount(account_TextField.getText());
                    currentAccount.setUserPassword(password_TextField.getText());
                    saveAccount(isRemember);

                    // 关闭当前窗口
                    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    stage.close();

                    // 生成主窗口,执行start
                    MainApp mainApp = new MainApp();
                    mainApp.showWindow();

                } else {
                    message.setText("登录失败！");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                message.setText("连接数据库失败！");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

    // 记住密码，生成账号信息文件
    private boolean saveAccount(boolean isRemember){
        if (isRemember) {
            File file = new File("/java/account.txt");// 创建文件保存账号信息
            String content = "account：" + account_TextField.getText() + " password：" + password_TextField.getText();// 获得要写入的字符串
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(file);// 创建文件输出流对象
                //设置文件的隐藏属性
                String set = "attrib +H " + file.getAbsolutePath();
                System.out.println(set);
                Runtime.getRuntime().exec(set);
                //将字符串写入到文件中
                fos.write(content.getBytes());
                return true;
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            } finally {
                try {
                    fos.close();// 关闭文件输出流
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return false;
    }


    // 记住密码单选框事件
    @FXML
    void rememberChange(ActionEvent event) {
        if(rememberPassword.isSelected()){
            System.out.println("记住密码");
            isRemember=true;
        }else {
            System.out.println("未记住密码");
            isRemember=false;
        }
    }


    // 自动登录单选框事件
    @FXML
    void autoLogonChange(ActionEvent event) {
        if (autoLogon.isSelected()){
            System.out.println("自登录");
            isAutoLogon = true;
        }else {
            isAutoLogon = false;
        }
    }

    // 跳转注册账号按钮事件
    @FXML
    void switchToRegisterScene(ActionEvent event) throws IOException {
        System.out.println("注册账号");
        root = FXMLLoader.load(getClass().getResource("/com/planett/learnt/View/fxml/registerScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void initialize(){

    }

    public Button getToRegisterAccount_btn() {
        return toRegisterAccount_btn;
    }

    public Button getToLoginAccount_btn() {
        return toLoginAccount_btn;
    }

    public Stage getStage() {
        return stage;
    }

    public Scene getScene() {
        return scene;
    }

    public Parent getRoot() {
        return root;
    }

    public RadioButton getAutoLogon() {
        return autoLogon;
    }

    public Button getToRegisterAccount() {
        return toRegisterAccount_btn;
    }

    public RadioButton getRememberPassword() {
        return rememberPassword;
    }

    public Label getForgetPassword() {
        return forgetPassword;
    }

    public boolean isRemember() {
        return isRemember;
    }

    public PasswordField getPassword_TextField() {
        return password_TextField;
    }

    public ImageView getLogin_background() {
        return login_background;
    }

    public Image getLogin_background_image() {
        return login_background_image;
    }

    public Button getLogin_Button() {
        return login_Button;
    }

    public TextField getUserName_TextField() {
        return account_TextField;
    }

    public Label getMessage() {
        return message;
    }

}
