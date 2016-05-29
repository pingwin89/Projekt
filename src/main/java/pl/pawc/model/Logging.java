package pl.pawc.model;

public class Logging {
  
  public void beforeAdvice(){
    System.out.println("before advice: getLogin()");
  }
  
  public void afterAdvice(){
    System.out.println("after advice: getLogin()");
  }
  
}