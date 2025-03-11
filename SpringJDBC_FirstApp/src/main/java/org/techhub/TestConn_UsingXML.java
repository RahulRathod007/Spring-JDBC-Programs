package org.techhub;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConn_UsingXML {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conn.xml");
		DriverManagerDataSource datasource = (DriverManagerDataSource)context.getBean("conn");
		if(datasource!=null)
		{
			System.out.println("Database Connected....");
		}
		else
		{
			System.out.println("Database Not Connected...");
		}
	}

}
