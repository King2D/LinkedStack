module com.example.linkedstack {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.linkedstack to javafx.fxml;
    exports com.example.linkedstack;
}