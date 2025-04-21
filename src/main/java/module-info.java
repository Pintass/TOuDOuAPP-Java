module java_toudouapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires jdk.compiler;
    requires java.desktop;

    opens com.example.java_toudouapp to javafx.fxml;
    exports modele;
    exports vue;
}