//By creating object of DriverManagerDataSource class manually
package org.techhub;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConn_FirstApp {
	public static void main(String[] args) {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:mysql://localhost:3306/jdbc_pract");
		datasource.setUsername("root");
		datasource.setPassword("rahul");
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		if(datasource!=null)
		{
			System.out.println("Database Connected...");
		}
		else
		{
			System.out.println("Database Not Conneted...");
		}
	}
}
