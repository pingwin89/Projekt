package pl.pawc.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import pl.pawc.model.User;

public class UserMapper implements RowMapper<User> {
   public User mapRow(ResultSet rs, int rowNum) throws SQLException {
      User user = new User();
      user.setId(rs.getInt("ID"));
      user.setLogin(rs.getString("LOGIN"));
      user.setLocation(rs.getString("LOCATION"));
      user.setEmail(rs.getString("EMAIL"));
      user.setHashedPass(rs.getString("HASHEDPASS"));
      return user;
   }
}