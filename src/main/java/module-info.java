module org.iegb.draugr {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.iegb.draugr to javafx.fxml;
    exports org.iegb.draugr;
}