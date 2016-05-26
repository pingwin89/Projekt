package pl.pawc.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class UserTest extends TestCase{

public UserTest(String testName){
    super(testName);
}

public static Test suite(){
    return new TestSuite(UserTest.class);
}

public void testUser(){
  User user = new User();
  user.setLogin("JohnDoe");
  user.setEmail("test@email.com");
  user.setLocation("USA");
  user.setHashedPass("!@#123");
  assertEquals("JohnDoe", user.getLogin());
  assertEquals("test@email.com", user.getEmail());
  assertEquals("USA", user.getLocation());
  assertEquals("!@#123", user.getHashedPass());
}

}