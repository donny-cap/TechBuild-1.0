package com.example.techbuild;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class s_info {

    @FXML
    private Hyperlink facebook;

    public void facebook(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://m.facebook.com/login.php?next=https%3A%2F%2Fm.facebook.com%2Fdeutschland.de%2F&ref=104&rs=1&lrs=1&rid=31292782350&lrid=31292782350&refsrc=deprecated"));
    }

    @FXML
    void twitter(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://twitter.com/wir_sind_INAI?t=yHkPtiyg_V7qmFHjWcVzWA&s=09"));
    }

    @FXML
    void youtube(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com"));
    }

    @FXML
    void instagram(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.instagram.com/inai.kg/?utm_medium=copy_link"));
    }

    public void exit(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("main_login.fxml", actionEvent);
    }

    public void list_mater(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("s_list_mater.fxml", actionEvent);
    }

    public void deliver_the_materials(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("s_deliver_mater.fxml", actionEvent);
    }

    public void required_to_deliver(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("s_req_to_deliver.fxml", actionEvent);
    }

    public void delivered_materials(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("s_delivered_mater.fxml", actionEvent);
    }

    public void percentage(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("s_percentage.fxml", actionEvent);
    }

    public void info(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("s_info.fxml", actionEvent);
    }

}