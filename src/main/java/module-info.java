module space.imt.imt {
    requires javafx.controls;
    requires javafx.fxml;


    opens space.imt.imt to javafx.fxml;
    exports space.imt.imt;
}