module com.sea.lommeregner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sea.lommeregner to javafx.fxml;
    exports com.sea.lommeregner;
}