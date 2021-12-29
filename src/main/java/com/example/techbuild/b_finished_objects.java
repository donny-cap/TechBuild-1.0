package com.example.techbuild;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class b_finished_objects implements Initializable {

    @FXML
    private TableView<oop_finish_objects> table_finished;

    @FXML
    private TableColumn<oop_finish_objects, String> col_address;

    @FXML
    private TableColumn<oop_finish_objects, String> col_company;

    @FXML
    private TableColumn<oop_finish_objects, Date> col_date;

    @FXML
    private TableColumn<oop_finish_objects, String> col_name;

    @FXML
    private TableColumn<oop_finish_objects, Integer> col_num;

    @FXML
    private TableColumn<oop_finish_objects, Integer> col_square;

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


    ObservableList<oop_finish_objects> listM;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            UpdateTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void UpdateTable() throws Exception {
        col_num.setCellValueFactory(new PropertyValueFactory<>("number"));
        col_name.setCellValueFactory(new PropertyValueFactory<>("objects"));
        col_company.setCellValueFactory(new PropertyValueFactory<>("company"));
        col_address.setCellValueFactory(new PropertyValueFactory<>("address"));
        col_square.setCellValueFactory(new PropertyValueFactory<>("square"));
        col_date.setCellValueFactory(new PropertyValueFactory<>("date"));

        listM = connectionsql.getDatafobjects();
        table_finished.setItems(listM);
    }
}