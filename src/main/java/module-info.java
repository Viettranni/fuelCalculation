module com.example.fuelcalculation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fuelcalculation to javafx.fxml;
    exports com.example.fuelcalculation;
}