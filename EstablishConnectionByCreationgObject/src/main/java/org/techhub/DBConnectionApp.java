package org.techhub;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBConnectionApp {
	public static void main(String[] args) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("rahul");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		if(dataSource!=null)
		{
			System.out.println("Database Connected...");
		}
		else
		{
			System.out.println("Database Not Connected...");
		}
	}
}
