package com.example.techbuild;

import javafx.event.ActionEvent;

import java.io.IOException;

public class menu_supp {


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