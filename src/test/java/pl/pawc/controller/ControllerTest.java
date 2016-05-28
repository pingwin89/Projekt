package pl.pawc.controller;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import pl.pawc.model.User;

public class ControllerTest extends TestCase{

public ControllerTest(String testName){
    super(testName);
}

public static Test suite(){
    return new TestSuite(ControllerTest.class);
}

public void testController(){
  User user = new User();
  user.setLogin("JohnDoe");
  user.setEmail("test@email.com");
  user.setLocation("USA");
  user.setHashedPass("!@#123");
  Controller controller = new Controller();
  controller.setUser(user);
  assertEquals(user.getLogin(), controller.getUser().getLogin());
  assertEquals(user.getLocation(), controller.getUser().getLocation());
  assertEquals(user.getEmail(), controller.getUser().getEmail());
  assertEquals(user.getHashedPass(), controller.getUser().getHashedPass());
}

}