package com.planett.learnt.java.controller;

import com.planett.learnt.java.Util.JdbcUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class RegisterController {
    @FXML
    private Label phoneInput_hint;

    @FXML
    private Label passwordInput_hint;

    @FXML
    private Button register_Button;

    @FXML
    private Button toLoginAccount_btn;

    @FXML
    private TextField userName_TextField;

    @FXML
    private PasswordField passwordConfirm_TextField;

    @FXML
    private Image login_background_image;

    @FXML
    private ImageView login_background;

    @FXML
    private TextField phoneNumber_TextField;

    @FXML
    private Label codeConfirm_hint;

    @FXML
    private Label accountInput_hint;

    @FXML
    private PasswordField password_TextField;

    @FXML
    private Label passwordConfirm_hint;

    private Stage stage;
    private Scene scene;
    private Parent root;
    static final int USER_NAME_LENGTH_MIN = 3;
    static final int USER_NAME_LENGTH_MAX = 40;

    // 返回登录界面
    @FXML
    void switchToLoginScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/planett/learnt/res/fxml/loginScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void registerAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        String userName = userName_TextField.getText();
        String phoneNumber = phoneNumber_TextField.getText();
        String password = passwordConfirm_TextField.getText();
        System.out.println("注册");
        if (JdbcUtil.register(userName,phoneNumber,password)){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }

    }



}
