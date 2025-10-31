module com.example.tempelate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tempelate to javafx.fxml;
    exports com.example.tempelate;
}