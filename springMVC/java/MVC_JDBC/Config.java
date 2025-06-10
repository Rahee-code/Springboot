package MVC_JDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "MVC_JDBC")
public class Config {
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc1");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	
	@Bean
	public UserDaoImpl getDaoImpl()
	{
		UserDaoImpl daoImpl=new UserDaoImpl();
		return daoImpl;
	}
	
}