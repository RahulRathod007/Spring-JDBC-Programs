package org.techhub;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ClientConnectionApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		JdbcTemplate template = (JdbcTemplate)context.getBean("template");
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter name email and contact of Student");
		String name  = xyz.nextLine();
		String email = xyz.nextLine();
		String contact = xyz.nextLine();
		
		String sql = "INSERT INTO student(name, email, contact) VALUES (?, ?, ?)";
        int result = template.update(sql, name, email, contact);
        System.out.println(result + " record(s) saved successfully.");
	}
}
