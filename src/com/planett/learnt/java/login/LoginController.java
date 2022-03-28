package com.planett.learnt.java.login;

import com.planett.learnt.Util.JdbcUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.sql.SQLException;

public class LoginController {
    @FXML
    private PasswordField password_TextField;

    @FXML
    private ImageView login_background;

    @FXML
    private Image login_background_image;

    @FXML
    private Button login_Button;

    @FXML
    private TextField userName_TextField;

    @FXML
    private Label message;


    @FXML
    void loginAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        if (userName_TextField.getText().isEmpty()){
            message.setText("账号不能为空！");
        }

        JdbcUtil jdbcUtil = new JdbcUtil();
        if ( jdbcUtil.validate(userName_TextField.getText(),password_TextField.getText()) ){
            message.setText("登录成功！");
        }else {
            message.setText("登录失败！");
        }

    }
    public void initialize(){

    }

}
