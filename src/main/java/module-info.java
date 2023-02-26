module com.example.button {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.button to javafx.fxml;
    exports com.example.button;
}