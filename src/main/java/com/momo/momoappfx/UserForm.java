package com.momo.momoappfx;

import com.momo.momoappfx.app.AppController;
import com.momo.momoappfx.model.Gender;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class UserForm implements Initializable {

  @FXML
  private TextField fullName;

  @FXML
  private ComboBox gender;

  @FXML
  private TextField locationAddress;

  @FXML
  private Button cancel;

  @FXML
  private Button save;


  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    AppController.setInstance();
    gender.getItems().addAll(Gender.values());
  }

  @FXML
  public void onCancelClick() {
    fullName.clear();
    gender.setValue(null);
    locationAddress.clear();
  }

  @FXML
  public void onSaveClick() {
    String fn = fullName.getText();
    String gd = gender.getValue() == null ? "" : gender.getValue().toString();
    String lc = locationAddress.getText();
    AppController.createUser(fn, gd, lc);
    //System.out.println("Name: " + fn + "\nGender: " + gd + "\nLocation: " + lc);

  }
}
