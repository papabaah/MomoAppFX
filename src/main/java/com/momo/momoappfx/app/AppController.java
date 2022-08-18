package com.momo.momoappfx.app;

import com.momo.momoappfx.model.Gender;
import com.momo.momoappfx.model.User;
import com.momo.momoappfx.util.DBAccess;

import java.sql.SQLException;

public class AppController {

  private static AppController appInstance = null;

  private static DBAccess dao;

  public static void setInstance() {
    if(appInstance == null)
      appInstance = new AppController();
  }

  private AppController() {
    try {
      dao = new DBAccess();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void createUser(String fullName, String gender, String location) {
    try {
      User user = new User(fullName, Gender.valueOf(gender), location);
      dao.saveUser(user);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
