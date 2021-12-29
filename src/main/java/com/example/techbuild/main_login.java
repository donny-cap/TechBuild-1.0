package com.example.techbuild;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

import static javafx.application.Platform.exit;


public class main_login {

    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;


    public void signup(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("main_signup.fxml", actionEvent);
    }



    public void login(ActionEvent actionEvent) throws Exception {
        Connection ConnectionDB = connectionsql.getConnection();
        String log = String.valueOf(username.getText());
        String verifyLogin = "SELECT `password`, `login`, `account_type` FROM `course_work`.`user` where `login` = '"+ log +"';";

        assert ConnectionDB != null;
        Statement statement = ConnectionDB.createStatement();
        ResultSet data  = statement.executeQuery(verifyLogin);

        if (data.next()){
            String pas = String.valueOf(password.getText());
            String pasBD = data.getString("password");
            String ac_type = data.getString("account_type");
            Main m = new Main();
            if (pasBD.equals(pas)) {
                wrongLogIn.setText("Success!");
                if(ac_type.equals("Builder")){
                    m.changeScene("build_menu.fxml", actionEvent);
                }else if(ac_type.equals("Supplier")){
                    m.changeScene("supp_menu.fxml", actionEvent);
                }} else { wrongLogIn.setText("Wrong username or password!" ); }

        }else{ wrongLogIn.setText("There is no such username!"); }
    }


}
