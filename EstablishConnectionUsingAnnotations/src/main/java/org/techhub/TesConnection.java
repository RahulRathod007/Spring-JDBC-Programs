package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TesConnection {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		DriverManagerDataSource ds = (DriverManagerDataSource)context.getBean("datasource");
		if(ds!=null)
		{
			System.out.println("Databse Connected...");
		}
		else
		{
			System.out.println("Databse Not Connected...");
		}
	}
}
