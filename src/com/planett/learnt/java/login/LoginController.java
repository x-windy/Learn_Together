package com.planett.learnt.java.login;

import com.planett.learnt.Util.JdbcUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class LoginController {
    @FXML
    private PasswordField password_TextField;

    @FXML
    private Button login_Button;

    @FXML
    private TextField userName_TextField;


    @FXML
    void loginAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        JdbcUtil jdbcUtil = new JdbcUtil();

        if ( jdbcUtil.validate(userName_TextField.getText(),password_TextField.getText()) ){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

    }

}
