package com.example.techbuild;

import javafx.event.ActionEvent;

import java.io.IOException;

public class main_success_signup {

    public void confirm(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("main_login.fxml", actionEvent);
    }
}
