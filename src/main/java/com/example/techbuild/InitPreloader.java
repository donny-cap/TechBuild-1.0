package com.example.techbuild;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static java.util.Objects.requireNonNull;

public class InitPreloader implements Initializable {

    public Label lblLoading;
    public static Label lblLoadingg;
    public Label lblpercent;
    public static Label lblpercentt;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblLoadingg=lblLoading;
        lblpercentt=lblpercent;
    }

    public void checkFunctions(){



        final String[] message = {""};
        Thread t1 = new Thread(() -> {
            message[0] = "16 %";
            Platform.runLater(() -> lblpercentt.setText(message[0]));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            message[0] = "28 %";
            Platform.runLater(() -> lblpercentt.setText(message[0]));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t3 = new Thread(() -> {
            message[0] = "34 %";
            Platform.runLater(() -> lblpercentt.setText(message[0]));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t4 = new Thread(() -> {
            message[0] = "46 %";
            Platform.runLater(() -> lblpercentt.setText(message[0]));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t5 = new Thread(() -> {
            message[0] = "57 %";
            Platform.runLater(() -> lblpercentt.setText(message[0]));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        Thread t6 = new Thread(() -> {
            message[0] = "63 %";
            Platform.runLater(() -> lblpercentt.setText(message[0]));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t7 = new Thread(() -> {
            message[0] = "74 %";
            Platform.runLater(() -> lblpercentt.setText(message[0]));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t8 = new Thread(() -> {
            message[0] = "85 %";
            Platform.runLater(() -> lblpercentt.setText(message[0]));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t9 = new Thread(() -> {
            message[0] = "95 %";
            Platform.runLater(() -> lblpercentt.setText(message[0]));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t10 = new Thread(() -> {
            message[0] = "99 %";
            Platform.runLater(() -> lblpercentt.setText(message[0]));

            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        Stage stage = new Stage();
                        Parent root = FXMLLoader.load(requireNonNull(getClass().getResource("main_login.fxml")));
                        Scene scene = new Scene(root,1200, 700);
                        scene.getStylesheets().add(requireNonNull(Main.class.getResource("/com/styling/styling.css")).toExternalForm());
                        stage.setResizable(false);
                        stage.setTitle("TechBuild");
                        stage.setScene(scene);
                        stage.centerOnScreen();
                        stage.show();
                        stage.getIcons().add(new Image("file:///C:/TechBuild(1.0.2)/src/main/resources/com/png/buildings.png"));
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        });

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
            t4.start();
            t4.join();
            t5.start();
            t5.join();
            t6.start();
            t6.join();
            t7.start();
            t7.join();
            t8.start();
            t8.join();
            t9.start();
            t9.join();
            t10.start();
            t10.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}