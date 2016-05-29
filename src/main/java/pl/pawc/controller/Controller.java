package pl.pawc.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import pl.pawc.model.User;
import pl.pawc.view.View;

public class Controller{
  @FXML protected TextField login;
  @FXML protected TextField loc;
  @FXML protected TextField mail;
  @FXML protected TextField hashedPass;
  @FXML protected Button saveButton;
  @FXML protected Button loadButton;
  @FXML protected Button stopButton;
  @FXML protected Button startButton;
  @FXML protected Button customButton;
  protected User user;
  protected View view;
  
  public void initialize(){
         
    loadButton.setOnAction(event -> {
      load();
    });
    
    saveButton.setOnAction(event ->{
      save();
    }); 
    
    startButton.setOnAction(event ->{
      view.getContext().start();
    });
    
    stopButton.setOnAction(event ->{
      view.getContext().stop();
    });
    
    customButton.setOnAction(event ->{
      view.getCustomEventPublisher().publish();
    });
    
  }
  
  public void setUser(User user){
    this.user=user;
  }
  
  public User getUser(){
    return user;
  }
  
  public void setView(View view){
    this.view=view;
  }
  
  public View getView(){
    return view;
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