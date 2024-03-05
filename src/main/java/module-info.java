module com.billsfx.billsfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.billsfx.billsfx to javafx.fxml;
    exports com.billsfx.billsfx;
}