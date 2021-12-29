package com.example.techbuild;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class b_info {

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

    @FXML
    void build_objects(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("b_build_objects.fxml", actionEvent);
    }

    @FXML
    void exit(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("main_login.fxml", actionEvent);
    }

    @FXML
    void finish_objects(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("b_finish_objects.fxml", actionEvent);
    }

    @FXML
    void finished_objects(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("b_finished_objects.fxml", actionEvent);
    }

    @FXML
    void info(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("b_info.fxml", actionEvent);
    }

    @FXML
    void list_mater(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("b_list_mater.fxml", actionEvent);
    }

    @FXML
    void order_mater(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("b_order_mater.fxml", actionEvent);
    }

    @FXML
    void search_mater(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("b_search_mater.fxml", actionEvent);
    }

    @FXML
    void stock_mater(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("b_stock_of_mater.fxml", actionEvent);
    }

}