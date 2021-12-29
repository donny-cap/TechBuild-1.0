package com.example.techbuild;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class Main extends Application {
    private static Stage stg;


    public static Stage primaryStage = null;
    public static Scene primaryScene = null;


    @Override
    public void init() {
        InitPreloader init = new InitPreloader();
        init.checkFunctions();
    }

    @Override
    public void start(Stage primaryStage) {
        stg = primaryStage;
        Main.primaryStage = primaryStage;
    }

    public void changeScene(String fxml, ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
        Stage app = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        app.setScene(new Scene(root,1200, 700));
        app.show();
    }

    public static void main(String[] args) {
//        LauncherImpl.launchApplication(Main.class, launchPreloader.class, args);
        System.setProperty("javafx.preloader", LauncherPreloader.class.getCanonicalName());
        launch(args);

    }


}