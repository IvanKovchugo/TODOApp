module com.example.todoapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.ivan_kauchuha.todoapp to javafx.fxml;
    exports com.ivan_kauchuha.todoapp;
}