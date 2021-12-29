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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class

b_finish_objects implements Initializable {

    @FXML
    private TableView<oop_objects> table_objects;

    @FXML
    private TableColumn<oop_objects, String> col_address;

    @FXML
    private TableColumn<oop_objects, String> col_company;

    @FXML
    private TableColumn<oop_objects, Integer> col_num;

    @FXML
    private TableColumn<oop_objects, String> col_objects;

    @FXML
    private TableColumn<oop_objects, Integer> col_square;

    ObservableList<oop_objects> listM;

    public void initialize(URL url, ResourceBundle rb){
        try {
            UpdateTable();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void UpdateTable() throws Exception {
        col_num.setCellValueFactory(new PropertyValueFactory<>("number"));
        col_objects.setCellValueFactory(new PropertyValueFactory<>("objects"));
        col_company.setCellValueFactory(new PropertyValueFactory<>("company"));
        col_address.setCellValueFactory(new PropertyValueFactory<>("address"));
        col_square.setCellValueFactory(new PropertyValueFactory<>("square"));

        listM = connectionsql.getDataobjects();
        table_objects.setItems(listM);
    }

    @FXML
    void finish() throws Exception {
        Connection con = connectionsql.getConnection();
        assert con != null;
        Statement statement = con.createStatement();
        ResultSet data = statement.executeQuery("SELECT * FROM `course_work`.`objects_constructing` where `number` = '" + table_objects.getSelectionModel().getSelectedItem().getNumber()+"';");
        if(data.next()){
            Date date = new Date();
            String time= new SimpleDateFormat("yyyy-MM-dd").format(date);
            statement.executeUpdate("INSERT INTO `course_work`.`finished_objects` (`objects`, `company`, `address`, `square (m2)`, `date`) VALUES ('"+data.getString("objects")+"', '"+data.getString("company")+"','"+data.getString("address")+"', '"+data.getString("square (m2)")+"', '"+time+"' );");
            statement.executeUpdate("DELETE FROM `course_work`.`objects_constructing` WHERE (`number` = '"+table_objects.getSelectionModel().getSelectedItem().getNumber()+"');");

            UpdateTable();

        }else{
            System.out.println("There is no such object");
        }

        data.close();
        statement.close();
        con.close();

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