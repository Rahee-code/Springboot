package MVC_JDBC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDaoImpl {
	RowMapperimpl mapperimpl=new RowMapperimpl();
	
	@Autowired
	private JdbcTemplate template;
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public boolean addStudent(User user) {
		// TODO Auto-generated method stub
		String q="insert into user values(?,?,?,?)";
		int x=template.update(q,user.getName(),user.getNumber(),user.getEmail(),user.getPwd());
		if(x>0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public boolean updateStudent(User user) {
		// TODO Auto-generated method stub
		String q="update user set number=? where name=?";
		int x=template.update(q,user.getNumber(),user.getName());
		if(x>0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean deleteStudent(User user) {
		// TODO Auto-generated method stub
		String q="delete from user where name=?";
		int x=template.update(q,user.getName());
		if(x>0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public List<User> viewStudent(User user) {
		// TODO Auto-generated method stub
		String q="select * from user";
		List<User> x=template.query(q,mapperimpl);
		return x;
		
		
	}

}
