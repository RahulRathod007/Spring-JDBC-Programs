package org.techhub;

import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ClientConnectionApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		JdbcTemplate template = (JdbcTemplate)context.getBean("template");
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Id Name Email Contact of Student");
		int id = xyz.nextInt();
		xyz.nextLine();
		String name = xyz.nextLine();
		String email = xyz.nextLine();
		String contact = xyz.nextLine();
		
		int value = template.update("update Student set name=?,email=?, contact=? where id=?", (PreparedStatement ps) -> {
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, contact);
			ps.setInt(4, id);
		});
		
		if(value>0)
		{
			System.out.println("Record Updated Success...");
		}
		else
		{
			System.out.println("Some Problem is there...");
		}

	}
}
