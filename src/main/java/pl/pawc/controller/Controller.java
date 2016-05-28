package pl.pawc.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.pawc.model.User;

public class Controller {
  @FXML protected TextField login;
  @FXML protected TextField loc;
  @FXML protected TextField mail;
  @FXML protected TextField hashedPass;
  @FXML protected Button saveButton;
  @FXML protected Button loadButton;
  protected AbstractApplicationContext context;
  protected User user;

  
  public void initialize(){
     context = new ClassPathXmlApplicationContext("SpringXMLConfig.xml");
     user = (User) context.getBean("user");

     load();
    
    loadButton.setOnAction(event -> {
      load();
    });
    
    saveButton.setOnAction(event ->{
      save();
    });
    
  }
  
  public void load(){
    login.setText(user.getLogin());
    loc.setText(user.getLocation());
    mail.setText(user.getEmail());
    hashedPass.setText(user.getHashedPass());
  }
  
  public void save(){
    user.setLogin(login.getText());
    user.setLocation(loc.getText());
    user.setEmail(mail.getText());
    user.setHashedPass(hashedPass.getText());
  }

}