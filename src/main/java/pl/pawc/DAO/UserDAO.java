package pl.pawc.DAO;

import javax.sql.DataSource;
import pl.pawc.model.User;

public interface UserDAO {
  public User getUser(int id);  
  public void setDataSource(DataSource ds);
  public void create(String login, String location, String email, String hashedPass);
}
