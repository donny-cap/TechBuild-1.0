module com.example.techbuild {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires itextpdf;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;
    requires java.datatransfer;
    requires java.desktop;


    opens com.example.techbuild to javafx.fxml;
    exports com.example.techbuild;
}