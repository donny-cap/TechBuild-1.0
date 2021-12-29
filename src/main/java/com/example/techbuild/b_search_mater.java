package com.example.techbuild;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class b_search_mater implements Initializable {

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
    private TextField filterField;

    @FXML
    private TableView<oop_materials> table_materials;

    @FXML
    private TableColumn<oop_materials, Integer> col_cost;

    @FXML
    private TableColumn<oop_materials, String> col_manuf;

    @FXML
    private TableColumn<oop_materials, String> col_name;

    @FXML
    private TableColumn<oop_materials, Integer> col_num;

    @FXML
    private TableColumn<oop_materials, Integer> col_quantity;

    @FXML
    private TableColumn<oop_materials, String> col_type;

    @FXML
    private TableColumn<oop_materials, Integer> col_weight;

    ObservableList<oop_materials> listM;
    ObservableList<oop_materials> dataList;

    public void initialize(URL url, ResourceBundle rb){
        try {
            UpdateTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            search_user();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void UpdateTable() throws Exception {
        col_num.setCellValueFactory(new PropertyValueFactory<>("number"));
        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_manuf.setCellValueFactory(new PropertyValueFactory<>("manufacturer"));
        col_type.setCellValueFactory(new PropertyValueFactory<>("type"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        col_weight.setCellValueFactory(new PropertyValueFactory<>("weight"));
        col_cost.setCellValueFactory(new PropertyValueFactory<>("cost"));

        listM = connectionsql.getDatamaterials();
        table_materials.setItems(listM);
    }

    @FXML
    void search_user() {
        col_num.setCellValueFactory(new PropertyValueFactory<>("number"));
        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_manuf.setCellValueFactory(new PropertyValueFactory<>("manufacturer"));
        col_type.setCellValueFactory(new PropertyValueFactory<>("type"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        col_weight.setCellValueFactory(new PropertyValueFactory<>("weight"));
        col_cost.setCellValueFactory(new PropertyValueFactory<>("cost"));

        dataList = connectionsql.getDatamaterials();
        table_materials.setItems(dataList);

        FilteredList<oop_materials> filteredData = new FilteredList<>(dataList, b -> true);
        filterField.textProperty().addListener((observable, oldValue, newValue) -> filteredData.setPredicate(materials -> {
            if (newValue == null || newValue.isEmpty()) {
                return true;
            }
            String lowerCaseFilter = newValue.toLowerCase();

            if (materials.getName().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            } else if (materials.getManufacturer().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            }else if (materials.getType().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            }else if (String.valueOf(materials.getQuantity()).contains(lowerCaseFilter)) {
                return true;
            }else if (String.valueOf(materials.getWeight()).contains(lowerCaseFilter)) {
                return true;
            }else if (String.valueOf(materials.getCost()).contains(lowerCaseFilter)) {
                return true;
            }
            else return String.valueOf(materials.getNumber()).contains(lowerCaseFilter);
        }));
        SortedList<oop_materials> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(table_materials.comparatorProperty());
        table_materials.setItems(sortedData);
    }

}