module com.example.university_simulator_system {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.university_simulator_system to javafx.fxml;
    exports com.example.university_simulator_system;
}