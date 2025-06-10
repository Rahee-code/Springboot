package MVC_JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;




public class RowMapperimpl implements RowMapper<User> {
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User st=new User();
		st.setName(rs.getString("name"));
		st.setNumber(rs.getInt("number"));
		st.setEmail(rs.getString("email"));
		st.setPwd(rs.getInt("pwd"));
		
		return st;
	}
	

}
