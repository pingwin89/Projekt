package pl.pawc.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.pawc.model.User;

public class Controller {
  @FXML protected TextArea textArea;

  public void initialize(){
    
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringXMLConfig.xml");
    User user = (User) context.getBean("user");
    
    textArea.setText(((User) context.getBean("user")).getLogin());
  }
  
}
