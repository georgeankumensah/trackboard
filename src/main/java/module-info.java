module com.inventory {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.sql;
  requires com.google.gson;

  opens com.inventory to javafx.fxml;

  exports com.inventory;
}
