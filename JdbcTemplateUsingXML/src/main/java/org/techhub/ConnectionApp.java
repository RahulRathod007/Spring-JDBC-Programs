package org.techhub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ConnectionApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Conn.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("template");
		template.execute("insert into student values ('0', 'Rahul', 'rahul@gmail.com', '9876543210')");
		System.out.println("Record inserted successfully!");

	}
}
