module com.disp.disp_ui {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.disp.disp_ui to javafx.fxml;
    exports com.disp.disp_ui;
}