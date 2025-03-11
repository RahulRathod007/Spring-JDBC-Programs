package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConn_UsingAnnotations {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		DriverManagerDataSource ds = (DriverManagerDataSource)context.getBean("dataSource");
		if(ds!=null)
		{
			System.out.println("Database Connected...");
		}
		else
		{
			System.out.println("Database Not Connected...");
		}
	}
}
