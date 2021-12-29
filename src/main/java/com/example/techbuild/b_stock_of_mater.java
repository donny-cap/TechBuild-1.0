package com.example.techbuild;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class b_stock_of_mater implements Initializable {

    @FXML
    private TableView<oop_materials> table_materials;

    @FXML
    private TableColumn<oop_materials, String> col_name;

    @FXML
    private TableColumn<oop_materials, Integer> col_quantity;

    ObservableList<oop_materials> listM;

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

    @FXML
    void max_quantity() throws Exception {

        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        ObservableList<oop_materials> list = FXCollections.observableArrayList();

        Connection con = connectionsql.getConnection();
        assert con != null;
        Statement st = con.createStatement();
        ResultSet data = st.executeQuery("SELECT * FROM `course_work`.materials order by (`quantity` + 0) desc;");
        while (data.next()) {
            list.add(new oop_materials(data.getInt("number"), data.getString("name"), data.getString("manufacturer"), data.getString("type"), data.getInt("quantity"), data.getInt("weight (kg)"), data.getInt("cost")));
        }
        table_materials.setItems(list);

    }

    @FXML
    void min_quantity() throws Exception {

        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        ObservableList<oop_materials> list = FXCollections.observableArrayList();

        Connection con = connectionsql.getConnection();
        assert con != null;
        Statement st = con.createStatement();
        ResultSet data = st.executeQuery("SELECT * FROM `course_work`.materials order by (`quantity` + 0);");
        while (data.next()) {
            list.add(new oop_materials(data.getInt("number"), data.getString("name"), data.getString("manufacturer"), data.getString("type"), data.getInt("quantity"), data.getInt("weight (kg)"), data.getInt("cost")));
        }
        table_materials.setItems(list);

    }

    @FXML
    void out_of_stock() throws Exception{

        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        ObservableList<oop_materials> list = FXCollections.observableArrayList();

        Connection con = connectionsql.getConnection();
        assert con != null;
        Statement st = con.createStatement();
        ResultSet data = st.executeQuery("SELECT * FROM `course_work`.materials where `quantity` = 0;");
        while (data.next()) {
            list.add(new oop_materials(data.getInt("number"), data.getString("name"), data.getString("manufacturer"), data.getString("type"), data.getInt("quantity"), data.getInt("weight (kg)"), data.getInt("cost")));
        }
        table_materials.setItems(list);

    }

    @FXML
    void show_all() throws Exception {
        UpdateTable();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            UpdateTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void UpdateTable() throws Exception {
        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));


        listM = connectionsql.getDatamaterials();
        table_materials.setItems(listM);
    }
}