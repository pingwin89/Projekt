package pl.pawc.DAO;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import pl.pawc.model.User;

public class UserJDBCTemplate implements UserDAO{

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
   
  @Override  
  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
    this.jdbcTemplateObject = new JdbcTemplate(dataSource);
  }
  
  @Override
  public User getUser(int id) {
    String SQL = "Select * from User where id = ?";
    User user = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new UserMapper());
    return user;
  }

  @Override
  public void create(String login, String location, String email, String hashedPass) {
    String SQL = "Insert into User (login, location, email, hashedpass) values (?, ?, ?, ?)";
    jdbcTemplateObject.update(SQL, login, location, email, hashedPass);
    return;
  }
  
}