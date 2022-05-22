module com.example.pizza {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pizza to javafx.fxml;
    exports com.example.pizza;
}