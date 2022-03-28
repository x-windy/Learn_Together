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
    // password_TextField得到了FXML文件中<TextField fx:id="password_TextField">的引用。
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
    /*
    *@FXML标签和FXML文件内容对应,即便不加此标签也能正确执行，但private必须用到此标签。
     */

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
        return userName_TextField;
    }

    public Label getMessage() {
        return message;
    }
}
