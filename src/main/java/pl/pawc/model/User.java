package pl.pawc.model;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class User implements ApplicationListener {
  
  private String login;
  private String hashedPass;
  private String email;
  private String location;

  public void setLogin(String login) {
    this.login = login;
  }

  public void setHashedPass(String hashedPass) {
    this.hashedPass = hashedPass;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getLogin() {
    return login;
  }

  public String getHashedPass() {
    return hashedPass;
  }

  public String getEmail() {
    return email;
  }

  public String getLocation() {
    return location;
  }
  
  @Override
  public void onApplicationEvent(ApplicationEvent e) {
    if(e instanceof ContextStartedEvent){
      login="started";
      email="started";
      location="started";
      hashedPass="started";
    }
    if(e instanceof ContextStoppedEvent){
      login="stopped";
      email="stopped";
      location="stopped";
      hashedPass="stopped";
    }
    if(e instanceof CustomEvent){
      login="custom";
      email="custom";
      location="custom";
      hashedPass="custom";
    }
  }
 
}