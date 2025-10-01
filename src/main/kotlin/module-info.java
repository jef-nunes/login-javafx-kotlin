module com.example.projetofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.projetofx to javafx.fxml;
    exports com.example.projetofx;
}
