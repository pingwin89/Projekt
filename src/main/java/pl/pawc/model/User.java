package pl.pawc.model;

public class User{
  
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
 
}