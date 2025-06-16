package org.techhub;

import java.sql.PreparedStatement;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ClientConnectionApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		JdbcTemplate template = (JdbcTemplate)context.getBean("template");
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Id of Student");
		int id = xyz.nextInt();
		int value = template.update("Delete from Student where id=?",(PreparedStatement ps)->{
			ps.setInt(1,id);
		});
		
		if(value>0)
		{
			System.out.println("Record Delete Success...");
		}
		else
		{
			System.out.println("Some Problem is there...");
		}
		
	}
}
