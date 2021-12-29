package com.example.techbuild;

import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

import static java.util.Objects.requireNonNull;

public class LauncherPreloader extends Preloader {
    private Stage proloaderStage;
    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.proloaderStage = primaryStage;
        stg = primaryStage;
        primaryStage.initStyle(StageStyle.UNDECORATED);
        Parent root = FXMLLoader.load(requireNonNull(getClass().getResource("main_loading.fxml")));
        primaryStage.getIcons().add(new Image("file:///C:/TechBuild(1.0.2)/src/main/resources/com/png/buildings.png"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent root = FXMLLoader.load(requireNonNull(getClass().getResource(fxml)));
//        stg.getScene().setRoot(root);
        Scene scene = new Scene(root, 1200, 700);
        scene.getStylesheets().add(requireNonNull(Main.class.getResource("/com/styling/styling.css")).toExternalForm());
        stg.setResizable(false);
        stg.setTitle("TechBuild");
        stg.setScene(scene);
        stg.centerOnScreen();
        stg.show();
        stg.getIcons().add(new Image("file:///C:/TechBuild(1.0.2)/src/main/resources/com/png/buildings.png"));
    }

    @Override
    public void handleStateChangeNotification(StateChangeNotification info) {
        if (info.getType() == StateChangeNotification.Type.BEFORE_START) {
            proloaderStage.hide();
        }
    }
}
