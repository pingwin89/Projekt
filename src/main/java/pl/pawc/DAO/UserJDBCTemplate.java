package pl.pawc.DAO;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import pl.pawc.model.User;

public class UserJDBCTemplate implements UserDAO{

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    
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
  
}