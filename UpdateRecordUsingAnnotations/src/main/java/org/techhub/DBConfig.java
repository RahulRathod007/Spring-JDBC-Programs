package org.techhub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"org.techhub"})
public class DBConfig {
		
	@Bean(name = "datasource")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUsername("root");
		datasource.setPassword("rahul");
		datasource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return datasource;
	}
	
	@Bean(name = "template")
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(this.getDataSource());
		return template;
	}
}
