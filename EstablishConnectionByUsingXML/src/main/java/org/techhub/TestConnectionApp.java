package org.techhub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConnectionApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Conn.xml");
		DriverManagerDataSource dataSource = (DriverManagerDataSource)context.getBean("conn");
		if(dataSource!=null)
		{
			System.out.println("Databse Connected....");
		}
		else
		{
			System.out.println("Databse Not Connected...");
		}
	}
}
