module com.momo.momoappfx {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.web;

  requires com.dlsc.formsfx;
  requires validatorfx;
  requires org.kordamp.ikonli.javafx;
  requires org.kordamp.bootstrapfx.core;
  requires eu.hansolo.tilesfx;
  requires java.sql;

  opens com.momo.momoappfx to javafx.fxml;
  exports com.momo.momoappfx;
}