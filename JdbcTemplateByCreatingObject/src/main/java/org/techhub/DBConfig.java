package org.techhub;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBConfig {
	public static void main(String[] args) {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("rahul");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		if(dataSource!=null)
		{
			System.out.println("Database Connected...");
			JdbcTemplate template = new JdbcTemplate();
			template.setDataSource(dataSource);
			template.execute("insert into student values('0','Ram','ram@gmail.com','8765456765')	");
			System.out.println("Recond Save Successfully....");
		}
		else
		{
			System.out.println("Databse Not Connected...");
		}
	}
}
